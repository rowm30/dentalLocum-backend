package com.dentalLocum.Dental.Locum.service;

import com.dentalLocum.Dental.Locum.model.User;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


public interface UserService {

    // Create a new user
    User createUser(User user);

    // Update an existing user
    User updateUser(User user);

    // Retrieve a user by their ID
    Optional<User> getUserById(Long id);

    // Retrieve all users
    List<User> getAllUsers();

    // Delete a user by their ID
    void deleteUser(Long id);
}
