package ru.netology.net_springboot_rest;

import jakarta.validation.constraints.NotBlank;

public class User {

    @NotBlank(message = "User is empty")
    private String user;

    @NotBlank(message = "Password is empty")
    private String password;

    public User(String user, String password) {
        this.user = user;
        this.password = password;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
