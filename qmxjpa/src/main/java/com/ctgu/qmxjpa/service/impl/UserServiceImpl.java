package com.ctgu.qmxjpa.service.impl;

import com.ctgu.qmxjpa.dao.UserMapper;
import com.ctgu.qmxjpa.pojo.User;
import com.ctgu.qmxjpa.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.transaction.Transactional;
import java.util.List;

/**
 * @author Alin
 * @packagename com.ctgu.qmxjpa.service.impl
 * @date 2019/8/5
 * @time 21:53
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;
    @Override
    public void deleteUserrById(Integer id) {
        userMapper.deleteUserrById(id);
    }

    @Override
    public User findUserrById(Integer id) {
        return userMapper.findUserrById(id);
    }


    @Override
    public void saveAndFlush(User user) {
        userMapper.saveAndFlush(user);
    }


    @Override
    public User findUserrByUsername(String username) {
        return userMapper.findUserrByUsername(username);
    }

    @Override
    public List<User> findAll() {
        return userMapper.findAll();
    }
}
