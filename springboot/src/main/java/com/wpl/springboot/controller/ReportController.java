package com.wpl.springboot.controller;


import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.wpl.springboot.entity.History;
import org.springframework.web.bind.annotation.*;
import javax.annotation.Resource;
import java.util.List;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.wpl.springboot.common.Result;

import com.wpl.springboot.service.IReportService;
import com.wpl.springboot.entity.Report;

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
@RequestMapping("/report")
public class ReportController {

    @Resource
    private IReportService reportService;

    // 新增或者更新
    @PostMapping
    public Result save(@RequestBody Report report) {
        reportService.saveOrUpdate(report);
        return Result.success();
    }

    @DeleteMapping("/{id}")
    public Result delete(@PathVariable Integer id) {
        reportService.removeById(id);
        return Result.success();
    }

    @PostMapping("/del/batch")
    public Result deleteBatch(@RequestBody List<Integer> ids) {
        reportService.removeByIds(ids);
        return Result.success();
    }

    @GetMapping
    public Result findAll() {
        return Result.success(reportService.list());
    }

    @GetMapping("/{id}")
    public Result findOne(@PathVariable Integer id) {
        return Result.success(reportService.getById(id));
    }

    @GetMapping("/page")
    public Result findPage(@RequestParam Integer pageNum,
                           @RequestParam Integer pageSize) {
        QueryWrapper<Report> queryWrapper = new QueryWrapper<>();
        queryWrapper.orderByDesc("id");
        return Result.success(reportService.page(new Page<>(pageNum, pageSize), queryWrapper));
    }

    @GetMapping("/page/user/{id}")
    public Result findPageByUserId(@RequestParam Integer pageNum,
                                   @RequestParam Integer pageSize,
                                   @PathVariable("id") Integer userId) {
        QueryWrapper<Report> queryWrapper = new QueryWrapper<>();
        queryWrapper.orderByDesc("id");
        queryWrapper.eq("user_id",userId);
        return Result.success(reportService.page(new Page<>(pageNum, pageSize), queryWrapper));
    }

}

