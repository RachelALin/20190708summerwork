package com.ctguqmx.service;

import com.ctguqmx.entity.Admin;

/**
 * @author linA
 * @company 启明星工作室
 * @create 2019/7/27
 */
public interface AdminService {
    int addAdmin(Admin admin);

    int deleteAdmin(Admin admin);

    int updateAdmin(Admin admin);

    Admin selectAdmin(Admin admin);
}
