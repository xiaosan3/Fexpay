package com.blackpai.otc.fexpay.base;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.gyf.barlibrary.ImmersionBar;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

/**
 * Created by 77 on 2018/5/1.
 */

public abstract class BaseFragment<T extends BasePresenter> extends Fragment {

    private Fragment lastFragment;
    protected T presenter;
    private ImmersionBar mImmersionBar;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(getCreateView(), container, false);

    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        presenter = getPresenter();
        if (presenter != null)
            presenter.attachView(this);
        initView(view);
        initData(view);
        mImmersionBar = ImmersionBar.with(this);
        mImmersionBar.init();   //所有子类都将继承这些相同的属性
    }

    @Override
    public void onHiddenChanged(boolean hidden) {
        super.onHiddenChanged(hidden);
        if (!hidden && mImmersionBar != null)
            mImmersionBar.init();

    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        if (presenter != null)
            presenter.detachView();
        if (mImmersionBar != null)
            mImmersionBar.destroy();
    }

    private T getPresenter() {
        Type type = getClass().getGenericSuperclass();
        if (type.equals(BaseFragment.class))
            return null;
        Type[] arguments = ((ParameterizedType) type).getActualTypeArguments();
        if (arguments.length == 0)
            return null;
        Class<T> tClass = (Class<T>) (arguments[0]);
        try {
            return tClass.newInstance();
        } catch (java.lang.InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        return null;
    }

    //获取View的xml文件
    protected abstract int getCreateView();

    //初始化视图
    protected abstract void initView(View view);

    //初始化数据
    protected abstract void initData(View view);

    public BaseFragment setContentView(Class<? extends BaseFragment> fragmentClass, int FrameLayoutId) {
        FragmentManager fragmentManager = getActivity().getSupportFragmentManager();
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
        } catch (java.lang.InstantiationException e) {


        }
        lastFragment = fragment;
        transaction.commit();
        return fragment;
    }

}