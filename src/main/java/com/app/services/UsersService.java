package com.app.services;

import java.util.List;

import com.app.dtos.FormNewUserDTO;
import com.app.repositories.UsersRepository;
import com.app.entities.User;
import org.springframework.stereotype.Service;

@Service
public class UsersService {

    private final UsersRepository usersRepository;

    public UsersService(UsersRepository usersRepository) {
        this.usersRepository = usersRepository;
    }

    public List<User> getUsers() {
        return usersRepository.findAll();
    }

    public User saveUser(FormNewUserDTO formNewUserDTO) {
        User user = new User();
        user.setEmail(formNewUserDTO.getEmail());
        user.setFirstName(formNewUserDTO.getFirstName());
        user.setLastName(formNewUserDTO.getLastName());
        return usersRepository.save(user);
    }

}
