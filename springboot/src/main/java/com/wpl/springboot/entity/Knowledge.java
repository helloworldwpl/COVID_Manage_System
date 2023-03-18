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
 *
 * @author wpl
 * @since 2022-04-11
 */
@Getter
@Setter
@TableName("sys_knowledge")
@ApiModel(value = "Knowledge对象", description = "")
public class Knowledge implements Serializable {

    private static final long serialVersionUID = 1L;

      @ApiModelProperty("id")
      @TableId(value = "id", type = IdType.AUTO)
      private Long id;

      @ApiModelProperty("标题")
      private String title;

      @ApiModelProperty("内容")
      private String content;

      private LocalDateTime createTime;

      private LocalDateTime updateTime;

      @ApiModelProperty("发布人")
      private Long sendUserId;

      @ApiModelProperty("发布人姓名")
      private String sendUserName;

      @ApiModelProperty("发布日期")
      private LocalDate sendTime;


}
