package de.hhu.thymeleafsqlseq.repositories;


import de.hhu.thymeleafsqlseq.domain.User;
import de.hhu.thymeleafsqlseq.dto.UserDto;

public interface UserRepository {
    User findByEmail(String email);

    void save(UserDto userDto);
}