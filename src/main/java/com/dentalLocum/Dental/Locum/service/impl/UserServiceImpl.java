package com.dentalLocum.Dental.Locum.service.impl;

import com.dentalLocum.Dental.Locum.model.User;
import com.dentalLocum.Dental.Locum.repo.UserRepository;
import com.dentalLocum.Dental.Locum.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public User createUser(User user) {

        User local = this.userRepository.findByEmail(user.getEmail());

        if (local != null) {
            System.out.println("User already exists");
            throw new RuntimeException("User already exists");
        }else {
            local = this.userRepository.save(user);
        }
        return local;
    }
}
