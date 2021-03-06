package com.app.controllers;

import com.app.apipaths.UserApiPaths;
import com.app.dtos.FormNewUserDTO;
import com.app.mappers.UserMapper;
import com.app.dtos.UserDTO;
import com.app.entities.User;
import com.app.services.UsersService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
@RequestMapping()
public class UsersController {

    @Autowired
    UsersService usersService;

    UserMapper userMapper;

    @GetMapping(value = "/users/list")
    public ResponseEntity<List<User>> listUsers() {
        log.trace("Listing Users");
        List<User> resource = usersService.getUsers();
        return ResponseEntity.ok(resource);
    }

    @PostMapping(value = "/user/create")
    public ResponseEntity<UserDTO> saveUser(@RequestBody FormNewUserDTO formNewUserDTO) {
        User resource = usersService.saveUser(formNewUserDTO);
        return ResponseEntity.ok(userMapper.userToUserDTO(resource));
    }
}
