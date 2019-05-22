package com.example.demo.model;

import lombok.Data;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.User;

import java.util.Collection;

@Data
public class SysUser extends User {
    /**
     * 用户登录名
     */
    private String loginName;
    /**
     * 用户真实姓名
     */
    private String realName;
    /**
     * 密码
     */
    private String passWord;
    /**
     * 电话号码
     */
    private String phone;
    /**
     * 是否启用标识
     */
    private String flagIsEnable;
    /**
     * 角色code
     */
    private String roleCode;
    /**
     * 所属组织结构
     */
    private String departmentCode;

    /**
     * 角色名称
     */
    private String roleName;
    /**
     * 部门全名称名称，如：路南区-**街道-公安局
     */
    private String departmentTotalName;

    public SysUser(String username, String password, boolean enabled, boolean accountNonExpired, boolean credentialsNonExpired, boolean accountNonLocked, Collection<? extends GrantedAuthority> authorities) {
        super(username, password, enabled, accountNonExpired, credentialsNonExpired, accountNonLocked, authorities);
    }
}
