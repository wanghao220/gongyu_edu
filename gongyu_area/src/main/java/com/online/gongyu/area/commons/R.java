package com.online.gongyu.area.commons;

import lombok.Data;

import java.util.HashMap;
import java.util.Map;

/**
 * @author shkstart
 * @create 2020-03-01 19:52
 */

@Data
public class R {

    private Boolean success;

    private Integer code;

    private String message;

    private Map<String,Object> data=new HashMap<>();


    private R(){}


    public static R ok(){

        R r = new R();

        r.setSuccess(true);

        r.setCode(ResultCode.SUCCESS);

        r.setMessage("操作成功");

        return r;

    }


    public static R error(){

        R r = new R();

        r.setSuccess(false);

        r.setCode(ResultCode.ERROR);

        r.setMessage("操作失败");

        return r;

    }

//    public static R setResult(ResultCodeEnum resultCodeEnum){
//
//        R r = new R();
//
//        r.setSuccess(resultCodeEnum.getSuccess());
//
//        r.setCode(resultCodeEnum.getCode());
//
//        r.setMessage(resultCodeEnum.getMessage());
//
//        return r;
//
//    }


    public R success(Boolean success){

        this.setSuccess(success);
         return this;

    }


    public R message(String message){

        this.setMessage(message);

        return this;

    }
    public R code(Integer code){

        this.setCode(code);

        return this;

    }
    public R data(String key, Object value){

        this.data.put(key, value);

        return this;

    }

    public R data(Map<String, Object> map){
        this.setData(map);
        return this;
    }
}


