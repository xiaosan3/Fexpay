package com.blackpai.otc.fexpay.base;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;

import com.blackpai.otc.fexpay.App.App;
import com.blackpai.otc.fexpay.Utils.authority.AuthorityUtils;
import com.gyf.barlibrary.ImmersionBar;
import com.zhy.autolayout.AutoLayoutActivity;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

/**
 * Created by 77 on 2018/5/1.
 */

public abstract class BaseActivity<T extends BasePresenter> extends AutoLayoutActivity {

    private Fragment lastFragment;
    protected T presenter;
    private ImmersionBar mImmersionBar;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getContentView());
        App.context = this;
        //p层自动实例化
        presenter = getPresenter();
        if (presenter != null) {
            presenter.attachView(this);

        }
        new AuthorityUtils().getPermission();

        mImmersionBar = ImmersionBar.with(this);
        mImmersionBar.init();   //所有子类都将继承这些相同的属性


    }

    @Override
    protected void onResume() {
        super.onResume();
        App.context = this;
        initView();
        initToolBar();
        initData();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        if (presenter != null)
            presenter.detachView();

        if (mImmersionBar != null)
            mImmersionBar.destroy();  //必须调用该方法，防止内存泄漏，不调用该方法，如果界面bar发生改变，在不关闭app的情况下，退出此界面再进入将记忆最后一次bar改变的状态

    }

    //获取Activity布局
    protected abstract int getContentView();

    //初始化视图
    protected abstract void initView();

    //初始化数据
    protected abstract void initData();

    //初始化标题栏
    protected abstract void initToolBar();

    protected BaseFragment setContentView(Class<? extends BaseFragment> fragmentClass, int FrameLayoutId) {
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction transaction = fragmentManager.beginTransaction();
        String fragmentName = fragmentClass.getSimpleName();
        BaseFragment fragment = (BaseFragment) fragmentManager.findFragmentByTag(fragmentName);

        try {
            if (fragment == null) {
                fragment = fragmentClass.newInstance();
                transaction.add(FrameLayoutId, fragment, fragmentName);
            }
            if (lastFragment != null)
                transaction.hide(lastFragment);
            transaction.show(fragment);
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        lastFragment = fragment;
        transaction.commit();
        return fragment;
    }

    private T getPresenter() {
        Type type = getClass().getGenericSuperclass();
        if (type.equals(BaseActivity.class))
            return null;
        Type[] arguments = ((ParameterizedType) type).getActualTypeArguments();
        if (arguments.length == 0)
            return null;
        Class<T> tClass = (Class<T>) (arguments[0]);
        try {
            return tClass.newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        return null;
    }


}
