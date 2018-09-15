package com.blackpai.otc.fexpay.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.ArrayList;

/**
 * Created by 77 on 2018/4/15.
 */

public class TabLayoutAdapter extends FragmentPagerAdapter {
    ArrayList<String> arrayList;
    ArrayList<Fragment> fragments;

    public TabLayoutAdapter(FragmentManager fm, ArrayList<String> arrayList, ArrayList<Fragment> fragments) {
        super(fm);
        this.arrayList = arrayList;
        this.fragments = fragments;
    }

    @Override
    public Fragment getItem(int position) {
        return fragments.get(position);
    }

    @Override
    public int getCount() {
        return fragments.size();
    }

    //获取pager的头布局


    @Override
    public CharSequence getPageTitle(int position) {
        return arrayList.get(position);
    }
}
