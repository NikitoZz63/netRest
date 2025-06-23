package ru.netology.net_springboot_rest.DTO;

import ru.netology.net_springboot_rest.Authorities;

import java.util.List;

public class UserData {
    private final String password;
    private final List<Authorities> authorities;

    public UserData(String password, List<Authorities> authorities) {
        this.password = password;
        this.authorities = authorities;
    }

    // геттеры
    public String getPassword() {
        return password;
    }

    public List<Authorities> getAuthorities() {
        return authorities;
    }
}
