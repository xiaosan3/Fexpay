package com.blackpai.otc.fexpay.ui.fragments.transaction;


import android.app.Activity;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.Toolbar;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.blackpai.otc.fexpay.R;
import com.blackpai.otc.fexpay.base.BaseFragment;
import com.blackpai.otc.fexpay.ui.fragments.transaction.buy.BuyFragment;
import com.blackpai.otc.fexpay.ui.fragments.transaction.sell.SellFragment;
import com.blackpai.otc.fexpay.Utils.sharedpreferences.SharedPreferencesUtils;

/**
 * A simple {@link Fragment} subclass.
 */
public class TransactionFragment extends BaseFragment implements View.OnClickListener, RadioGroup.OnCheckedChangeListener {

    private Toolbar toolbar;
    private BuyFragment buyFragment;
    private SellFragment sellFragment;
    private ImageView t_qr_code;
    private LinearLayout t_select_money;
    private TextView t_select_cny;
    private TextView t_select_btc;
    private TextView t_screen;
    private View t_buy_buttom;
    private View t_sell_buttom;
    private RadioGroup flat_money_rg;
    private RadioGroup number_money_rg;
    private RadioButton currency_cny;
    private RadioButton currency_usd;
    private RadioButton currency_btc;
    private RadioButton currency_eth;
    private RadioButton currency_und;
    //设置变量
    private boolean legal = true;
    private int num = 1;
    private RelativeLayout t_buy;
    private RelativeLayout t_sell;
    private FrameLayout business_fragment;
    private Bundle bundle;

    @Override
    protected int getCreateView() {
        return R.layout.fragment_transaction;
    }

    @Override
    protected void initView(View view) {
        toolbar = view.findViewById(R.id.toolbar);
        t_qr_code = view.findViewById(R.id.t_qr_code);
        t_select_money = view.findViewById(R.id.t_select_money);
        t_select_cny = view.findViewById(R.id.t_select_cny);
        t_select_btc = view.findViewById(R.id.t_select_btc);
        t_buy_buttom = view.findViewById(R.id.t_buy_buttom);
        t_sell_buttom = view.findViewById(R.id.t_sell_buttom);
        t_screen = view.findViewById(R.id.t_screen);
        t_qr_code.setOnClickListener(this);
        t_select_money.setOnClickListener(this);
        t_screen.setOnClickListener(this);

        t_buy = view.findViewById(R.id.t_buy);
        t_sell = view.findViewById(R.id.t_sell);
        business_fragment = view.findViewById(R.id.business_fragment);
        t_buy.setOnClickListener(this);
        t_sell.setOnClickListener(this);
    }

    @Override
    protected void initData(View view) {

        //首次进来我们的数据保存和我们的展示界面，为我们的我要买入页面

        SharedPreferencesUtils.getInstance().setSharedPreferencesString("advertiseType", "ONLINE_BUYING");
        SharedPreferencesUtils.getInstance().setSharedPreferencesString("coinType", "CNY");
        SharedPreferencesUtils.getInstance().setSharedPreferencesString("unit", "1");

        setContentView(BuyFragment.class, R.id.business_fragment);


        t_buy_buttom.setVisibility(View.VISIBLE);
    }


    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.t_buy:
                //我要买入
                t_buy_buttom.setVisibility(View.VISIBLE);
                t_sell_buttom.setVisibility(View.GONE);
                SharedPreferencesUtils.getInstance().setSharedPreferencesString("advertiseType", "ONLINE_BUYING");
                setContentView(BuyFragment.class, R.id.business_fragment);
                break;
            case R.id.t_sell:
                //我要卖出
                t_sell_buttom.setVisibility(View.VISIBLE);
                t_buy_buttom.setVisibility(View.GONE);
                SharedPreferencesUtils.getInstance().setSharedPreferencesString("advertiseType", "ONLINE_SALE");
                setContentView(BuyFragment.class, R.id.business_fragment);
                break;
            case R.id.t_qr_code:
                //二维码
                Toast.makeText(getContext(), "点击", Toast.LENGTH_SHORT).show();
                startActivity(new Intent(getContext(), SweepCodeActivity.class));
                break;
            case R.id.t_select_money:
                //币种
                selectCurrency(R.layout.select_currency);
                break;
            case R.id.t_screen:
                //筛选
                selectFilter(R.layout.t_filter);
                break;
        }
    }


    /**
     * 选择币种
     *
     * @param select_currency
     */
    private void selectCurrency(int select_currency) {

        //获取布局
        View view = LayoutInflater.from(getContext()).inflate(select_currency, null);
        //设置布局，给PopupWindow
        PopupWindow popupWindow = new PopupWindow(view, ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT, true);
        //设置其他地方可以点击
        popupWindow.setOutsideTouchable(true);
        //设置屏幕透明度
        setBackgroundAlpha(0.5f);
        //设置背景颜色
        popupWindow.setBackgroundDrawable(new ColorDrawable());
        //设置相对于布局的位置
        popupWindow.showAsDropDown(toolbar, Gravity.BOTTOM, 0, 0);
        popupWindow.setOnDismissListener(new PopupWindow.OnDismissListener() {
            @Override
            public void onDismiss() {
                // popupWindow隐藏时恢复屏幕正常透明度
                setBackgroundAlpha(1.0f);
            }
        });
        initCurrencyView(view);

    }

    private void initCurrencyView(View view) {

        flat_money_rg = view.findViewById(R.id.flat_money_rg);
        number_money_rg = view.findViewById(R.id.number_money_rg);
        currency_cny = view.findViewById(R.id.currency_cny);
        currency_usd = view.findViewById(R.id.currency_usd);
        currency_btc = view.findViewById(R.id.currency_btc);
        currency_eth = view.findViewById(R.id.currency_eth);
        currency_und = view.findViewById(R.id.currency_und);
        flat_money_rg.setOnCheckedChangeListener(this);
        number_money_rg.setOnCheckedChangeListener(this);

        //首次进入，法定货币，CNY,数字货币BTC
        if (legal == true) {
            currency_cny.setChecked(true);
        } else {
            currency_usd.setChecked(true);
        }

        if (num == 1) {
            currency_btc.setChecked(true);
        } else if (num == 2) {
            currency_eth.setChecked(true);
        } else if (num == 3) {
            currency_und.setChecked(true);
        }

    }

    private void selectFilter(int t_filter) {
        //获取布局
        View view = LayoutInflater.from(getContext()).inflate(t_filter, null);
        //设置布局，给PopupWindow
        PopupWindow popupWindow = new PopupWindow(view, ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT, true);
        //设置其他地方可以点击
        popupWindow.setOutsideTouchable(true);
        //设置屏幕透明度
        setBackgroundAlpha(0.5f);
        //设置背景颜色
        popupWindow.setBackgroundDrawable(new ColorDrawable());
        //设置相对于布局的位置
        popupWindow.showAsDropDown(toolbar, Gravity.BOTTOM, 0, 0);

        popupWindow.setOnDismissListener(new PopupWindow.OnDismissListener() {
            @Override
            public void onDismiss() {
                // popupWindow隐藏时恢复屏幕正常透明度
                setBackgroundAlpha(1.0f);
            }
        });
        initFilter(view);
    }

    private void initFilter(View view) {


    }

    @Override
    public void onCheckedChanged(RadioGroup group, int checkedId) {
        switch (checkedId) {
            case R.id.currency_cny:
                SharedPreferencesUtils.getInstance().setSharedPreferencesString("coinType", "CNY");
                setContentView(BuyFragment.class, R.id.business_fragment);
                t_select_cny.setText("CNY");
                legal = true;
                break;
            case R.id.currency_usd:
                SharedPreferencesUtils.getInstance().setSharedPreferencesString("coinType", "USD");
                setContentView(BuyFragment.class, R.id.business_fragment);
                legal = false;
                t_select_cny.setText("USD");
                break;
            case R.id.currency_btc:
                SharedPreferencesUtils.getInstance().setSharedPreferencesString("unit", "1");
                setContentView(BuyFragment.class, R.id.business_fragment);
                t_select_btc.setText("BTC");

                num = 1;
                break;
            case R.id.currency_eth:
                SharedPreferencesUtils.getInstance().setSharedPreferencesString("unit", "2");
                setContentView(BuyFragment.class, R.id.business_fragment);
                t_select_btc.setText("ETH");
                num = 2;
                break;
            case R.id.currency_und:
                SharedPreferencesUtils.getInstance().setSharedPreferencesString("unit", "3");
                setContentView(BuyFragment.class, R.id.business_fragment);
                t_select_btc.setText("UND");
                num = 3;
                break;
        }
    }

    /**
     * 设置添加屏幕的背景透明度
     *
     * @param bgAlpha 屏幕透明度0.0-1.0 1表示完全不透明
     */

    public void setBackgroundAlpha(float bgAlpha) {
        WindowManager.LayoutParams lp = ((Activity) getContext()).getWindow()
                .getAttributes();
        lp.alpha = bgAlpha;
        ((Activity) getContext()).getWindow().setAttributes(lp);
    }

}
