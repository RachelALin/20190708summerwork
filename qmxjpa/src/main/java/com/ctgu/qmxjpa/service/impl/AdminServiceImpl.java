package com.ctgu.qmxjpa.service.impl;

import com.ctgu.qmxjpa.dao.AdminMapper;
import com.ctgu.qmxjpa.pojo.Admin;
import com.ctgu.qmxjpa.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



/**
 * @author Alin
 * @packagename com.ctgu.qmxjpa.service.impl
 * @date 2019/8/5
 * @time 21:55
 */
@Service
public class AdminServiceImpl implements AdminService {
    @Autowired
    private AdminMapper adminMapper;
    @Override
    public Admin loginService(String username, String password) {
        return adminMapper.findAdminnByUsernameAndPassword(username,password);
    }

    @Override
    public Admin saveAndFlush(Admin admin) {
        return adminMapper.saveAndFlush(admin);
    }



}
