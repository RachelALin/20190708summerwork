package com.ctguqmx.service;

import com.ctguqmx.entity.Admin;
import org.springframework.stereotype.Service;

/**
 * @author linA
 * @company 启明星工作室
 * @create 2019/7/29
 */

public interface AdminService {
    boolean login(Admin admin);
}
