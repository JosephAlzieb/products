package de.hhu.thymeleafsqlseq.services;


import de.hhu.thymeleafsqlseq.domain.Product;
import de.hhu.thymeleafsqlseq.repositories.ProductRepository;
import org.springframework.stereotype.Service;

@Service
public class ProductService {
    private ProductRepository repository;

    public ProductService(ProductRepository repository) {
        this.repository = repository;
    }

    public Product getProduct (long id){
        return repository.findProductById(id);
    }

    public void saveProduct (Product product){
        repository.saveProduct(product);
    }
}
