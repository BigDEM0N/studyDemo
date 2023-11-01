package com.avgkin.dubbobootprovider.service;

import com.avgkin.service.UserService;
import org.apache.dubbo.config.annotation.DubboService;

@DubboService
public class UserServiceImpl implements UserService {
    @Override
    public boolean login(String username, String password) {
        System.out.println(username+" "+password);
        return false;
    }
}
