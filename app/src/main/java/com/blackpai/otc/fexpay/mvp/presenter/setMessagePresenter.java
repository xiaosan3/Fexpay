package com.blackpai.otc.fexpay.mvp.presenter;

import com.blackpai.otc.fexpay.Utils.RetrofitUtils;
import com.blackpai.otc.fexpay.mvp.contract.Contract;
import com.blackpai.otc.fexpay.mvp.model.IModel;

/**
 * Created by 77 on 2018/8/8.
 */

public class setMessagePresenter implements Contract.IsetMessagePresenter {

    private IModel iModel;
    private Contract.IGetMessageView iGetMessageView;

    public setMessagePresenter() {
        iModel = RetrofitUtils.getInstance();
    }


    @Override
    public void attachView(Contract.IGetMessageView view) {
        this.iGetMessageView = view;
    }

    @Override
    public void detachView() {

    }


    public void setMessage() {
//        Observable<Business> observable = iModel.getBusiness("application/x-www-form-urlencoded", advertiseType, isCertified, unit, coinType, paymentType);
//        observable.subscribeOn(Schedulers.newThread())
//                .observeOn(AndroidSchedulers.mainThread())
//                .subscribe(new Consumer<Business>() {
//                    @Override
//                    public void accept(final Business business) throws Exception {
//                        if (business.getMessage().equals("success")) {
//                            iGetMessageView.showMessage("成功！");
//                        }
//                        iGetMessageView.showBusiness(business);
//
//                    }
//                });
        iGetMessageView.showIntent();

    }

    @Override
    public void setMessage(String userName, String password, String confirmPassword, String nickName, String code, String payPassword, String confirmPayPassword) {

    }
}
