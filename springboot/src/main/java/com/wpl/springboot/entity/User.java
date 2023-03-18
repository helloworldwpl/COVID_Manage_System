package com.wpl.springboot.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;

import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonIgnore;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

/**
 * <p>
 * 
 * </p>
 *
 * @author wpl
 * @since 2022-04-08
 */
@Data
@ApiModel(value = "User对象", description = "")
@TableName("user")
public class User implements Serializable {

    private static final long serialVersionUID = 1L;

      @ApiModelProperty("id")
      @TableId(value = "id", type = IdType.AUTO)
      private Long id;

      @ApiModelProperty("用户名")
      private String username;

      @ApiModelProperty("密码")
      @JsonIgnore
      private String password;

      @ApiModelProperty("邮箱地址")
      private String email;

      @ApiModelProperty("ROLE_ADMIN 管理员")
      private String role;

      @ApiModelProperty("姓名")
      private String name;

      @ApiModelProperty("出生日期")
      private LocalDate birthday;

      @ApiModelProperty("身份证")
      @TableField("identity_num")
      private String identityNum;

      @ApiModelProperty("电话号码")
      private String phone;

      @ApiModelProperty("家庭住址")
      private String address;

      private LocalDateTime createTime;

      private LocalDateTime updateTime;

      @ApiModelProperty("头像地址")
      private String avatarUrl;


}
