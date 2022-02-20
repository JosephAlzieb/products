package de.hhu.thymeleafsqlseq.db;

import de.hhu.thymeleafsqlseq.dto.UserDto;
import org.springframework.data.repository.CrudRepository;

public interface UserRepoDau extends CrudRepository<UserDto, Long> {

    UserDto findUserByEmail (String email);
}
