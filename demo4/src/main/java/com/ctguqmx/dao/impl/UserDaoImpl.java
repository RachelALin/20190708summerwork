package com.ctguqmx.dao.impl;

import com.ctguqmx.dao.UserDao;
import com.ctguqmx.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import javax.xml.transform.Result;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;
import java.util.List;

/**
 * @author linA
 * @company 启明星工作室
 * @create 2019/7/30
 */
@Repository
public class UserDaoImpl implements UserDao {
    @Autowired
    JdbcTemplate jdbcTemplate;

    @Override
    public List<User> selectAll() {

        String sql = "select * from `user`";
        try {

            final List<User> list = jdbcTemplate.query(sql, new RowMapper<User>() {

                public User mapRow(ResultSet resultSet, int i) throws SQLException {
                    User result = new User();
                    result.setId(resultSet.getInt("id"));
                    result.setName(resultSet.getString("name"));
                    result.setEmail(resultSet.getString("email"));
                    result.setAge(resultSet.getInt("age"));
                    result.setSex(resultSet.getInt("sex"));
                    return result;
                }
            });

            return list;
        } catch (Exception e) {
            return null;
        }
    }

    @Override
    public int addUser(User user) {
        String sql = "insert into `user` (`name`, `email`,`age`,`sex`) value(?,?,?,?)";
        Object[] objects = {user.getName(), user.getEmail(), user.getAge(), user.getSex()};

        int row = jdbcTemplate.update(sql, objects);
        return row;
    }

    @Override
    public int deleteUser(String name) {
        String sql = "delete from `user` where `name` = ?";
        Object[] objects = {name};

        int row = jdbcTemplate.update(sql, objects);

        return row;
    }

    @Override
    public User selectUser(final Integer id) {
        String sql = "select * from `user` where `id` = ?";
        try {

            User user = jdbcTemplate.queryForObject(sql, new RowMapper<User>() {
                @Override
                public User mapRow(ResultSet resultSet, int i) throws SQLException {
                    User user = new User();
                    user.setId(resultSet.getInt("id"));
                    user.setName(resultSet.getString("name"));
                    user.setEmail(resultSet.getString("email"));
                    user.setAge(resultSet.getInt("age"));
                    user.setSex(resultSet.getInt("sex"));
                    return user;

                }
            }, id);
            return user;
        } catch (Exception e) {
            return null;
        }
    }

    @Override
    public int updateUser(User user) {
        String sql = "update `user` set `name` = ?, `email` = ?, `age`= ?, `sex` = ? where `id` = ? ";
        Object[] objects = {user.getName(),user.getEmail(),user.getAge(),user.getSex(),user.getId()};

        int row = jdbcTemplate.update(sql, objects);

        return row;
    }

    @Override
    public List<User> selectUserByName(String name) {
        String sql = "select * from `user` where `name` = ?";
        try {

            final List<User> list = jdbcTemplate.query(sql, new RowMapper<User>() {

                public User mapRow(ResultSet resultSet, int i) throws SQLException {
                    User result = new User();
                    result.setId(resultSet.getInt("id"));
                    result.setName(resultSet.getString("name"));
                    result.setEmail(resultSet.getString("email"));
                    result.setAge(resultSet.getInt("age"));
                    result.setSex(resultSet.getInt("sex"));
                    return result;
                }
            },name);

            return list;
        } catch (Exception e) {
            return null;
        }
    }
}
