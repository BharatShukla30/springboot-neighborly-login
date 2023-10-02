package com.neighborly.origin.repository;

import com.neighborly.origin.entity.UserRegister;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface UserRepository extends MongoRepository<UserRegister, String> {
    Optional<UserRegister> findByUsername(String username);
}
