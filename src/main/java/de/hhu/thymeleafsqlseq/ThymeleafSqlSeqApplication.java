package de.hhu.thymeleafsqlseq;

import de.hhu.thymeleafsqlseq.domain.User;
import de.hhu.thymeleafsqlseq.services.UserService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class ThymeleafSqlSeqApplication implements CommandLineRunner{

    private UserService userService;

    public ThymeleafSqlSeqApplication(UserService userService) {
        this.userService = userService;
    }

    public static void main(String[] args) {
        SpringApplication.run(ThymeleafSqlSeqApplication.class, args);
    }


    @Override
    public void run(String... args) throws Exception {
        User user1 = new User("joe1", "az", "joe1.hhu.de", "1122", "user");
        User user2 = new User("joe2", "az", "joe2.hhu.de", "1122", "admin");
        User user3 = new User("joe3", "az", "joe3.hhu.de", "1122", "user");
        userService.saveUser(user1);
        userService.saveUser(user2);
        userService.saveUser(user3);

    }

}
