package com.avgkin.service;

public class UserServiceImpl implements UserService{
    @Override
    public boolean login(String username, String password) {
        System.out.println(username+" "+password);
        return false;
    }
}
