package com.reto2.repository.crud;

/**
 *
 * @author Male
 */
import com.reto2.model.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductCrudRepository extends MongoRepository<Product,String> {

}

