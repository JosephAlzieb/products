package de.hhu.thymeleafsqlseq.controllers;

import de.hhu.thymeleafsqlseq.domain.Product;
import de.hhu.thymeleafsqlseq.services.ProductService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

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

    @ModelAttribute("product")
    Product getProduct(){
        return new Product("",0.0f,"","");
    }
}
