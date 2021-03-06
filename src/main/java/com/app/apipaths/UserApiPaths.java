package com.app.apipaths;

import org.springframework.stereotype.Component;

@Component
public class  UserApiPaths {
    public static final String LIST_USERS = "get/users";
    public static final String ADD_USER = "add/user";

    private UserApiPaths() {}
}
