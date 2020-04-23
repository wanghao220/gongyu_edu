package com.online.gongyu.area.dao;

import com.online.gongyu.area.entity.test;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author shkstart
 * @create 2020-04-21 10:49
 */

@Mapper
public interface AreaDao {

     List<test> getList();
}
