package ru.chernevich.redis_demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ru.chernevich.redis_demo.entity.User;
import ru.chernevich.redis_demo.service.UserService;

@RestController
@RequestMapping("/api")
public class MainController {

    @Autowired
    private UserService userService;

    @PostMapping("/add")
    public ResponseEntity<User> save(@RequestBody User user) {
        return new ResponseEntity<>(userService.save(user), HttpStatusCode.valueOf(201));

    }
    @GetMapping
    public ResponseEntity<User> getById(@RequestParam Integer id) {
        User user = userService.getById(id);
        if(user == null) {
            return new ResponseEntity<>(HttpStatusCode.valueOf(400));
        }

        return new ResponseEntity<>(user, HttpStatusCode.valueOf(200));
    }
}
