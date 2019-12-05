package com.ctgu.springdemo02.service;

import com.ctgu.springdemo02.pojo.Category;

import java.util.List;

/**
 * @author Alin
 * @packagename com.ctgu.springdemo02.service
 * @date 2019/8/4
 * @time 19:20
 */
public interface UserLowService {

    Category FindName(String username);

    List<Category> FindAll();

    Category FindId(Integer id);

    void Update(Category category);

    void deleteById(Integer id);

//    void Insert();

    void Insert(String username, String sex, Integer age);
}
