package ru.netology.net_springboot_rest.controller;

import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.netology.net_springboot_rest.Authorities;
import ru.netology.net_springboot_rest.User;
import ru.netology.net_springboot_rest.annotation.FromQuery;
import ru.netology.net_springboot_rest.service.AuthorizationService;

import java.util.List;

@RestController
public class AuthorizationController {

    private final AuthorizationService service;

    public AuthorizationController(AuthorizationService service) {
        this.service = service;
    }

    @GetMapping("/authorize")
    public List<Authorities> getAuthorities(@Valid @FromQuery User user) {
        return service.getAuthorities(user);
    }

}
