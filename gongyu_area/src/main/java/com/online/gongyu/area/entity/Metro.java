package com.online.gongyu.area.entity;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.List;

/**
 * @author shkstart
 * @create 2020-04-20 16:16
 */
@Data
public class Metro {

    private Integer metroId;
    private String metroName;
   private List<Subwey> subweys;
}
