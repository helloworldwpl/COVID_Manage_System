package com.wpl.springboot.service.impl;

import com.wpl.springboot.entity.Report;
import com.wpl.springboot.mapper.ReportMapper;
import com.wpl.springboot.service.IReportService;
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
public class ReportServiceImpl extends ServiceImpl<ReportMapper, Report> implements IReportService {

}
