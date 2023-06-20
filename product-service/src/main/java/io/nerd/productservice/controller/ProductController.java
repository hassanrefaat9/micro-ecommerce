/**
 * @author Hassan Refaat <hassan.refaat.dev@gmail.com>
 * @Created 5/20/2023 6:19 PM
 */
package io.nerd.productservice.controller;


import io.nerd.productservice.dto.ProductRequest;
import io.nerd.productservice.dto.ProductResponse;
import io.nerd.productservice.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/product")
@RequiredArgsConstructor
public class ProductController {
    private final ProductService productService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void createProduct(@RequestBody ProductRequest request){
        productService.createProduct(request);
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<ProductResponse> getAllProducts(){
        return productService.getAllProducts();
    }
}
