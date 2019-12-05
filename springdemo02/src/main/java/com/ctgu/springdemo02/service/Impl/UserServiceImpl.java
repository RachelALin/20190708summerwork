package com.ctgu.springdemo02.service.Impl;


import com.ctgu.springdemo02.dao.UserMapper;
import com.ctgu.springdemo02.pojo.User;
import com.ctgu.springdemo02.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public User Sel(Integer id) {
        return userMapper.Sel(id);
    }
    @Override
    public  User loginService(String username,String password){
        return userMapper.selectUser(username,password);
    }

    @Override
    public int register(String username, String password, String realidentity){
        return userMapper.insertUser(username,password,realidentity);
    }
}
