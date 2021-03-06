package com.app.payroll;

import com.app.entities.User;
import com.app.repositories.UsersRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
class LoadDatabase {

    private static final Logger log = LoggerFactory.getLogger(LoadDatabase.class);

    @Bean
    CommandLineRunner initDatabase(UsersRepository repository) {

        return args -> {
            log.info("Preloading " + repository.save(new User("Bilbo Baggins", "burglar", "email1")));
            log.info("Preloading " + repository.save(new User("Frodo Baggins", "thief", "email")));
        };
    }
}
