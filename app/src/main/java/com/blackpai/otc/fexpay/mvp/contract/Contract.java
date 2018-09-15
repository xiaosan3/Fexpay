package com.blackpai.otc.fexpay.mvp.contract;

import com.blackpai.otc.fexpay.base.BasePresenter;
import com.blackpai.otc.fexpay.bean.Business;
import com.blackpai.otc.fexpay.bean.Login;
import com.blackpai.otc.fexpay.bean.Property;


/**
 * Created by 77 on 2018/5/16.
 */

public interface Contract {
    //注册第一步
    public interface IsetRegisterPresenter extends BasePresenter<IGetRegisterView> {

        void setRegister();
    }

    public interface IGetRegisterView {

        void showMessage(String message);

        void showRegister();

        void showIntent();
    }

    //注册第二步
    public interface IsetMessagePresenter extends BasePresenter<IGetMessageView> {

        void setMessage(String userName, String password, String confirmPassword, String nickName, String code, String payPassword, String confirmPayPassword);
    }

    public interface IGetMessageView {

        void showMessage(String message);

        void showMessage();

        void showIntent();
    }

    //登录
    public interface IsetLoginPresenter extends BasePresenter<IGetLoginView> {

        void setLogin(String userName, String password);
    }

    public interface IGetLoginView {

        void showMessage(String message);

        void showLogin(Login login);

        void showIntent();
    }

    //获取首页数据
    public interface IsetBusinessPresenter extends BasePresenter<IGetBusinessView> {

        void setBusiness(String advertiseType, String isCertified, String unit, String coinType, String paymentType);
    }

    public interface IGetBusinessView {

        void showMessage(String message);

        void showBusiness(Business business);

        void showIntent();
    }

    //获取个人资产
    public interface IsetPropertyPresenter extends BasePresenter<IGetPropertyView> {

        void setProperty();
    }

    public interface IGetPropertyView {

        void showMessage(String message);

        void showProperty(Property property);

        void showIntent();

    }


}
