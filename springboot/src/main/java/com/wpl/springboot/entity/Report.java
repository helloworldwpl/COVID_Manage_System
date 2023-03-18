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
 *核酸
 * @author wpl
 * @since 2022-04-09
 */
@Getter
@Setter
@TableName("sys_report")
@ApiModel(value = "Report对象", description = "")
public class Report implements Serializable {

    private static final long serialVersionUID = 1L;

      @ApiModelProperty("id")
      @TableId(value = "id", type = IdType.AUTO)
      private Long id;

      @ApiModelProperty("医院")
      private String hospital;

      @ApiModelProperty("检测时间")
      private LocalDate happenTime;

      @ApiModelProperty("结果")
      private String result;

      private LocalDateTime createTime;

      private LocalDateTime updateTime;

      @ApiModelProperty("用户id")
      private Long userId;

      private String userName;

      private String identityNum;


}
