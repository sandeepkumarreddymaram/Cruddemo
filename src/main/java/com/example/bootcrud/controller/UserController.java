package com.example.bootcrud.controller;


import com.example.bootcrud.model.User;
import com.example.bootcrud.userrepo.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
    @RequestMapping("/users")
    public class UserController {
        @Autowired
        private UserRepository userRepository;

        @GetMapping("/viewuser")
        public List<User> getAllUsers() {
            return userRepository.findAll();
        }

        @PostMapping("/filluser")
        public User createUser(@RequestBody User user) {
            return userRepository.save(user);
        }
    }


