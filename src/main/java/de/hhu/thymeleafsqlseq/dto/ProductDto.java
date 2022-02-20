package de.hhu.thymeleafsqlseq.dto;

import org.springframework.data.annotation.Id;

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
