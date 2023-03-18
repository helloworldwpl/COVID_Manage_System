package com.wpl.springboot.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * <p>
 * 
 * </p>
 *病例史
 * @author wpl
 * @since 2022-04-09
 */
@Getter
@Setter
@TableName("sys_history")
@ApiModel(value = "History对象", description = "")
public class History implements Serializable {

    private static final long serialVersionUID = 1L;

      @ApiModelProperty("id")
      @TableId(value = "id", type = IdType.AUTO)
      private Long id;

      @ApiModelProperty("病名")
      private String name;

      @ApiModelProperty("医院")
      private String hospital;

      @ApiModelProperty("发生时间")
      private LocalDate happenTime;

      private LocalDateTime createTime;

      private LocalDateTime updateTime;

      @ApiModelProperty("用户id")
      private Integer userId;

      private String identityNum;

      private String userName;
}
