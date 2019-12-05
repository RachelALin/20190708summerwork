package com.ctgu.springdemo02.service;


import com.ctgu.springdemo02.pojo.User;

public interface UserService {
    User Sel(Integer id);

    User loginService(String username, String password);

    int register(String userName, String passWord, String realidentity);
}
