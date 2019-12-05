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
 * @create 2019/7/29
 */
@Repository
public class AdminDaoImpl implements AdminDao {

    @Autowired
    JdbcTemplate jdbcTemplate;

    @Override
    public Admin selectAdminByUsernameAndPassword(Admin admin) {
        String sql= "select * from `admin` where `username`=? and `password`=?";
        try {
            Admin result =jdbcTemplate.queryForObject(sql, new RowMapper<Admin>() {
                @Override
                public Admin mapRow(ResultSet resultSet, int i) throws SQLException {
                    Admin result = new Admin();
//                    result.setId(resultSet.getInt("id"));
                    result.setUsername(resultSet.getString("username"));
                    result.setPassword(resultSet.getString("password"));
                    return result;
                }
            },admin.getUsername(),admin.getPassword());
            return result;
        }catch (Exception e){
            return null;
        }

    }
}
