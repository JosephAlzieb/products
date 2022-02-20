package de.hhu.thymeleafsqlseq.repositories;
import de.hhu.thymeleafsqlseq.domain.Product;

public interface ProductRepository {
    Product getProductById(Long id);
}