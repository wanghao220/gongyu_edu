package com.online.gongyu.area.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import java.util.Date;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 房源-房子信息
 * </p>
 *
 * @author testjava
 * @since 2020-04-20
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@ApiModel(value="GongyuHouse对象", description="房源-房子信息")
public class GongyuHouse implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "主键")
    @TableId(value = "house_id", type = IdType.AUTO)
    private Integer houseId;

    @ApiModelProperty(value = "房子名称")
    private String houseName;

    @ApiModelProperty(value = "房子区域")
    private String houseArea;

    @ApiModelProperty(value = "房子附近地铁")
    private String houseMetro;

    @ApiModelProperty(value = "房子顾问")
    private String houseCounselor;

    @ApiModelProperty(value = "房子价格")
    private String housePrice;

    @ApiModelProperty(value = "房子介绍")
    private String houseDesc;

    @ApiModelProperty(value = "房子图片")
    private String houseImg;

    @ApiModelProperty(value = "房子户型")
    private String houseType;

    @ApiModelProperty(value = "房子添加时间")
    private Date houseTime;


}
