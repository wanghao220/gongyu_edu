package com.online.gongyu.area.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.online.gongyu.area.entity.GongyuHouse;
import com.online.gongyu.area.mapper.GongyuHouseMapper;
import com.online.gongyu.area.service.GongyuHouseService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.List;

/**
 * <p>
 * 房源-房子信息 服务实现类
 * </p>
 *
 * @author testjava
 * @since 2020-04-20
 */
@Service
public class GongyuHouseServiceImpl extends ServiceImpl<GongyuHouseMapper, GongyuHouse> implements GongyuHouseService {


    @Override
    public List<GongyuHouse> getList(String area, String metro, String subwey) {
        QueryWrapper queryWrapper = new QueryWrapper<>();

        queryWrapper.like(org.apache.commons.lang3.StringUtils.isNotBlank(area),"house_area",area);
        queryWrapper.like(org.apache.commons.lang3.StringUtils.isNotBlank(metro),"house_metro",metro);
        queryWrapper.like(org.apache.commons.lang3.StringUtils.isNotBlank(subwey),"station_name",subwey);
        List<GongyuHouse> list = baseMapper.selectList(queryWrapper);


        return list;
    }



}