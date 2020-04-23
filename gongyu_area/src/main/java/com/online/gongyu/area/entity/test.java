package com.online.gongyu.area.entity;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * @author shkstart
 * @create 2020-04-20 14:19
 */

@Data
public class test implements Serializable {

        private int areaId;
        private String areaName;

        private List<Metro> metros;



}
