package com.ctguqmx.dao.impl;

import com.ctguqmx.dao.AdminDao;
import com.ctguqmx.entity.Admin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * @author linA
 * @company 启明星工作室
 * @create 2019/7/27
 */
@Repository("adminDao")
public class AdminDaoImpl implements AdminDao {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public int insetAdmin(Admin admin) {

        String SQL = "insert into `admin` (`username`, `password`) values (?, ?)";
        Object[] objects ={admin.getUsername(),admin.getPassword()};

        int row = jdbcTemplate.update( SQL, objects);

        return row;
    }

    @Override
    public int deleteAdmin(Admin admin) {
        String SQL = "delete from `admin` where `username` = ? ";
        Object[] objects ={admin.getUsername()};

        int row = jdbcTemplate.update( SQL, objects);

        return row;
    }

    @Override
    public int updateAdmin(Admin admin) {
        String SQL = "update `admin` set `username` = ? , `password` = ? where `id` = ? ";

        Object[] objects ={admin.getUsername(),admin.getPassword(),admin.getId()};

        int row = jdbcTemplate.update( SQL, objects);

        return row;
    }

    @Override
    public Admin selectAdmin(Admin admin) {
        String SQL = "select * from `admin` where `username` =  ? and `password` = ?";
        try {
            Admin result = jdbcTemplate.queryForObject(SQL, new RowMapper<Admin>() {
                @Override
                public Admin mapRow(ResultSet resultSet, int i) throws SQLException {
                    Admin Result = new Admin();
//                    Result.setId(resultSet.getInt("id"));
                    Result.setUsername(resultSet.getString("username"));
                    Result.setPassword(resultSet.getString("password"));
                    return Result;


                }
            },admin.getUsername(),admin.getPassword());
            return result;
           } catch (Exception e){
              return null;
          }


    }
}
