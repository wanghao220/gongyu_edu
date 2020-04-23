package com.online.gongyu.area.service;

import com.online.gongyu.area.entity.GongyuHouse;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 * 房源-房子信息 服务类
 * </p>
 *
 * @author testjava
 * @since 2020-04-20
 */
public interface GongyuHouseService extends IService<GongyuHouse> {


    List<GongyuHouse> getList(String area, String metro, String subwey);
}
