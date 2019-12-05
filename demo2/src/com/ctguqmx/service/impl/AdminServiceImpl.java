package com.ctguqmx.service.impl;

import com.ctguqmx.dao.AdminDao;
import com.ctguqmx.entity.Admin;
import com.ctguqmx.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author linA
 * @company 启明星工作室
 * @create 2019/7/27
 */
@Service("adminService")
public class AdminServiceImpl implements AdminService {
    @Autowired
    private AdminDao adminDao;

    @Override
    public int addAdmin(Admin admin) {
         return adminDao.insetAdmin(admin);
    }

    @Override
    public int deleteAdmin(Admin admin) {
        return adminDao.deleteAdmin(admin);
    }

    @Override
    public int updateAdmin(Admin admin) {
        return adminDao.updateAdmin(admin);
    }

    @Override
    public Admin selectAdmin(Admin admin) {
        return adminDao.selectAdmin(admin);

    }
}
