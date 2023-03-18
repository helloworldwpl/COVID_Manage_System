package com.wpl.springboot.mapper;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.wpl.springboot.entity.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.wpl.springboot.entity.dto.UserPasswordDTO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Update;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author wpl
 * @since 2022-04-08
 */

public interface UserMapper extends BaseMapper<User> {

    @Update("update user set password = #{newPassword} where username = #{username} and password = #{password}")
    int updatePassword(UserPasswordDTO userPasswordDTO);


}
