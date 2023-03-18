package com.wpl.backend.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

/**
 * @date 2022/4/2
 * @author wpl
 * @description 用户类
 */
@Data
@TableName("user")
public class User {

    @TableId(value = "id",type = IdType.AUTO)
    private Integer id;
    private String username;
    //忽略某个字段，在返回给前端的JSON不会展示本字段
    @JsonIgnore
    private String password;
    private String nickname;
    private String email;
    private String phone;
    private String address;
   // @TableField("avatar_url") //指定数据库的字段名称
    private String avatarUrl;
}
