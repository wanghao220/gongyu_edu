package com.online.gongyu.area.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.online.gongyu.area.entity.*;
import com.online.gongyu.area.mapper.GongyuMetroAreaMapper;
import com.online.gongyu.area.service.GongyuAreaService;
import com.online.gongyu.area.service.GongyuMetroAreaService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.online.gongyu.area.service.GongyuMetroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * <p>
 * 区域地铁站名 服务实现类
 * </p>
 *
 * @author testjava
 * @since 2020-04-20
 */
@Service
public class GongyuMetroAreaServiceImpl extends ServiceImpl<GongyuMetroAreaMapper, GongyuMetroArea> implements GongyuMetroAreaService {


    //区域service
    @Autowired
    private GongyuAreaService gongyuAreaService;

    //地铁service
    @Autowired
    private GongyuMetroService gongyuMetroService;


    //查询所在区域的地铁
    @Override
    public List<test> getList() {

       List<test> lists = new ArrayList<>();


        //查询出所有的区域
        List<GongyuArea> areas = gongyuAreaService.list(null);

        //遍历区域，拿到区域id
        for (GongyuArea area : areas) {

            //返回的数据
            test test = new test();
            //地铁站名
            Subwey subwey = new Subwey();
            //地铁几号线
            List<Metro> metros1 = new ArrayList<>();
                //查询条件函数
            QueryWrapper queryWrapper = new QueryWrapper();
            //得到区域id
            Integer areaId = area.getAreaId();
            //根据区域id查询出本区域中的那一条地铁线
            queryWrapper.eq("area_id",areaId);
            //区域地铁线集合
            List<GongyuMetro> listMe= gongyuMetroService.list(queryWrapper);
            System.out.println(listMe);
            //遍历区域地铁线
            for (GongyuMetro metro : listMe) {
                //复制给中间实体函数
                Metro metro1 = new Metro();
                 metro1.setMetroId(metro.getMetroId());
                 metro1.setMetroName(metro.getMetroName());
                 //添加到中间实体集合
                 metros1.add(metro1);
            }

            //遍历中间实体集合
            for (Metro metro : metros1) {
                    //地铁站名中间集合
                List<Subwey> subweys = new ArrayList<>();
                //查询条件函数
                QueryWrapper queryWrapper1 = new QueryWrapper();
                //得到所在区域地铁线id
                Integer metroId = metro.getMetroId();
                //联合条件查询
                queryWrapper1.eq("area_id",areaId);
                queryWrapper1.eq("metro_id",metroId);
                //查询出地铁站名在所在区域和所在地铁线
                List<GongyuMetroArea> list = baseMapper.selectList(queryWrapper1);

                //遍历所在地铁站名
                for (GongyuMetroArea gongyuMetroArea : list) {
                    //赋值给中间实体类
                    Subwey subwey1 = new Subwey();
                    subwey1.setSubwayStation(gongyuMetroArea.getSubwayStation());
                    //地铁站名集合
                    subweys.add(subwey1);
                }
                //把站名添加到所在地铁线
                metro.setSubweys(subweys);

            }

            //复制中间实体类
            test.setAreaId(areaId);
            test.setAreaName(area.getAreaName());
            test.setMetros(metros1);

            //中间实体类集合
            lists.add(test);
//            System.out.println(test);
        }

        //返回结果
        return lists;
    }
    //查询所在区域的地铁
    @Override
    public List<GongyuArea> getList1() {

        List<GongyuArea> lists = new ArrayList<>();


        //查询出所有的区域
        List<GongyuArea> areas = gongyuAreaService.list(null);

        //遍历区域，拿到区域id
        for (GongyuArea area : areas) {

            //返回的数据
            GongyuArea test = new GongyuArea();
            //地铁站名
            GongyuMetroArea subwey = new GongyuMetroArea();
            //地铁几号线
//            List<GongyuMetro> metros1 = new ArrayList<>();
            //查询条件函数
            QueryWrapper queryWrapper = new QueryWrapper();
            //得到区域id
            Integer areaId = area.getAreaId();
            //根据区域id查询出本区域中的那一条地铁线
            queryWrapper.eq("area_id",areaId);
            //区域地铁线集合
            List<GongyuMetro> listMe= gongyuMetroService.list(queryWrapper);
            System.out.println(listMe);
            //遍历区域地铁线
            for (GongyuMetro metro : listMe) {
                //地铁站名中间集合
                List<GongyuMetroArea> subweys = new ArrayList<>();
                //查询条件函数
                QueryWrapper queryWrapper1 = new QueryWrapper();
                //得到所在区域地铁线id
                Integer metroId = metro.getMetroId();
                //联合条件查询
                queryWrapper1.eq("area_id",areaId);
                queryWrapper1.eq("metro_id",metroId);
                //查询出地铁站名在所在区域和所在地铁线
                List<GongyuMetroArea> list = baseMapper.selectList(queryWrapper1);

                //遍历所在地铁站名
                for (GongyuMetroArea gongyuMetroArea : list) {
                    //赋值给中间实体类
                    GongyuMetroArea subwey1 = new GongyuMetroArea();
                    subwey1.setSubwayStation(gongyuMetroArea.getSubwayStation());
                    //地铁站名集合
                    subweys.add(subwey1);
                }
                //把站名添加到所在地铁线
                metro.setGongyuMetroAreas(subweys);

            }

            //复制中间实体类
            test.setAreaId(areaId);
            test.setAreaName(area.getAreaName());
            test.setMetros(listMe);

            //中间实体类集合
            lists.add(test);
//            System.out.println(test);
        }

        //返回结果
        return lists;
    }
}
