package com.example.demo.service.Impl;

import com.example.demo.model.SysUser;
import com.example.demo.service.UserService;
import org.springframework.stereotype.Service;

/**
 * Created with IDEA
 * author:hxb
 *
 * @Date: 2019/5/22 13:55
 * @Description:
 */
@Service
public class UserServiceImpl implements UserService {
    @Override
    public SysUser findByUsername(String username) {
        return null;
    }
}
