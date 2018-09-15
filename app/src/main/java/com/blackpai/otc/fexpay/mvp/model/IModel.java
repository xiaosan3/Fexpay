package com.blackpai.otc.fexpay.mvp.model;

import com.blackpai.otc.fexpay.bean.Business;
import com.blackpai.otc.fexpay.bean.Login;
import com.blackpai.otc.fexpay.bean.Property;
import com.blackpai.otc.fexpay.url.Urls;

import io.reactivex.Observable;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.Header;
import retrofit2.http.POST;

/**
 * Created by 77 on 2018/5/16.
 */

public interface IModel {

    //注册
    @FormUrlEncoded
    @POST(Urls.REGISTER)
    Observable<Login> getLogin(@Header("Content-Type") String Content_Type, @Field("userName") String userName, @Field("password") String password, @Field("confirmPassword") String confirmPassword, @Field("countryCode") String countryCode, @Field("nickName") String nickName, @Field("code") String code, @Field("type") String type, @Field("payPassword") String payPassword, @Field("confirmPayPassword") String confirmPayPassword);

    //登录
    @FormUrlEncoded
    @POST(Urls.LOGIN)
    Observable<Login> getLogin(@Header("Content-Type") String Content_Type, @Field("userName") String userName, @Field("password") String password);

    //获取个人资产
    @POST(Urls.PROPERTY)
    Observable<Property> getProperty(@Header("Content-Type") String Content_Type);


    //获取买卖订单信息
    @FormUrlEncoded
    @POST(Urls.BUSINESSOTC)
    Observable<Business> getBusiness(@Header("Content-Type") String Content_Type, @Field("advertiseType") String advertiseType, @Field("isCertified") String isCertified, @Field("unit") String unit, @Field("coinType") String coinType, @Field("paymentType") String paymentType);

}
