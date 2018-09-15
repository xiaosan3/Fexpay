package com.blackpai.otc.fexpay.base;

/**
 * Created by 77 on 2018/5/4.
 */

public interface BasePresenter<T> {

    void attachView(T view);

    void detachView();
}
