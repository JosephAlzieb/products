package de.hhu.thymeleafsqlseq.dto;

import de.hhu.thymeleafsqlseq.domain.User;
import org.springframework.data.annotation.Id;

public record UserDto (

        @Id Long id,
        String firstName,
        String lastName,
        String email,
        String password,
        Boolean active,
        String role
){

}
