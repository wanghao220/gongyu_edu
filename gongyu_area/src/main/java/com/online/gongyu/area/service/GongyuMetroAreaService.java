package com.online.gongyu.area.service;

import com.online.gongyu.area.entity.GongyuArea;
import com.online.gongyu.area.entity.GongyuMetroArea;
import com.baomidou.mybatisplus.extension.service.IService;
import com.online.gongyu.area.entity.test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * <p>
 * 区域地铁站名 服务类
 * </p>
 *
 * @author testjava
 * @since 2020-04-20
 */
public interface GongyuMetroAreaService extends IService<GongyuMetroArea> {


    //遍历区域，区域下地铁线路，区域下地铁线路的地铁站名的接口
    List<test> getList();

    List<GongyuArea> getList1();
}
