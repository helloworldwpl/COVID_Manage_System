package com.wpl.springboot.service.impl;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.wpl.springboot.entity.Record;
import com.wpl.springboot.mapper.RecordMapper;
import com.wpl.springboot.service.IRecordService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author wpl
 * @since 2022-04-09
 */
@Service
public class RecordServiceImpl extends ServiceImpl<RecordMapper, Record> implements IRecordService {

    @Resource
    private RecordMapper recordMapper;

    @Override
    public List<Record> getByUserId(Integer id) {
        return recordMapper.getByUserId(id);
    }
}
