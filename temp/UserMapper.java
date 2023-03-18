package com.wpl.backend.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.wpl.backend.entity.User;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface UserMapper extends BaseMapper<User> {

//    @Select("select * from user")
//    List<User> getAllUser();
//
//    @Insert("insert into user(username,password,nickname,email,phone,address) values(#{username},#{password}," +
//            "#{nickname},#{email},#{phone},#{address})")
//    int insert(User user);
//
//    int update(User user);
//
//    @Delete("delete from user where id = #{id}")
//    Integer deleteById(@Param("id") Integer id);
//
//    @Select("select * from user where username like #{username} limit #{pageNum},#{pageSize}")
//    List<User> selectPage(Integer pageNum,Integer pageSize,String username);
//
//    @Select("select count(*) from user where username like #{username}")
//    Integer selectTotal(String username);
}
