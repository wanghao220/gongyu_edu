package com.online.gongyu.area.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import java.util.List;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 区域
 * </p>
 *
 * @author testjava
 * @since 2020-04-20
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@ApiModel(value="GongyuArea对象", description="区域")
public class GongyuArea implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "主键")
    @TableId(value = "area_id", type = IdType.AUTO)
    private Integer areaId;

    @ApiModelProperty(value = "区域名字")
    private String areaName;

    @TableField(exist = false)
   private List<GongyuMetro > metros;



}
