package com.wpl.springboot.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * @date 2022/4/8
 */
@Data
@TableName("sys_role_menu")
public class RoleMenu {

    private Integer roleId;
    private Integer menuId;
}
