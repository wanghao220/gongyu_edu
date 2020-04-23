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
 * 地铁
 * </p>
 *
 * @author testjava
 * @since 2020-04-20
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@ApiModel(value="GongyuMetro对象", description="地铁")
public class GongyuMetro implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "主键")
    @TableId(value = "metro_id", type = IdType.AUTO)
    private Integer metroId;

    @ApiModelProperty(value = "区域主键")
    private String areaId;

    @ApiModelProperty(value = "地铁名字")
    private String metroName;


    @TableField(exist = false)
    private List<GongyuMetroArea> gongyuMetroAreas;

}
