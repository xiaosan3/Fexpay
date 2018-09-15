package com.blackpai.otc.fexpay.mvp.presenter;

import com.blackpai.otc.fexpay.Utils.RetrofitUtils;
import com.blackpai.otc.fexpay.bean.Login;
import com.blackpai.otc.fexpay.mvp.contract.Contract;
import com.blackpai.otc.fexpay.mvp.model.IModel;

import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.functions.Consumer;
import io.reactivex.schedulers.Schedulers;

/**
 * Created by 77 on 2018/8/8.
 */

public class setLoginPresenter implements Contract.IsetLoginPresenter {

    private IModel iModel;
    private Contract.IGetLoginView iGetLoginView;

    public setLoginPresenter() {
        iModel = RetrofitUtils.getInstance();
    }


    @Override
    public void attachView(Contract.IGetLoginView view) {
        this.iGetLoginView = view;
    }

    @Override
    public void detachView() {

    }


    @Override
    public void setLogin(String userName, String password) {
        if (userName.equals("")) {
            iGetLoginView.showMessage("用户名不能为空");
            return;
        }
        if (password.equals("")) {
            iGetLoginView.showMessage("密码不能为空");
            return;
        }

        Observable<Login> observable = iModel.getLogin("application/x-www-form-urlencoded", userName, password);
        observable.subscribeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Consumer<Login>() {
                    @Override
                    public void accept(final Login login) throws Exception {
                        if (login.getMessage().equals("success")) {
                            iGetLoginView.showMessage("成功！");
                            iGetLoginView.showLogin(login);
                            iGetLoginView.showIntent();

                        } else {
                            iGetLoginView.showMessage("用户名或者密码错误");
                        }

                    }
                });

    }
}
