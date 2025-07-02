package com.pahanaedu.billing.controllers;

import com.pahanaedu.billing.models.User;
import com.pahanaedu.billing.services.LoginService;

import java.util.Scanner;

public class LoginController {
    private final LoginService loginService;

    public LoginController() {
        this.loginService = new LoginService();
    }

    public User login() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Username: ");
        String username = scanner.nextLine();

        System.out.print("Password: ");
        String password = scanner.nextLine();

        return loginService.authenticate(username, password);
    }
}
