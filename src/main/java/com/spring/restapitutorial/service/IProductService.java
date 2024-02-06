package com.spring.restapitutorial.service;

import com.spring.restapitutorial.entity.Product;

import java.util.List;

public interface IProductService {
    Product createProduct(Product product);

    List<Product> getAllProduct();

    Product getProductById(Long id);

    Product updateProduct(Long id, Product product);

    void deleteProduct(Long id);

}
