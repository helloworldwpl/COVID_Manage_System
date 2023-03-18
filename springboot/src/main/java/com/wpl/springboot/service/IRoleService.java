package com.wpl.springboot.service;

import com.wpl.springboot.entity.Role;
import com.baomidou.mybatisplus.extension.service.IService;
import com.wpl.springboot.entity.RoleMenu;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author wpl
 * @since 2022-04-08
 */
public interface IRoleService extends IService<Role> {

    void setRoleMenu(Integer roleId, List<Integer> menuIds);



    List<Integer> getRoleMenu(Integer roleId);
}
