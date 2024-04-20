package com.scaler.firstspringapi.services;

import com.scaler.firstspringapi.Dto.FakeStoreProductDto;
import com.scaler.firstspringapi.model.Category;
import com.scaler.firstspringapi.model.Product;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Component;
import org.springframework.web.client.HttpMessageConverterExtractor;
import org.springframework.web.client.RequestCallback;


import java.util.List;
import java.util.ArrayList;
@Service

public class FakeStoreProductService implements ProductService{
    private RestTemplate restTemplate;
    FakeStoreProductService(RestTemplate restTemplate){
        this.restTemplate = restTemplate;
    }
    private Product convertFakeStoreDtoProduct(FakeStoreProductDto dto){
        Product product = new Product();
        product.setId(dto.getId());
        product.setTitle(dto.getTitle());
        product.setPrice(dto.getPrice());
        product.setDescription(dto.getDescription());
        product.setImage(dto.getImage());

        Category category = new Category();
        category.setDescription(dto.getCategory());
        product.setCategory(category);
        return product;




    }
    @Override
    public Product getProductById(Long id) {
        FakeStoreProductDto fakeStoreProductDto =
        restTemplate.getForObject("https://fakestoreapi.com/products/1" + id,
                FakeStoreProductDto.class);

        if(fakeStoreProductDto == null){
            return null;
        }

        return convertFakeStoreDtoProduct(fakeStoreProductDto);

    }

    @Override
    public List<Product> getProductById() {
        return null;
    }
}


