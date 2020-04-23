package com.online.gongyu.area.entity;

import com.baomidou.mybatisplus.annotation.IdType;
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
 * 区域地铁站名
 * </p>
 *
 * @author testjava
 * @since 2020-04-20
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@ApiModel(value="GongyuMetroArea对象", description="区域地铁站名")
public class GongyuMetroArea implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "区域主键")
    private Integer areaId;

    @ApiModelProperty(value = "地铁名字")
    private String metroId;

    @ApiModelProperty(value = "地铁站名字")
    private String subwayStation;


}
