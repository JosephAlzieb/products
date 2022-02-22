package de.hhu.thymeleafsqlseq.repositories;
import de.hhu.thymeleafsqlseq.domain.Product;

import java.util.List;

public interface ProductRepository {
    Product findProductById(Long id);
    void saveProduct (Product product);
    List<Product> findAllProducts();
}