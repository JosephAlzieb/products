package de.hhu.thymeleafsqlseq.repositories;


import de.hhu.thymeleafsqlseq.domain.User;

public interface UserRepository {
    User findByEmail(String email);

    void save(User user);
}