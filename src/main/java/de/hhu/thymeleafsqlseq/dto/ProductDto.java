package de.hhu.thymeleafsqlseq.dto;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

@Table("product")
public record ProductDto (

        @Id
        Long id,
        String brand,
        float price,
        @Column("isdeleted")
        boolean isDeleted,
        String name,
        @Column("producttype")
        String productType

) {
}
