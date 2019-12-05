package com.ctguqmx.dao;

import com.ctguqmx.entity.Admin;

/**
 * @author linA
 * @company 启明星工作室
 * @create 2019/7/27
 */
public interface AdminDao {
    int insetAdmin(Admin admin);

    int deleteAdmin(Admin admin);

    int updateAdmin(Admin admin);

    Admin selectAdmin(Admin admin);
}
