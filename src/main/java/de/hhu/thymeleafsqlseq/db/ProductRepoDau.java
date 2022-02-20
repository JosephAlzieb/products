package de.hhu.thymeleafsqlseq.db;

import de.hhu.thymeleafsqlseq.dto.ProductDto;
import org.springframework.data.repository.CrudRepository;

public interface ProductRepoDau extends CrudRepository<ProductDto, Long> {
}
