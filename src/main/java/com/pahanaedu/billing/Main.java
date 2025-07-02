package com.pahanaedu.billing;

import com.pahanaedu.billing.controllers.LoginController;
import com.pahanaedu.billing.models.User;

public class Main {
    public static void main(String[] args) {
        LoginController loginController = new LoginController();
        User user = loginController.login();

        if (user != null) {
            System.out.println("Login successful. Welcome " + user.getUsername() + " (" + user.getRole() + ")");
            // showMenu();
        } else {
            System.out.println("Login failed.");
        }
    }
}
