package com.blackpai.otc.fexpay.ui.fragments.transaction.buy;


import android.content.Intent;
import android.os.Handler;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.blackpai.otc.fexpay.R;
import com.blackpai.otc.fexpay.base.BaseFragment;
import com.blackpai.otc.fexpay.bean.Business;
import com.blackpai.otc.fexpay.ui.fragments.transaction.buy.adapter.BuyAdapter;
import com.blackpai.otc.fexpay.mvp.contract.Contract;
import com.blackpai.otc.fexpay.mvp.presenter.setBusinessPresenter;
import com.blackpai.otc.fexpay.Utils.sharedpreferences.SharedPreferencesUtils;
import com.chad.library.adapter.base.BaseQuickAdapter;

/**
 * A simple {@link Fragment} subclass.
 */
public class BuyFragment extends BaseFragment<setBusinessPresenter> implements Contract.IGetBusinessView {


    private RecyclerView buy_recy;
    private Handler mHandler;
    private BuyAdapter buyAdapter;
    private String advertiseType;
    private String coinType;
    private String unit;

    @Override
    public void onHiddenChanged(boolean hidden) {
        super.onHiddenChanged(hidden);
        if (!hidden) {
            advertiseType = SharedPreferencesUtils.getInstance().getSharedPreferencesString("advertiseType");
            coinType = SharedPreferencesUtils.getInstance().getSharedPreferencesString("coinType");
            unit = SharedPreferencesUtils.getInstance().getSharedPreferencesString("unit");
            presenter.setBusiness(advertiseType, "false", unit, coinType, "ali");
        }

    }

    @Override
    protected int getCreateView() {
        return R.layout.fragment_buy;
    }

    @Override
    protected void initView(View view) {
        buy_recy = view.findViewById(R.id.buy_Recy);
    }

    @Override
    protected void initData(View view) {

        //首次进入，然后点击刷新
        advertiseType = SharedPreferencesUtils.getInstance().getSharedPreferencesString("advertiseType");
        coinType = SharedPreferencesUtils.getInstance().getSharedPreferencesString("coinType");
        unit = SharedPreferencesUtils.getInstance().getSharedPreferencesString("unit");
        presenter.setBusiness(advertiseType, "false", unit, coinType, "ali");
    }

    @Override
    public void showMessage(String message) {

    }

    @Override
    public void showBusiness(final Business business) {
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());
        buy_recy.setLayoutManager(linearLayoutManager);
        buyAdapter = new BuyAdapter(R.layout.t_item, business.getData().getRows());
        buy_recy.setAdapter(buyAdapter);

        buyAdapter.setOnItemClickListener(new BaseQuickAdapter.OnItemClickListener() {
            @Override
            public void onItemClick(BaseQuickAdapter adapter, View view, int position) {
                Intent intent = new Intent(getContext(), BuyActivity.class);
                intent.putExtra("coinName", business.getData().getRows().get(position).getCoinName() + "");
                intent.putExtra("money", business.getData().getRows().get(position).getMoney() + "");
                intent.putExtra("price", business.getData().getRows().get(position).getPrice() + "");
                intent.putExtra("minTrade", business.getData().getRows().get(position).getMinTrade() + "");
                intent.putExtra("maxTrade", business.getData().getRows().get(position).getMaxTrade() + "");
                intent.putExtra("limitNum", business.getData().getRows().get(position).getLimitNum() + "");
                intent.putExtra("payMethod", business.getData().getRows().get(position).getPayMethod() + "");
                startActivity(intent);

            }
        });
    }

    @Override
    public void showIntent() {

    }
}
