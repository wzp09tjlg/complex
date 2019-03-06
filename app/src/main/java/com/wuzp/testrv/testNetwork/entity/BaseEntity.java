package com.wuzp.testrv.testNetwork.entity;

import java.io.Serializable;

/**
 * Created by wuzp on 2019/2/28.
 */
//所有易源数据接口的基类entity
public class BaseEntity<T> implements Serializable {
    public int showapi_res_code;
    public String showapi_res_error;
    public String showapi_res_id;
    public T showapi_res_body;
}
