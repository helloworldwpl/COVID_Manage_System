package com.wpl.springboot.service.impl;

import com.wpl.springboot.entity.History;
import com.wpl.springboot.mapper.HistoryMapper;
import com.wpl.springboot.service.IHistoryService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author wpl
 * @since 2022-04-09
 */
@Service
public class HistoryServiceImpl extends ServiceImpl<HistoryMapper, History> implements IHistoryService {

}
