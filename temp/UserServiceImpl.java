package com.wpl.backend.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.wpl.backend.entity.User;
import com.wpl.backend.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @date 2022/4/3
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper,User> {



    @Autowired
    private UserMapper userMapper;

    public boolean saveUser(User user) {
        return saveOrUpdate(user);//mybatis-plus方法 更新或新增
    }


 /*   @Override
    public List<User> getAllUser() {
        return userMapper.getAllUser();
    }

    @Override
    public int save(User user) {
        if (user.getId() == null) { //id不存在，则新增，否则更新
            return userMapper.insert(user);
        } else {
            return userMapper.update(user);
        }
    }

    @Override
    public Integer deleteById(Integer id) {
        return userMapper.deleteById(id);
    }

    @Override
    public List<User> selectPage(Integer pageNum, Integer pageSize, String username) {
        return userMapper.selectPage(pageNum,pageSize,username);
    }

    @Override
    public Integer selectTotal(String username) {
        return userMapper.selectTotal(username);
    }*/
}
