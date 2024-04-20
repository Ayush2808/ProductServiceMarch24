package com.scaler.firstspringapi.controller;
import com.scaler.firstspringapi.model.Product;

import com.scaler.firstspringapi.services.ProductService;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController // This controller is going to host HTTP API'S
@RequestMapping("/products")


public class ProductController {
    private ProductService productService;
    ProductController(ProductService productService){
        this.productService = productService;
    }
    //localhost:8080
    @GetMapping("/{id}")
    public Product getProductById(@PathVariable("id") Long id){
        return productService.getProductById(id);

    }
    @GetMapping()
    public List<Product> getProductsById(){
        return new ArrayList<>();
    }

}
