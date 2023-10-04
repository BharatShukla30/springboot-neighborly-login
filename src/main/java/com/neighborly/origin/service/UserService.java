package com.neighborly.origin.service;

import com.neighborly.origin.entity.UserRegister;
import com.neighborly.origin.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    private final UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<UserRegister> getAllUsers() {
        return userRepository.findAll();
    }

    public UserRegister saveUser(UserRegister userRegister) {
        return userRepository.save(userRegister);
    }




    // Other service methods
}
