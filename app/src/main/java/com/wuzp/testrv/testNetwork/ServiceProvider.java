package com.wuzp.testrv.testNetwork;

import com.wuzp.testrv.testNetwork.entity.BaseEntity;
import com.wuzp.testrv.testNetwork.entity.JokeEntity;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by wuzp on 2019/2/28.
 */
//这个类就是定义的请求服务的类
public interface ServiceProvider {

    @GET(PathFinal.JOKE_PATH)
    Call<BaseEntity<JokeEntity>> getJokeData(String page,String maxSize);
}
