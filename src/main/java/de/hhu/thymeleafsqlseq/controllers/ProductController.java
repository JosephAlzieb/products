package de.hhu.thymeleafsqlseq.controllers;

import de.hhu.thymeleafsqlseq.domain.Product;
import de.hhu.thymeleafsqlseq.services.ProductService;
import org.springframework.security.access.annotation.Secured;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.oauth2.core.user.OAuth2User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/product")
public class ProductController {

    private ProductService service;

    public ProductController(ProductService service) {
        this.service = service;
    }

    @GetMapping("/list")
    public String getProducts(Model model) {
        List<Product> allProducts = service.getAllProducts();
        model.addAttribute("listProducts", allProducts);
        return "listProducts";
    }

    @GetMapping("/save")
    public String getFormToSaveProducts(){
        return "saveProduct";
    }

    @PostMapping("/save")
    public String saveProduct(@ModelAttribute("product") Product product, Model model){
        service.saveProduct(product);
        return "redirect:/product/list";
    }

    @GetMapping("/delete/{id}")
    public String delete(@PathVariable("id") Long id, @AuthenticationPrincipal OAuth2User principal, Model model ){
        if(principal.getAuthorities().contains("ROLE_ADMIN")){
            model.addAttribute("id", id);
            return "redirect:/product/deleteProduct/{id}";
        }
        String msg = "you are not an Admin, so you can not delete anything";
        model.addAttribute("listProducts", service.getAllProducts());
        model.addAttribute("error", msg);
        return"listProducts";
    }

    @Secured("ROLE_ADMIN")
    @GetMapping("/deleteProduct/{id}")
    public String deleteProduct(@PathVariable("id") Long id, @AuthenticationPrincipal OAuth2User principal){
        if(principal.getAuthorities().contains("ROLE_ADMIN")){
            service.deleteProduct(id);
            return "redirect:/product/list";
        }

        return"redirect:/product/list";
    }

    @ModelAttribute("product")
    Product getProduct(){
        return new Product("",0.0f,"","");
    }
}
