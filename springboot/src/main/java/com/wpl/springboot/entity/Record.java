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
 *疫苗接种
 * @author wpl
 * @since 2022-04-09
 */
@Getter
@Setter
@TableName("sys_record")
@ApiModel(value = "Record对象", description = "")
public class Record implements Serializable {

    private static final long serialVersionUID = 1L;

      @ApiModelProperty("id")
      @TableId(value = "id", type = IdType.AUTO)
      private Long id;

      @ApiModelProperty("状态 是 否")
      private String statusOne;

      private String statusTwo;

      private String statusThree;

      @ApiModelProperty("厂家")
      private String brandOne;

      private String brandTwo;

      private String brandThree;

      @ApiModelProperty("接种时间")
      private LocalDate inoculationTimeOne;

      private LocalDate inoculationTimeTwo;

      private LocalDate inoculationTimeThree;

      private LocalDateTime createTime;

      private LocalDateTime updateTime;

      private String name;

      private String identityNum;

      private Integer userId;
}
