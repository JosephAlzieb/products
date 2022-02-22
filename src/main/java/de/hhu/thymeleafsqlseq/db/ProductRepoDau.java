package de.hhu.thymeleafsqlseq.db;

import de.hhu.thymeleafsqlseq.dto.ProductDto;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ProductRepoDau extends CrudRepository<ProductDto, Long> {

    List<ProductDto> findAll();
}
