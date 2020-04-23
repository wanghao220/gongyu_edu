package com.online.gongyu.area.controller;


import com.online.gongyu.area.commons.R;
import com.online.gongyu.area.entity.GongyuHouse;
import com.online.gongyu.area.service.GongyuHouseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 * 房源-房子信息 前端控制器
 * </p>
 *
 * @author testjava
 * @since 2020-04-20
 */
@RestController
@RequestMapping("/area/gongyu-house")
public class GongyuHouseController {

    @Autowired
    private GongyuHouseService gongyuHouseService;

    @PostMapping("/area")
    public R getArea( String area,
                     String metro,
                     String subwey) {

              List<GongyuHouse> list=gongyuHouseService.getList(area,metro,subwey);


        return R.ok().data("msg",list);
    }
}

