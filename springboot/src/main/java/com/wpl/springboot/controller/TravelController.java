package com.wpl.springboot.controller;


import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.springframework.web.bind.annotation.*;
import javax.annotation.Resource;
import java.util.List;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.wpl.springboot.common.Result;

import com.wpl.springboot.service.ITravelService;
import com.wpl.springboot.entity.Travel;

import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author wpl
 * @since 2022-04-11
 */
@RestController
@RequestMapping("/travel")
public class TravelController {

    @Resource
    private ITravelService travelService;

    // 新增或者更新
    @PostMapping
    public Result save(@RequestBody Travel travel) {
        travelService.saveOrUpdate(travel);
        return Result.success();
    }

    @DeleteMapping("/{id}")
    public Result delete(@PathVariable Integer id) {
        travelService.removeById(id);
        return Result.success();
    }

    @PostMapping("/del/batch")
    public Result deleteBatch(@RequestBody List<Integer> ids) {
        travelService.removeByIds(ids);
        return Result.success();
    }

    @GetMapping
    public Result findAll() {
        return Result.success(travelService.list());
    }

    @GetMapping("/{id}")
    public Result findOne(@PathVariable Integer id) {
        return Result.success(travelService.getById(id));
    }

    @GetMapping("/page")
    public Result findPage(@RequestParam Integer pageNum,
                           @RequestParam Integer pageSize) {
        QueryWrapper<Travel> queryWrapper = new QueryWrapper<>();
        queryWrapper.orderByDesc("id");
        return Result.success(travelService.page(new Page<>(pageNum, pageSize), queryWrapper));
    }

    @GetMapping("/page/user/{id}")
    public Result findPageByUserId(@RequestParam Integer pageNum,
                           @RequestParam Integer pageSize,
                            @PathVariable("id") Integer userId) {
        QueryWrapper<Travel> queryWrapper = new QueryWrapper<>();
        queryWrapper.orderByDesc("id");
        queryWrapper.eq("user_id",userId);
        return Result.success(travelService.page(new Page<>(pageNum, pageSize), queryWrapper));
    }
}

