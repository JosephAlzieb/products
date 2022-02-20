package de.hhu.thymeleafsqlseq.dto;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

@Table("product")
public record ProductDto (

        @Id
        Long id,
        String brand,
        float price,
        boolean isDeleted,
        String name,
        String productType

) {
}
