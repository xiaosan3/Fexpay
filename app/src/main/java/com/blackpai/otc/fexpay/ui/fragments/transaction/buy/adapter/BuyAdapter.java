package com.blackpai.otc.fexpay.ui.fragments.transaction.buy.adapter;

import android.support.annotation.LayoutRes;
import android.support.annotation.Nullable;
import android.util.Log;

import com.blackpai.otc.fexpay.R;
import com.blackpai.otc.fexpay.bean.Business;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;

import java.util.List;

/**
 * Created by EDZ on 2018/8/7.
 */
public class BuyAdapter extends BaseQuickAdapter<Business.DataBean.RowsBean, BaseViewHolder> {

    public BuyAdapter(@LayoutRes int layoutResId, @Nullable List<Business.DataBean.RowsBean> data) {
        super(layoutResId, data);
    }

    @Override
    protected void convert(BaseViewHolder helper, Business.DataBean.RowsBean item) {
        helper.setText(R.id.tbi_praise, "成交 " + item.getTradeCounts() + " 成功率 " + item.getPraise() + "%");
        helper.setText(R.id.tbi_price, item.getPrice() + " " + item.getMoney());
        helper.setText(R.id.tbi_norm, "限额 " + item.getMinTrade() + "-" + item.getMaxTrade() + " " + item.getMoney());
        helper.setText(R.id.tbi_number, "数量 " + item.getLimitNum() + " " + item.getCoinName());
        //判断有几种支付方式
        Log.e(TAG, item.getPayMethod().replace(",", ""));

        if (item.getPayMethod().indexOf("bank") != -1) {
            helper.setVisible(R.id.tbi_card, true);
        }
        if (item.getPayMethod().indexOf("wechat") != -1) {
            helper.setVisible(R.id.tbi_weichat, true);
        }
        if (item.getPayMethod().indexOf("ali") != -1) {
            helper.setVisible(R.id.tbi_pay, true);
        }
    }

}
