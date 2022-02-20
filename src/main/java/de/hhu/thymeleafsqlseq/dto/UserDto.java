package de.hhu.thymeleafsqlseq.dto;

import org.springframework.data.annotation.Id;

public record UserDto (

        @Id Long id,
        String firstName,
        String lastName,
        String email,
        String password,
        Boolean active,
        int role
){
}
