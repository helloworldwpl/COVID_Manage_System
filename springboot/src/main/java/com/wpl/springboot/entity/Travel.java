package com.wpl.springboot.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;

import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * <p>
 * 
 * </p>
 *
 * @author wpl
 * @since 2022-04-11
 */
@Getter
@Setter
@ApiModel(value = "Travel对象", description = "")
@TableName("travel")
public class Travel implements Serializable {

    private static final long serialVersionUID = 1L;

      @ApiModelProperty("id")
      @TableId(value = "id", type = IdType.AUTO)
      private Long id;

      @ApiModelProperty("起始地点")
      private String sourceName;

      @ApiModelProperty("出行时间")
      private LocalDate happenTime;

      private LocalDateTime createTime;

      private LocalDateTime updateTime;

      private Integer userId;

      private String userName;

    private String identityNum;

      @ApiModelProperty("目的地")
      private String destination;


}
