/**
 * @author Hassan Refaat <hassan.refaat.dev@gmail.com>
 * @Created 5/21/2023 7:29 AM
 */
package io.nerd.productservice.service;


import io.nerd.productservice.dto.ProductResponse;
import io.nerd.productservice.model.ProductRepository;
import io.nerd.productservice.repository.Product;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.mockito.Mockito.*;
@ExtendWith(MockitoExtension.class)
class ProductServiceTest {

    @Mock
    private ProductRepository productRepository;
    @InjectMocks
    private ProductService productService;

    @Test
    void canFindAllProducts(){
        productService.getAllProducts();
        verify(productRepository).findAll();
    }

}
