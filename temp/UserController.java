package com.wpl.backend.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.wpl.backend.entity.User;
import com.wpl.backend.service.impl.UserServiceImpl;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;


/**
 * @date 2022/4/3
 */

@RestController
@Api(tags = "用户接口")
public class UserController {

    @Autowired
    private UserServiceImpl userServiceImpl;


    //改为使用mybatis-plus
    @PostMapping("/user")
    @ApiOperation("更新或新增用户")
    public boolean save(@RequestBody User user){
        return userServiceImpl.saveUser(user);
    }

    //改为使用mybatis-plus
    @DeleteMapping("/user/{id}")
    @ApiOperation("根据id删除用户")
    public boolean deleteById(@PathVariable Integer id){
        return userServiceImpl.removeById(id);
    }

    //改为使用mybatis-plus
    @GetMapping("/")
    @ApiOperation("获取所有用户")
    public List<User> index(){
        return userServiceImpl.list();
    }

    /**
     * @description 分页查询
     */
    //改为使用mybatis-plus
    @GetMapping("/user/page")
    @ApiOperation("分页查询")
    public IPage<User> findPage(@RequestParam Integer pageNum,
                                @RequestParam Integer pageSize,
                                @RequestParam(defaultValue = "") String username,
                                @RequestParam(defaultValue = "") String email,
                                @RequestParam(defaultValue = "") String address){
//        pageNum = (pageNum - 1) * pageSize;
//        username = '%' + username + '%';
//        List<User> data = userMapper.selectPage(pageNum, pageSize, username);
//        Integer total = userMapper.selectTotal(username);
//        Map<String,Object> result = new HashMap<>();
//        result.put("data", data);
//        result.put("total",total);
//        return result;
        IPage<User> page = new Page<>(pageNum,pageSize);
        QueryWrapper<User> queryWrapper = new QueryWrapper<>();
        if (!"".equals(username)) {
            queryWrapper.like("username",username);
        }
        if (!"".equals(email)) {
            queryWrapper.like("email",email);
        }
        if (!"".equals(address)) {
            queryWrapper.like("address",address);
        }
        queryWrapper.orderByDesc("id");
        return userServiceImpl.page(page,queryWrapper);
    }

    /**
     * 批量删除
     */
    @PostMapping("/user/del/batch")
    @ApiOperation("批量删除用户")
    public boolean deleteBatch(@RequestBody List<Integer> ids) {
        return userServiceImpl.removeBatchByIds(ids);
    }
}
