package de.hhu.thymeleafsqlseq.db;

import de.hhu.thymeleafsqlseq.domain.User;
import de.hhu.thymeleafsqlseq.dto.UserDto;
import de.hhu.thymeleafsqlseq.repositories.UserRepository;

public class UserRepoImpl implements UserRepository {

    private UserRepoDau repoDau;

    public UserRepoImpl(UserRepoDau repoDau) {
        this.repoDau = repoDau;
    }

    @Override
    public User findByEmail(String email) {
        UserDto dto = repoDau.findUserByEmail(email);
        User user = new User(dto.firstName(), dto.lastName(), dto.email(),dto.password(), dto.role());
        return user;
    }

    @Override
    public void save(User user) {
        UserDto userDto = new UserDto(null, user.getFirstName(),user.getLastName(), user.getEmail(),user.getPassword(),user.getActive(), user.getRoles());
        repoDau.save(userDto);
    }
}
