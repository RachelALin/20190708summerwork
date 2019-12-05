package com.ctguqmx.dao;

import com.ctguqmx.entity.User;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author linA
 * @company 启明星工作室
 * @create 2019/7/30
 */

public interface UserDao {
    List<User> selectAll();

    int addUser(User user);

    int deleteUser(String name);

    User selectUser(Integer id);

    int updateUser(User user);

    List<User> selectUserByName(String name);
}
