package com.wpl.springboot.controller;


import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.springframework.web.bind.annotation.*;
import javax.annotation.Resource;
import java.util.List;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.wpl.springboot.common.Result;

import com.wpl.springboot.service.IKnowledgeService;
import com.wpl.springboot.entity.Knowledge;

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
@RequestMapping("/knowledge")
public class KnowledgeController {

    @Resource
    private IKnowledgeService knowledgeService;

    // 新增或者更新
    @PostMapping
    public Result save(@RequestBody Knowledge knowledge) {
        knowledgeService.saveOrUpdate(knowledge);
        return Result.success();
    }

    @DeleteMapping("/{id}")
    public Result delete(@PathVariable Integer id) {
        knowledgeService.removeById(id);
        return Result.success();
    }

    @PostMapping("/del/batch")
    public Result deleteBatch(@RequestBody List<Integer> ids) {
        knowledgeService.removeByIds(ids);
        return Result.success();
    }

    @GetMapping
    public Result findAll() {
        return Result.success(knowledgeService.list());
    }

    @GetMapping("/{id}")
    public Result findOne(@PathVariable Integer id) {
        return Result.success(knowledgeService.getById(id));
    }

    @GetMapping("/page")
    public Result findPage(@RequestParam Integer pageNum,
                                @RequestParam Integer pageSize) {
        QueryWrapper<Knowledge> queryWrapper = new QueryWrapper<>();
        queryWrapper.orderByDesc("id");
        return Result.success(knowledgeService.page(new Page<>(pageNum, pageSize), queryWrapper));
    }

}

