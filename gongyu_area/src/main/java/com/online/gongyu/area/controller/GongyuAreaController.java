package com.online.gongyu.area.controller;


import com.online.gongyu.area.commons.R;
import com.online.gongyu.area.entity.GongyuArea;
import com.online.gongyu.area.service.GongyuAreaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 * 区域 前端控制器
 * </p>
 *
 * @author testjava
 * @since 2020-04-20
 */
@RestController
@RequestMapping("/area/gongyu-area")
public class GongyuAreaController {

    @Autowired
    private GongyuAreaService gongyuAreaService;

    @GetMapping("/list")
    public R list(){

       GongyuArea gongyuArea =gongyuAreaService.getList();

       return R.ok().data("msg",gongyuArea);
    }

}

