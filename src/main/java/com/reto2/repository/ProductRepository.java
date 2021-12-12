/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.reto2.repository;

/**
 *
 * @author Male
 */
import com.reto2.model.Product;
import com.reto2.repository.crud.ProductCrudRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class ProductRepository {
    @Autowired
    private ProductCrudRepository productCrudRepository;

    public List<Product> getAll(){
        return productCrudRepository.findAll();
    }

    public Optional<Product> getProduct(String id){
        return productCrudRepository.findById(id);
    }

    public Product create(Product product){
        return productCrudRepository.save(product);
    }

    public void update(Product product){
        productCrudRepository.save(product);
    }

    public void delete(Product product){
        productCrudRepository.delete(product);
    }
}
