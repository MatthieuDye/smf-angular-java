package com.app;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RequestMapping("/api/")
@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class UsersController {

    @Autowired
    UsersService usersService;

    @GetMapping(path = UserApiPaths.LIST_USERS)
    public ResponseEntity<?> listUsers() {
        log.info("UsersController:  list users");
        List<User> resource = usersService.getUsers();
        return ResponseEntity.ok(resource);
    }

    @PostMapping(path = UserApiPaths.ADD_USER)
    public ResponseEntity<?> saveUser(@RequestBody User user) {
        log.info("UsersController:  list users");
        User resource = usersService.saveUser(user);
        return ResponseEntity.ok(resource);
    }
}
