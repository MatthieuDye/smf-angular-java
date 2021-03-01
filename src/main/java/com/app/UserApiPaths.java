package com.app;

import org.springframework.stereotype.Component;

@Component
public class UserApiPaths {
    public static final String LIST_USERS = "/users";
    public static final String ADD_USER = "/user";

    private UserApiPaths() {}
}
