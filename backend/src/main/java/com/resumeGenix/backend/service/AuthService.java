package com.resumeGenix.backend.service;

import com.resumeGenix.backend.model.User;
import com.resumeGenix.backend.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuthService {

    @Autowired
    private UserRepository userRepository;

    public User register(User user) {
        // Registration logic
        return userRepository.save(user);
    }

    public User login(User user) {
        // Login logic
        return userRepository.findByEmailAndPassword(user.getEmail(), user.getPassword());
    }
}
