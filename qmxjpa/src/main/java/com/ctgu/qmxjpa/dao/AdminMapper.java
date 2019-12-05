package com.ctgu.qmxjpa.dao;

import com.ctgu.qmxjpa.pojo.Admin;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

/**
 * @author Alin
 * @packagename com.ctgu.qmxjpa.dao
 * @date 2019/8/5
 * @time 21:22
 */
@Repository
@Transactional
public interface AdminMapper extends JpaRepository<Admin,Integer> {

    Admin findAdminnByUsernameAndPassword(String username, String password);

}
