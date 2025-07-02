package com.pahanaedu.billing.services;

import com.pahanaedu.billing.models.User;

import java.util.ArrayList;
import java.util.List;

public class LoginService {
    private final List<User> users;

    public LoginService() {
        users = new ArrayList<>();
        users.add(new User("admin", "1234", "admin"));
        users.add(new User("staff1", "pass1", "staff"));
    }

    public User authenticate(String username, String password) {
        return users.stream()
                .filter(u -> u.getUsername().equals(username) && u.getPassword().equals(password))
                .findFirst()
                .orElse(null);
    }
}
