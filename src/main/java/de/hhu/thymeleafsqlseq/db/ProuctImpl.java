package de.hhu.thymeleafsqlseq.db;

import de.hhu.thymeleafsqlseq.domain.Product;
import de.hhu.thymeleafsqlseq.dto.ProductDto;
import de.hhu.thymeleafsqlseq.repositories.ProductRepository;

public class ProuctImpl implements ProductRepository {

    private ProductRepoDau repoDau;

    public ProuctImpl(ProductRepoDau repoDau) {
        this.repoDau = repoDau;
    }

    @Override
    public Product findProductById(Long id) {
        ProductDto dto = repoDau.findById(id).get();

        Product product = new Product(dto.id(),dto.brand(),dto.price(),dto.isDeleted(),dto.name(),dto.productType());

        return product;
    }
}
