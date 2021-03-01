package com.app;

import java.util.List;

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

    public User saveUser(User user) {
        return usersRepository.save(user);
    }

}
