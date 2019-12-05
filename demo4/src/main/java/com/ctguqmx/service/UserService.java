package com.ctguqmx.service;

import com.ctguqmx.entity.User;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author linA
 * @company 启明星工作室
 * @create 2019/7/30
 */

public interface UserService {
    List<User> selectAll();

    boolean addUser(User user);

    boolean deleteUser(String name);

    User selectUserById(Integer id);

    boolean updateUser(User user);

    List<User> selectUserByName(String name);
}
