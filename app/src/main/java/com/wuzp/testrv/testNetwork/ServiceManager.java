package com.wuzp.testrv.testNetwork;

import java.util.concurrent.TimeUnit;

import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by wuzp on 2019/2/28.
 */
//这个类是真正封装retrofit的类
public class ServiceManager {

    private static OkHttpClient mOkHttpClient;
    private static Retrofit mRetrofit;

    private static ServiceProvider mServiceProvider;

    //连接超时时间
    private static final int CONNECT_TIME = 15;
    //读时间
    private static final int READ_TIME = 10;
    //写时间
    private static final int WRITE_TIME = 10;

    public static OkHttpClient getOkHttpClient() {
        if (mOkHttpClient == null) {
            OkHttpClient okHttpClient = new OkHttpClient.Builder()
                    .connectTimeout(CONNECT_TIME, TimeUnit.SECONDS)
                    .readTimeout(READ_TIME, TimeUnit.SECONDS)
                    .writeTimeout(WRITE_TIME, TimeUnit.SECONDS)
                    .build();
        }
        return mOkHttpClient;
    }

    public static Retrofit getRetrofit() {
        if (mRetrofit == null) {
            mRetrofit = new Retrofit.Builder().client(getOkHttpClient())
                    .baseUrl(PathFinal.SERVICE_HOST) //设置网络请求的Url地址
                    .addConverterFactory(GsonConverterFactory.create()) //设置数据解析器
                    .addCallAdapterFactory(RxJava2CallAdapterFactory.create())//设置转换的解释器
                    .build();
        }
        return mRetrofit;
    }

    public static ServiceProvider getServiceProvider(){
        if(mServiceProvider == null){
            mServiceProvider = getRetrofit().create(ServiceProvider.class);
        }
        return mServiceProvider;
    }

}
