package com.ctgu.qmxjpa.service;

import com.ctgu.qmxjpa.pojo.User;

import java.util.List;

/**
 * @author Alin
 * @packagename com.ctgu.qmxjpa.service
 * @date 2019/8/5
 * @time 21:54
 */
public interface UserService {
    void deleteUserrById(Integer id);

    User findUserrById(Integer id);

    void saveAndFlush(User user);

    User findUserrByUsername(String username);

    List<User> findAll();
}
