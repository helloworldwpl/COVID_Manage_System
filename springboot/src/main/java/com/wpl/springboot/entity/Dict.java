package com.wpl.springboot.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * @date 2022/4/8
 */
@Data
@TableName("sys_dict")
public class Dict {

    private String name;
    private String value;
    private String type;
}
