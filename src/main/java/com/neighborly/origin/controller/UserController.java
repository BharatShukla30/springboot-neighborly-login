package com.neighborly.origin.controller;
import com.neighborly.origin.entity.UserRegister;
import com.neighborly.origin.model.UserLogin;
import com.neighborly.origin.model.UserRegistrationRequest;
import com.neighborly.origin.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {
    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;
    @Autowired
    public UserController(UserRepository userRepository, PasswordEncoder passwordEncoder) {
        this.userRepository = userRepository;
        this.passwordEncoder = passwordEncoder;
    }
    @RequestMapping("/register")
    public ResponseEntity registerUser(@RequestBody UserRegistrationRequest request) {
        String username = request.getUsername();
        String password = request.getPassword();
        String email = request.getEmail();
        String id = request.getId();

        String hashedPassword = passwordEncoder.encode(password);

        // TODO: Save the user to the database or perform other necessary operations
        UserRegister userRegister = new UserRegister();
        userRegister.setId(id);
        userRegister.setUsername(username);
        userRegister.setPassword(password);
        userRegister.setEmail(email);
        try {
            userRepository.save(userRegister);
        }
        catch (Exception e){
            return new ResponseEntity<>(e.toString(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
        return new ResponseEntity<>(String.format("%s user registered successfully", username), HttpStatus.OK);
    }

    @RequestMapping("/login")
    public ResponseEntity loginUser(@RequestBody UserLogin userLogin){
        userLogin.getUserName();
        return new ResponseEntity<>("Login successful", HttpStatus.OK);
    }

}


