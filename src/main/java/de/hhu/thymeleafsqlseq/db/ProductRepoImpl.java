package de.hhu.thymeleafsqlseq.db;

import de.hhu.thymeleafsqlseq.domain.Product;
import de.hhu.thymeleafsqlseq.dto.ProductDto;
import de.hhu.thymeleafsqlseq.repositories.ProductRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.stream.Collectors;

@Repository
public class ProductRepoImpl implements ProductRepository {
    
    private ProductRepoDau repoDau;

    public ProductRepoImpl(ProductRepoDau repoDau) {
        this.repoDau = repoDau;
    }

    @Override
    public Product findProductById(Long id) {
        ProductDto dto = repoDau.findById(id).get();
        Product product = getPoduct(dto);
        return product;
    }

    @Override
    public void saveProduct(Product product) {
        ProductDto dto = getDto(product);
        repoDau.save(dto);
    }

    @Override
    public List<Product> findAllProducts() {
        return repoDau.findAll().stream().map(dto -> getPoduct(dto)).collect(Collectors.toList());
    }

    @Override
    public void deleteProduct(Long id) {
        repoDau.deleteById(id);
    }

    private ProductDto getDto(Product product) {
        return new ProductDto(null, product.getBrand(), product.getPrice(), product.getIsDeleted(), product.getName(), product.getProductType());
    }


    private Product getPoduct(ProductDto dto) {
         Product product = new Product(dto.brand(), dto.price(), dto.name(), dto.productType());
         product.setId(dto.id());
         return product;
    }
}
