package de.hhu.thymeleafsqlseq.serviceTest;

import de.hhu.thymeleafsqlseq.domain.User;
import de.hhu.thymeleafsqlseq.repositories.UserRepository;
import de.hhu.thymeleafsqlseq.services.UserService;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;

public class UserServiceTest {

    UserRepository userRepository = mock(UserRepository.class);
    @Test
    @DisplayName("User kann anhand seiner Email gefunden werden")
    void test_1(){
        UserService userService = new UserService(userRepository);
        User user = new User("joe4", "az", "email", "1121", "user");
        when(userRepository.findByEmail(anyString())).thenReturn(user);

        User email = userService.findByEmail("email");

        verify(userRepository).findByEmail(anyString());
    }
}
