package com.wpl.springboot.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.wpl.springboot.entity.User;
import com.baomidou.mybatisplus.extension.service.IService;
import com.wpl.springboot.entity.dto.UserDTO;
import com.wpl.springboot.entity.dto.UserPasswordDTO;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author wpl
 * @since 2022-04-08
 */
public interface IUserService extends IService<User> {

    UserDTO login(UserDTO userDTO);

    User register(UserDTO userDTO);

    void updatePassword(UserPasswordDTO userPasswordDTO);


}
