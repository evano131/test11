package com.telent.mapper;

import com.telent.bean.po.Admin;
import org.springframework.stereotype.Repository;

@Repository
public interface AdminMapper {
    //根据账户名称获取员工对象名
    public Admin getAdminByName(String admin_name);

}
