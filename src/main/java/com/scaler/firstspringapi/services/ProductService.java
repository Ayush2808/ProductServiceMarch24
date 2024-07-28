package com.scaler.firstspringapi.services;

import com.scaler.firstspringapi.model.Product;

import java.util.List;

public interface ProductService {
    Product getProductById(Long id);
    List<Product> getProductById();
    
    List<Product> getAllProduct();

    List<Product> getAllProducts();
    Product replaceProduct(Long id, Product product);
}
