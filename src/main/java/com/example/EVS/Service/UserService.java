package com.example.EVS.Service;

import com.example.EVS.Model.User;
import com.example.EVS.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    // Register User
    public User registerUser(User user) {
        return userRepository.save(user);
    }

    // View all Users
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }
}
