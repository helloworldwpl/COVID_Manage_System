package com.wpl.springboot.service.impl;

import com.wpl.springboot.entity.Travel;
import com.wpl.springboot.mapper.TravelMapper;
import com.wpl.springboot.service.ITravelService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author wpl
 * @since 2022-04-11
 */
@Service
public class TravelServiceImpl extends ServiceImpl<TravelMapper, Travel> implements ITravelService {

}
