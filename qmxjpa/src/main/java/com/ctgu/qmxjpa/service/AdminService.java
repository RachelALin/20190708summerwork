package com.ctgu.qmxjpa.service;

import com.ctgu.qmxjpa.pojo.Admin;

/**
 * @author Alin
 * @packagename com.ctgu.qmxjpa.service
 * @date 2019/8/5
 * @time 21:55
 */
public interface AdminService {
    Admin loginService(String username, String password);

//    int insert(String userName, String passWord, String realIdentity);

    Admin saveAndFlush(Admin admin);
}
