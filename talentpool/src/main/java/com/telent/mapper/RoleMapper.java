package com.telent.mapper;

import com.telent.bean.po.Role;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RoleMapper {
    /**
     * 根据员工编号查询该员工的角色列表
     * @param  admin_id  要查询角色列表的员工的员工编号
     * @return  该员工的角色列表
     * */
    List<Role> getRoleListByAdminId(@Param("admin_id") Integer admin_id);
}
