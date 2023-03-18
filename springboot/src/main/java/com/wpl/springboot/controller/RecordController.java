package com.wpl.springboot.controller;


import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.springframework.web.bind.annotation.*;
import javax.annotation.Resource;
import java.util.List;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.wpl.springboot.common.Result;

import com.wpl.springboot.service.IRecordService;
import com.wpl.springboot.entity.Record;

import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author wpl
 * @since 2022-04-09
 */
@RestController
@RequestMapping("/record")
public class RecordController {

    @Resource
    private IRecordService recordService;

    // 新增或者更新
    @PostMapping
    public Result save(@RequestBody Record record) {
        recordService.saveOrUpdate(record);
        return Result.success();
    }

    @DeleteMapping("/{id}")
    public Result delete(@PathVariable Integer id) {
        recordService.removeById(id);
        return Result.success();
    }

    @PostMapping("/del/batch")
    public Result deleteBatch(@RequestBody List<Integer> ids) {
        recordService.removeByIds(ids);
        return Result.success();
    }

    @GetMapping
    public Result findAll() {
        return Result.success(recordService.list());
    }

    @GetMapping("/{id}")
    public Result findOne(@PathVariable Integer id) {
        return Result.success(recordService.getById(id));
    }

    @GetMapping("/user/{id}")
    public Result findByUserId(@PathVariable Integer id) {
        return Result.success(recordService.getByUserId(id));
    }

    @GetMapping("/page")
    public Result findPage(@RequestParam Integer pageNum,
                           @RequestParam Integer pageSize) {
        QueryWrapper<Record> queryWrapper = new QueryWrapper<>();
        queryWrapper.orderByDesc("id");
        return Result.success(recordService.page(new Page<>(pageNum,pageSize),queryWrapper));
    }

}

