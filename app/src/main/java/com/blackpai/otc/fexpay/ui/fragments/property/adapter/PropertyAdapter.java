package com.blackpai.otc.fexpay.ui.fragments.property.adapter;

import android.support.annotation.LayoutRes;
import android.support.annotation.Nullable;

import com.blackpai.otc.fexpay.R;
import com.blackpai.otc.fexpay.bean.Property;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;

import java.util.List;

/**
 * Created by 77 on 2018/8/14.
 */

public class PropertyAdapter extends BaseQuickAdapter<Property.DataBean.RowsBean, BaseViewHolder> {

    public PropertyAdapter(@LayoutRes int layoutResId, @Nullable List<Property.DataBean.RowsBean> data) {
        super(layoutResId, data);
    }

    @Override
    protected void convert(BaseViewHolder helper, Property.DataBean.RowsBean item) {
        helper.setText(R.id.pi_name, item.getCoinName());
        helper.setText(R.id.pi_available, item.getAvailable() + "");
        helper.setText(R.id.pi_freeze, item.getFrozen() + "");

        if (item.getCoinName().equals("BTC")) {
            helper.setImageResource(R.id.pi_money_image, R.mipmap.btc);
        }
        if (item.getCoinName().equals("ETH")) {
            helper.setImageResource(R.id.pi_money_image, R.mipmap.eth);
        }
        if (item.getCoinName().equals("UND")) {
            helper.setImageResource(R.id.pi_money_image, R.mipmap.und);
        }
    }
}
