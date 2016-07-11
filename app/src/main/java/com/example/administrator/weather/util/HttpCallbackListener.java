package com.example.administrator.weather.util;

/**
 * Created by Administrator on 2016/7/11.
 */
public interface  HttpCallbackListener {
    void onFinish(String responde);
    void onError(Exception e);
}
