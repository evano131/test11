package com.telent.bean.po;


import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.List;

//员工类
public class Admin implements UserDetails {//验证用户详细信息的一个接口
    private Integer admin_id;//用户编号
    private String admin_name;//登录的账户
    private String admin_pass;//登录密码
    private String admin_email;//用户邮箱
    private Integer admin_status;//用户状态
    private String creator;//创建者
    private Date createtime;//创建时间
    private Date last_updatetime;//最后更新时间
    private String last_updater;//最后更新人

    private List<Role> roleList = new ArrayList<Role>();
    public List<Role> getRoleList() {
        return roleList;
    }

    public void setRoleList(List<Role> roleList) {
        this.roleList = roleList;
    }



    public Integer getAdmin_id() {
        return admin_id;
    }

    public void setAdmin_id(Integer admin_id) {
        this.admin_id = admin_id;
    }

    public String getAdmin_name() {
        return admin_name;
    }

    public void setAdmin_name(String admin_name) {
        this.admin_name = admin_name;
    }

    public String getAdmin_pass() {
        return admin_pass;
    }

    public void setAdmin_pass(String admin_pass) {
        this.admin_pass = admin_pass;
    }

    public String getAdmin_email() {
        return admin_email;
    }

    public void setAdmin_email(String admin_email) {
        this.admin_email = admin_email;
    }

    public Integer getAdmin_status() {
        return admin_status;
    }

    public void setAdmin_status(Integer admin_status) {
        this.admin_status = admin_status;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public Date getLast_updatetime() {
        return last_updatetime;
    }

    public void setLast_updatetime(Date last_updatetime) {
        this.last_updatetime = last_updatetime;
    }

    public String getLast_updater() {
        return last_updater;
    }

    public void setLast_updater(String last_updater) {
        this.last_updater = last_updater;
    }

    //得到一些用户验证的信息
    //授权的方法
    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return getRoleList();
    }

    @Override
    public String getPassword() {
        return getAdmin_pass();
    }

    @Override
    public String getUsername() {
        return getAdmin_name();
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }
}
