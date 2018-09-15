package com.blackpai.otc.fexpay.Utils;

import com.blackpai.otc.fexpay.mvp.model.IModel;
import com.blackpai.otc.fexpay.url.Urls;
import com.franmontiel.persistentcookiejar.ClearableCookieJar;
import com.franmontiel.persistentcookiejar.PersistentCookieJar;
import com.franmontiel.persistentcookiejar.cache.SetCookieCache;
import com.franmontiel.persistentcookiejar.persistence.SharedPrefsCookiePersistor;
import com.jakewharton.retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;

import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

import static com.blackpai.otc.fexpay.App.App.context;

/**
 * Created by 77 on 2018/5/16.
 */

public class RetrofitUtils {
    private static IModel iRetorfitModel;

    private IModel RetrofitUtilss() {

        ClearableCookieJar cookieJar = new PersistentCookieJar(new SetCookieCache(), new SharedPrefsCookiePersistor(context));
        OkHttpClient okHttpClient = new OkHttpClient.Builder()
                .cookieJar(cookieJar)
                .build();
        //创建Retrofit对象
        //创建服务器地址
        //创建转换器工厂
        //创建服务器地址
        //创建转换器工厂
        //告诉Retrofit使用rxjava来执行网络请求
        //创建服务器地址
        //告诉Retrofit使用rxjava来执行网络请求
        return new Retrofit.Builder()
                //创建服务器地址
                .baseUrl(Urls.OTC)
                .addConverterFactory(GsonConverterFactory.create())
                //告诉Retrofit使用rxjava来执行网络请求
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .client(okHttpClient)
                .build()
                .create(IModel.class);

    }


    //用单一实例来调用这个方法
    public static IModel getInstance() {
        if (iRetorfitModel == null) {
            iRetorfitModel = new RetrofitUtils().RetrofitUtilss();
        }
        return iRetorfitModel;
    }
}
