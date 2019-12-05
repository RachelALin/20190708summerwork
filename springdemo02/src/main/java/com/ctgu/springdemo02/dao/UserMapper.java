package com.ctgu.springdemo02.dao;

import com.ctgu.springdemo02.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.stereotype.Repository;

@Repository
public interface UserMapper {
    User Sel(Integer id);
    int insertUser(String userName, String passWord, String realidentity);
    User selectUser(String username, String password);
}
