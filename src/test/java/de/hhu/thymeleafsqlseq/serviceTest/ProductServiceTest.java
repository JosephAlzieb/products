package de.hhu.thymeleafsqlseq.serviceTest;

import de.hhu.thymeleafsqlseq.domain.Product;
import de.hhu.thymeleafsqlseq.repositories.ProductRepository;
import de.hhu.thymeleafsqlseq.services.ProductService;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;

public class ProductServiceTest {

    ProductRepository productRepository = mock(ProductRepository.class);
    @Test
    @DisplayName("Product kann anhand seiner Id gefunden werden")
    void test_1(){
        ProductService productService = new ProductService(productRepository);
        Product product = new Product("zz", 11.50f, "Hose", "Kleidung");
        when(productRepository.findProductById(anyLong())).thenReturn(product);

        productService.getProduct(1);
        verify(productRepository).findProductById(anyLong());
    }
}
