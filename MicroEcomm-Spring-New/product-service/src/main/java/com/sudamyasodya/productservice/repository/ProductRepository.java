package com.sudamyasodya.productservice.repository;

import com.sudamyasodya.productservice.model.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductRepository extends MongoRepository<Product,String> {
}
