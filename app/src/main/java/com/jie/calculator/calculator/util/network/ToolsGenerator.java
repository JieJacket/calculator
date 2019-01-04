package com.jie.calculator.calculator.util.network;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.jie.calculator.calculator.util.CommonConstants;

import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created on 2019/1/4.
 *
 * @author Jie.Wu
 */
public class ToolsGenerator {

    private OkHttpClient client = new OkHttpClient();

    private ToolsGenerator() {
    }

    private static final class LazyHolder {
        private static final ToolsGenerator instance = new ToolsGenerator();
    }

    public static ToolsGenerator getInst() {
        return LazyHolder.instance;
    }

    private Retrofit build(String baseUrl) {
        return new Retrofit.Builder()
                .baseUrl(baseUrl)
                .addConverterFactory(GsonConverterFactory.create(getGson()))
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .client(client)
                .build();

    }

    private Gson getGson() {
        return new GsonBuilder().setLenient().create();
    }

    public IMiServer getIMiServer() {
        return getIMiServer(CommonConstants.URL1);
    }

    public IMiServer getIMiServer(String baseUrl) {
        return build(baseUrl).create(IMiServer.class);
    }
}
