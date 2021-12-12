package com.reto2.repository.crud;

/**
 *
 * @author Male
 */
import com.reto2.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import java.util.Optional;

public interface UserCrudRepository extends MongoRepository<User,Integer> {
    Optional<User> findByEmail(String email);
    Optional<User> findByEmailAndPassword(String email, String password);
    Optional<User> findByNameOrEmail(String name, String email);
}

