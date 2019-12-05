package com.ctgu.qmxjpa.dao;

import com.ctgu.qmxjpa.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import javax.transaction.Transactional;
import java.util.List;

/**
 * @author Alin
 * @packagename com.ctgu.qmxjpa.dao
 * @date 2019/8/5
 * @time 21:12
 */
@Repository
@Transactional
public interface UserMapper extends JpaRepository<User,Integer> {
//    @Override
//    List<User> findAll();

    User findUserrByUsername(String username);

    User findUserrById(Integer id);


    void deleteUserrById(Integer id);


}
