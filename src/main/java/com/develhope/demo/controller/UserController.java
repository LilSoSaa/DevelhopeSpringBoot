package com.develhope.demo.controller;

import com.develhope.demo.entities.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {
    List<User> users = new ArrayList<>();
    User user1 = new User("Luca", 23, 1);
    User user2 = new User("Giovanni", 24, 2);
    User user3 = new User("Emanuel", 21, 3);

    public UserController() {
        users.add(user1);
        users.add(user2);
        users.add(user3);
    }

    @GetMapping
    public List<User> getUsers(@RequestParam String nome) {
        List<User> filteredUsers = new ArrayList<>();
        for (User user : users) {
            if (user.getNome().equalsIgnoreCase(nome)) {
                filteredUsers.add(user);
            }
        }
        return filteredUsers;
    }


    @GetMapping("/{id}")
    public ResponseEntity<User> getUserByid (@PathVariable int id) {
        for (User user : users) {
            if (user.getId() == id) {
                return ResponseEntity.ok(user);
            }
        }
        return ResponseEntity.notFound().build();
    }

}
