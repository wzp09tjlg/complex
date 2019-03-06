package com.wuzp.testrv.testNetwork;

import com.wuzp.testrv.testNetwork.Utils.SystemUtil;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by wuzp on 2019/2/28.
 */
//这个类是添加公参的帮助类
public class ParamsHelper {

    //公共参数
    public Map<String, String> mCommonParams = new HashMap<>();

    //公共参数是KEY
    public static final String showapi_appid = "showapi_appid"; //申请的appId
    public static final String showapi_timestamp = "showapi_timestamp";//时间戳
    public static final String showapi_sign = "showapi_sign";//这个参数是根据其他参数的规则排序得到的

    public static Map<String, String> getCommonParams() {
        Map<String, String> params = new HashMap<>();
        params.put(showapi_appid, AppConst.APP_ID);
        params.put(showapi_timestamp, SystemUtil.getTimeTemp());
        return params;
    }
}
