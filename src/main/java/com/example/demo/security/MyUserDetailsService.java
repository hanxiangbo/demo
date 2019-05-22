package com.example.demo.security;

import com.example.demo.model.MyJwtUser;
import com.example.demo.model.SysUser;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Created with IDEA
 * author:hxb
 *
 * @Date: 2019/5/22 13:40
 * @Description:
 */
@Component
public class MyUserDetailsService implements UserDetailsService {

    @Autowired
    private UserService userService;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        SysUser sysUser = userService.findByUsername(username);
        if (sysUser == null) {
            throw new UsernameNotFoundException(String.format("%s.这个用户不存在", username));
        }
        //List<SimpleGrantedAuthority> authorities = sysUser.getRoles().stream().map(Role::getRolename).map(SimpleGrantedAuthority::new).collect(Collectors.toList());
        //return new MyJwtUser(sysUser.getUsername(), sysUser.getPassword(), sysUser.getState(), authorities);
        return null;
    }
}
