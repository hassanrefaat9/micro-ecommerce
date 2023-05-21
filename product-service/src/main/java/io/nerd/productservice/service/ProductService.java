/**
 * @author Hassan Refaat <hassan.refaat.dev@gmail.com>
 * @Created 5/20/2023 6:24 PM
 */
package io.nerd.productservice.service;

import io.nerd.productservice.dto.ProductRequest;
import io.nerd.productservice.dto.ProductResponse;
import io.nerd.productservice.model.ProductRepository;
import io.nerd.productservice.repository.Product;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
@Slf4j
public class ProductService {
    private final ProductRepository productRepository;

    public void createProduct(ProductRequest request) {
        var product = Product.builder()
                .name(request.name())
                .description(request.description())
                .price(request.price())
                .build();

        productRepository.save(product);
        log.info("Product {} is saved", product.getId());
    }

    public List<ProductResponse> getAllProducts() {
        List<Product> products = productRepository.findAll();
        return products.stream().map(this::mapToProductResponse)
                .toList();
    }

    private ProductResponse mapToProductResponse(Product product) {
        return new ProductResponse(
                product.getId(),
                product.getName(),
                product.getDescription(),
                product.getPrice());
    }
}
