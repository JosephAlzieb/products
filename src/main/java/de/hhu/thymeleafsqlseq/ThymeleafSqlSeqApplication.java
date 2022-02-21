package de.hhu.thymeleafsqlseq;

import de.hhu.thymeleafsqlseq.domain.Product;
import de.hhu.thymeleafsqlseq.domain.User;
import de.hhu.thymeleafsqlseq.services.ProductService;
import de.hhu.thymeleafsqlseq.services.UserService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
@SpringBootApplication
public class ThymeleafSqlSeqApplication implements CommandLineRunner{

    private ProductService service;

    public ThymeleafSqlSeqApplication(ProductService service) {
        this.service = service;
    }

    public static void main(String[] args) {
        SpringApplication.run(ThymeleafSqlSeqApplication.class, args);
    }


    @Override
    public void run(String... args) throws Exception {
        Product product = new Product("ZZ", 10.90f, "t-shirt","Kleidung");
        service.saveProduct(product);
    }

}
