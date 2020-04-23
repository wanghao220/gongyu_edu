package com.online.gongyu.area.service;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.online.gongyu.area.entity.GongyuArea;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 * 区域 服务类
 * </p>
 *
 * @author testjava
 * @since 2020-04-20
 */
public interface GongyuAreaService extends IService<GongyuArea> {

    GongyuArea getList();
}
