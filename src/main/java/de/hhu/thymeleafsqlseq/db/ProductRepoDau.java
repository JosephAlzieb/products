package de.hhu.thymeleafsqlseq.db;

import de.hhu.thymeleafsqlseq.domain.Product;
import org.springframework.data.repository.CrudRepository;

public interface ProductRepoDau extends CrudRepository<Product, Long> {
}
