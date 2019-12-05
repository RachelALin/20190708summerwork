package com.ctgu.springdemo02.dao;

import com.ctgu.springdemo02.pojo.Category;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author Alin
 * @packagename com.ctgu.springdemo02.dao
 * @date 2019/8/4
 * @time 19:36
 */
@Repository
public interface UserLowMapper {
   public List<Category> getAll();

   Category findname(String username);

   Category FindId(Integer id);

   void update(Category category);

   void deleteById(Integer id);

   void Insert(String username,String sex,Integer age);
}
