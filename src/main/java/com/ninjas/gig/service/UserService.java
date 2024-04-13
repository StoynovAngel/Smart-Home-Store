package com.ninjas.gig.service;

import com.ninjas.gig.entity.Product;
import com.ninjas.gig.entity.UserType;
import com.ninjas.gig.entity.UserAccount;
import com.ninjas.gig.repository.UserRepository;
import jakarta.persistence.Column;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    // методи за OrderService
    public UserAccount getUserById(Long userId) {
        return userRepository.findById(userId)
                .orElseThrow(() -> new IllegalArgumentException("User not found with id: " + userId));
    }

    // клиент



    // служител
    public List<UserAccount> getAllUsers() {
        return userRepository.findAll();
    }


    // админ

}
