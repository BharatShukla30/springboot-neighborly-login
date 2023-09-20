package com.neighborly.origin.repository;

import com.neighborly.origin.entity.UserRegister;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<UserRegister, String> {
    // Additional custom query methods can be defined here
}

