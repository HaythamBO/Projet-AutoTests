package com.example.projetstage.service;

import com.example.projetstage.model.User;
import com.example.projetstage.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public void insertUser(User user) {
        userRepository.save(user);
    }
}
