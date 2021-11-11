package com.telent.service;

import com.telent.bean.po.Admin;

public interface IAdminService {
    /**
     *  根据账户名称获取用户名称
     * */
    Admin getAdminByName(String admin_name);


}
