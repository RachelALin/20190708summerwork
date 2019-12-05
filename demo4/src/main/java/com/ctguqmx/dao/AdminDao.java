package com.ctguqmx.dao;

import com.ctguqmx.entity.Admin;
import org.springframework.stereotype.Repository;

/**
 * @author linA
 * @company 启明星工作室
 * @create 2019/7/29
 */

public interface AdminDao {
    Admin selectAdminByUsernameAndPassword(Admin admin);
}
