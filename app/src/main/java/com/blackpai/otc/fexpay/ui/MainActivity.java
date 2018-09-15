package com.blackpai.otc.fexpay.ui;

import android.widget.FrameLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import com.blackpai.otc.fexpay.R;
import com.blackpai.otc.fexpay.base.BaseActivity;
import com.blackpai.otc.fexpay.ui.fragments.my.MyFragment;
import com.blackpai.otc.fexpay.ui.fragments.order.OrderFragment;
import com.blackpai.otc.fexpay.ui.fragments.property.PropertyFragment;
import com.blackpai.otc.fexpay.ui.fragments.transaction.TransactionFragment;

public class MainActivity extends BaseActivity implements RadioGroup.OnCheckedChangeListener {


    private FrameLayout mian_fragment;
    private RadioButton transaction;
    private RadioButton order;
    private RadioButton property;
    private RadioButton my;
    private RadioGroup rg_all;

    @Override
    protected int getContentView() {
        return R.layout.activity_main;
    }

    @Override
    protected void initView() {

        mian_fragment = (FrameLayout) findViewById(R.id.mian_fragment);
        rg_all = (RadioGroup) findViewById(R.id.rg_all);
        transaction = (RadioButton) findViewById(R.id.transaction);
        order = (RadioButton) findViewById(R.id.order);
        property = (RadioButton) findViewById(R.id.property);
        my = (RadioButton) findViewById(R.id.my);
        rg_all.setOnCheckedChangeListener(this);
    }

    @Override
    protected void initData() {

        setContentView(TransactionFragment.class, R.id.mian_fragment);

    }

    @Override
    protected void initToolBar() {

    }


    @Override
    public void onCheckedChanged(RadioGroup group, int checkedId) {
        switch (checkedId){
            case R.id.transaction:

                setContentView(TransactionFragment.class, R.id.mian_fragment);
                break;
            case R.id.order:
                setContentView(OrderFragment.class, R.id.mian_fragment);
                break;
            case R.id.property:
                setContentView(PropertyFragment.class, R.id.mian_fragment);
                break;
            case R.id.my:
                setContentView(MyFragment.class, R.id.mian_fragment);
                break;
        }
    }
}
