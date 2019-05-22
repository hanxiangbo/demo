package com.example.demo.service;

import com.example.demo.model.SysUser;

/**
 * Created with IDEA
 * author:hxb
 *
 * @Date: 2019/5/22 13:43
 * @Description:
 */
public interface UserService {
    SysUser findByUsername(String username);
}
