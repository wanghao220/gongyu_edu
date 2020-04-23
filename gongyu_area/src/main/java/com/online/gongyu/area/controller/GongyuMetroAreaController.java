package com.online.gongyu.area.controller;


import com.online.gongyu.area.commons.R;
import com.online.gongyu.area.entity.GongyuArea;
import com.online.gongyu.area.entity.GongyuMetroArea;
import com.online.gongyu.area.entity.test;
import com.online.gongyu.area.service.GongyuMetroAreaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * <p>
 * 区域地铁站名 前端控制器
 * </p>
 *
 * @author testjava
 * @since 2020-04-20
 */
@RestController
@RequestMapping("/area/gongyu-metro-area")
public class GongyuMetroAreaController {

    //service方法
    @Autowired
    GongyuMetroAreaService gongyuMetroAreaService;

    //遍历区域，区域下地铁线路，区域下地铁线路的地铁站名
    @GetMapping("/list")
    public R getList(){

        //调用service层方法接口
//       List<test> gongyuMetroAreas =gongyuMetroAreaService.getList();
        List<GongyuArea> gongyuMetroAreas =gongyuMetroAreaService.getList1();
       //返回结果
        return R.ok().data("msg",gongyuMetroAreas);
    }




}

