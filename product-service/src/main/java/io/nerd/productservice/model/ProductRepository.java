package io.nerd.productservice.model;

import io.nerd.productservice.repository.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductRepository extends MongoRepository<Product,String> {

}
