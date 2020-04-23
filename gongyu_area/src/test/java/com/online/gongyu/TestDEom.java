package com.online.gongyu;

import org.apache.commons.lang3.StringUtils;
import org.junit.jupiter.api.Test;

import java.util.zip.DeflaterOutputStream;

/**
 * @author shkstart
 * @create 2020-04-22 14:10
 */
public class TestDEom {


    @Test
    public void test(){
        String s="a,ab,a,a,a,a,aa";
        String[] split = s.split(",",3);

        for (String s1 : split) {
            System.out.println(s1);
        }

    }
}
