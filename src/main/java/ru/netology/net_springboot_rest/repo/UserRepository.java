package ru.netology.net_springboot_rest.repo;

import org.springframework.stereotype.Repository;
import ru.netology.net_springboot_rest.Authorities;
import ru.netology.net_springboot_rest.DTO.UserData;
import ru.netology.net_springboot_rest.User;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class UserRepository {

    private final Map<String, UserData> storage = new HashMap<>();

    public UserRepository() {
        storage.put("Nikita", new UserData("123", List.of(Authorities.READ, Authorities.DELETE)));
        storage.put("admin", new UserData("admin", List.of(Authorities.READ, Authorities.WRITE, Authorities.DELETE)));
    }

    public List<Authorities> getUserAuthorities(User user) {
        UserData userData = storage.get(user.getUser());

        if (userData != null && userData.getPassword().equals(user.getPassword())) {
            return userData.getAuthorities();
        }

        return Collections.emptyList();
    }


}
