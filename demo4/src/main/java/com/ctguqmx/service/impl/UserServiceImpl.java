package com.ctguqmx.service.impl;

import com.ctguqmx.dao.UserDao;
import com.ctguqmx.entity.User;
import com.ctguqmx.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author linA
 * @company 启明星工作室
 * @create 2019/7/30
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserDao userDao;

    @Override
    public List<User> selectAll() {
        if (userDao.selectAll()!=null){
            return userDao.selectAll();
        }else {
            return null;
        }
    }

    @Override
    public boolean addUser(User user) {
        if (userDao.addUser(user)!= 0){
            return true;
        }
        else{
            return false;
        }
    }

    @Override
    public boolean deleteUser(String name) {
        if ( userDao.deleteUser(name)!= 0){
            return true;
        }
        else{
            return false;
        }

    }

    @Override
    public User selectUserById(Integer id) {
        User user = userDao.selectUser(id);

        if(user != null){
            return user;
        }
        else {
            return null;
        }
    }

    @Override
    public boolean updateUser(User user) {
        if (userDao.updateUser(user)!= 0){
            return true;
        }
        else {
            return false;
        }
    }

    @Override
    public List<User> selectUserByName(String name) {
        if (userDao.selectUserByName(name)!=null){
            return userDao.selectUserByName(name);
        }
        else {
            return null;
        }
    }
}
