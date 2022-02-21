package de.hhu.thymeleafsqlseq;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
@SpringBootApplication
public class ThymeleafSqlSeqApplication implements CommandLineRunner{

    public static void main(String[] args) {
        SpringApplication.run(ThymeleafSqlSeqApplication.class, args);
    }


    @Override
    public void run(String... args) throws Exception {

    }

}
