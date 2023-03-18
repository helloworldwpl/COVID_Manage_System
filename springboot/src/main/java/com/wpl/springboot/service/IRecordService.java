package com.wpl.springboot.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.wpl.springboot.entity.Record;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author wpl
 * @since 2022-04-09
 */
public interface IRecordService extends IService<Record> {

    List<Record> getByUserId(Integer id);
}
