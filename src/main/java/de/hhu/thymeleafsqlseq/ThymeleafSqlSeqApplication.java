package de.hhu.thymeleafsqlseq;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class ThymeleafSqlSeqApplication {

    public static void main(String[] args) {
        SpringApplication.run(ThymeleafSqlSeqApplication.class, args);
    }

}
