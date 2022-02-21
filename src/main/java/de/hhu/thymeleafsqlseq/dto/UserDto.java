package de.hhu.thymeleafsqlseq.dto;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

@Table("user")
public record UserDto (

        @Id
        Long id,
        @Column("firstname")
        String firstName,
        @Column("lastname")
        String lastName,
        String email,
        String password,
        Boolean active,
        String role
){

}
