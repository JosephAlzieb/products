package de.hhu.thymeleafsqlseq.dto;

public record ProductDto (

        Long id,
        String brand,
        float price,
        boolean isDeleted,
        String name,
        String productType

) {
}
