package com.wpl.springboot.service.impl;

import com.wpl.springboot.entity.Knowledge;
import com.wpl.springboot.mapper.KnowledgeMapper;
import com.wpl.springboot.service.IKnowledgeService;
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
public class KnowledgeServiceImpl extends ServiceImpl<KnowledgeMapper, Knowledge> implements IKnowledgeService {

}
