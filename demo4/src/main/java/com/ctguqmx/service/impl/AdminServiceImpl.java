package com.ctguqmx.service.impl;

import com.ctguqmx.dao.AdminDao;
import com.ctguqmx.entity.Admin;
import com.ctguqmx.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author linA
 * @company 启明星工作室
 * @create 2019/7/29
 */
@Service
public class AdminServiceImpl implements AdminService {

    @Autowired
    private AdminDao adminDao;

    @Override
    public boolean login(Admin admin) {
        if (adminDao.selectAdminByUsernameAndPassword(admin)!= null){
            return true;
        }else {
            return false;
        }
    }
}
