package com.wpl.springboot.mapper;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.wpl.springboot.entity.Record;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author wpl
 * @since 2022-04-09
 */
public interface RecordMapper extends BaseMapper<Record> {

    @Select("select * from sys_record where user_id = #{user_id}")
    List<Record> getByUserId(@Param("user_id") Integer id);
}
