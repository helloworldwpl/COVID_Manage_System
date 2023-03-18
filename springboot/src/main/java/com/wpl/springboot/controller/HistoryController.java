package com.wpl.springboot.controller;


import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.springframework.web.bind.annotation.*;
import javax.annotation.Resource;
import javax.xml.bind.annotation.XmlType;
import java.util.List;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.wpl.springboot.common.Result;

import com.wpl.springboot.service.IHistoryService;
import com.wpl.springboot.entity.History;

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
@RequestMapping("/history")
public class HistoryController {

    @Resource
    private IHistoryService historyService;

    // 新增或者更新
    @PostMapping
    public Result save(@RequestBody History history) {
        historyService.saveOrUpdate(history);
        return Result.success();
    }

    @DeleteMapping("/{id}")
    public Result delete(@PathVariable Integer id) {
        historyService.removeById(id);
        return Result.success();
    }

    @PostMapping("/del/batch")
    public Result deleteBatch(@RequestBody List<Integer> ids) {
        historyService.removeByIds(ids);
        return Result.success();
    }

    @GetMapping
    public Result findAll() {
        return Result.success(historyService.list());
    }

    @GetMapping("/{id}")
    public Result findOne(@PathVariable Integer id) {
        return Result.success(historyService.getById(id));
    }

    @GetMapping("/page")
    public Result findPage(@RequestParam Integer pageNum,
                           @RequestParam Integer pageSize) {
        QueryWrapper<History> queryWrapper = new QueryWrapper<>();
        queryWrapper.orderByDesc("id");
        return Result.success(historyService.page(new Page<>(pageNum, pageSize), queryWrapper));
    }

    @GetMapping("/page/user/{id}")
    public Result findPageByUserId(@RequestParam Integer pageNum,
                                   @RequestParam Integer pageSize,
                                   @PathVariable("id") Integer userId) {
        QueryWrapper<History> queryWrapper = new QueryWrapper<>();
        queryWrapper.orderByDesc("id");
        queryWrapper.eq("user_id",userId);
        return Result.success(historyService.page(new Page<>(pageNum, pageSize), queryWrapper));
    }
}

