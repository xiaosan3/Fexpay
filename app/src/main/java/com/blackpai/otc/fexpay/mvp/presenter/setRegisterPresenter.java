package com.blackpai.otc.fexpay.mvp.presenter;

import com.blackpai.otc.fexpay.Utils.RetrofitUtils;
import com.blackpai.otc.fexpay.mvp.contract.Contract;
import com.blackpai.otc.fexpay.mvp.model.IModel;

/**
 * Created by 77 on 2018/8/8.
 */

public class setRegisterPresenter implements Contract.IsetRegisterPresenter {

    private IModel iModel;
    private Contract.IGetRegisterView iGetRegisterView;

    public setRegisterPresenter() {
        iModel = RetrofitUtils.getInstance();
    }


    @Override
    public void attachView(Contract.IGetRegisterView view) {
        this.iGetRegisterView = view;
    }

    @Override
    public void detachView() {

    }


    @Override
    public void setRegister() {
//        Observable<Business> observable = iModel.getBusiness();
//        observable.subscribeOn(Schedulers.newThread())
//                .observeOn(AndroidSchedulers.mainThread())
//                .subscribe(new Consumer<Business>() {
//                    @Override
//                    public void accept(final Business business) throws Exception {
//                        if (business.getMessage().equals("success")) {
//                            iGetRegisterView.showMessage("成功！");
//                        }
//                        iGetRegisterView.showRegister();
//
//                    }
//                });

        iGetRegisterView.showIntent();
    }
}
