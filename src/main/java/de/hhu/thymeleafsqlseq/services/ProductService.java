package de.hhu.thymeleafsqlseq.services;


import de.hhu.thymeleafsqlseq.domain.Product;
import de.hhu.thymeleafsqlseq.repositories.ProductRepository;

public class ProductService {
    private ProductRepository repository;

    public ProductService(ProductRepository repository) {
        this.repository = repository;
    }

    public Product getProduct (long id){
        return repository.findProductById(id);
    }
}
