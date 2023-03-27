package com.example.userprogram;

import java.util.ArrayList;

public class UserStorage {

    private ArrayList<User> users;
    private static UserStorage userStorage = null;

    private UserStorage() {
        users = new ArrayList<User>();
    }

    public static UserStorage getInstance() {
        if (userStorage == null) {
            userStorage = new UserStorage();
        }
        return userStorage;
    }

    public ArrayList<User> getUsers() {
        return users;
    }

    public void addUser(User user) {
        users.add(user);
    }
}
