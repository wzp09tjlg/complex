package com.wuzp.testrv.testNetwork.Utils;

import android.icu.text.SimpleDateFormat;

import java.util.Date;

/**
 * Created by wuzp on 2019/2/28.
 */
//公共方法的工具类
    @SuppressWarnings("all")
public class SystemUtil {
    private static final String NETWORK_TIME_TEMP = "yyyyMMddHHmmss";
    private static final SimpleDateFormat df = new SimpleDateFormat(NETWORK_TIME_TEMP);//设置日期格式

    //获取当前时间戳的方法
    @SuppressWarnings("all")
    public static final String getTimeTemp() {
        //每次获取时间都是从创建一个date 来获取时间
        String dateTemp = df.format(new Date());// new Date()为获取当前系统时间，也可使用当前时间戳
        return dateTemp;
    }
}
