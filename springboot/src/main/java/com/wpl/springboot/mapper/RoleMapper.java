package com.wpl.springboot.mapper;

import com.wpl.springboot.entity.Role;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import io.swagger.models.auth.In;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author wpl
 * @since 2022-04-08
 */
public interface RoleMapper extends BaseMapper<Role> {

    @Select("select id from sys_role where flag = #{flag}")
    Integer selectByFlag(@Param("flag") String flag);
}
