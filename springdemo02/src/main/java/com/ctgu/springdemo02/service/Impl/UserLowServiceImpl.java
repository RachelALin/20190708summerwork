package com.ctgu.springdemo02.service.Impl;

import com.ctgu.springdemo02.dao.UserLowMapper;
import com.ctgu.springdemo02.pojo.Category;
import com.ctgu.springdemo02.service.UserLowService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Alin
 * @packagename com.ctgu.springdemo02.service.Impl
 * @date 2019/8/4
 * @time 19:22
 */
@Service
public class UserLowServiceImpl implements UserLowService {


    @Autowired
    private UserLowMapper userLowMapper;
    @Override
    public Category FindName(String username) {
        return userLowMapper.findname(username);
    }

    @Override
    public List<Category> FindAll() {
        return  userLowMapper.getAll();
    }

    @Override
    public Category FindId(Integer id) {
        return userLowMapper.FindId(id);
    }

    @Override
    public void Update(Category category) {
        userLowMapper.update(category);
    }

    @Override
    public void deleteById(Integer id) {
        userLowMapper.deleteById(id);
    }

//    @Override
//    public void Insert() {
//        userLowMapper.Insert();
//    }

    @Override
    public void Insert(String username, String sex, Integer age) {
        userLowMapper.Insert(username,sex,age);
    }
}
