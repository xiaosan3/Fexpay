package com.blackpai.otc.fexpay.ui.fragments.property;


import android.content.Intent;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Toast;

import com.blackpai.otc.fexpay.R;
import com.blackpai.otc.fexpay.base.BaseFragment;
import com.blackpai.otc.fexpay.bean.Property;
import com.blackpai.otc.fexpay.mvp.contract.Contract;
import com.blackpai.otc.fexpay.mvp.presenter.setPropertyPresenter;
import com.blackpai.otc.fexpay.ui.fragments.property.adapter.PropertyAdapter;
import com.blackpai.otc.fexpay.ui.login.LoginActivity;
import com.chad.library.adapter.base.BaseQuickAdapter;

/**
 * A simple {@link Fragment} subclass.
 */
public class PropertyFragment extends BaseFragment<setPropertyPresenter> implements Contract.IGetPropertyView {


    private RecyclerView p_recyclerview;

    @Override
    protected int getCreateView() {
        return R.layout.fragment_property;
    }

    @Override
    protected void initView(View view) {
        p_recyclerview = view.findViewById(R.id.p_recyclerview);
    }

    @Override
    protected void initData(View view) {
        presenter.setProperty();
    }

    @Override
    public void onHiddenChanged(boolean hidden) {
        super.onHiddenChanged(hidden);
        if (!hidden) {
            presenter.setProperty();
        }

    }

    @Override
    public void showMessage(String message) {
        Toast.makeText(getContext(), message, Toast.LENGTH_SHORT).show();
    }

    @Override
    public void showProperty(Property property) {
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());
        p_recyclerview.setLayoutManager(linearLayoutManager);
        PropertyAdapter propertyAdapter = new PropertyAdapter(R.layout.property_item, property.getData().getRows());
        p_recyclerview.setAdapter(propertyAdapter);
        propertyAdapter.setOnItemClickListener(new BaseQuickAdapter.OnItemClickListener() {
            @Override
            public void onItemClick(BaseQuickAdapter adapter, View view, int position) {
                Intent intent = new Intent(getContext(), AssetParticularsActivity.class);
//                intent.putExtra("coinName", business.getData().getRows().get(position).getCoinName() + "");
//                intent.putExtra("money", bu+9.
// 30siness.getData().getRows().get(position).getMoney() + "");
//                intent.putExtra("price", business.getData().getRows().get(position).getPrice() + "");
//                intent.putExtra("minTrade", business.getData().getRows().get(position).getMinTrade() + "");
//                intent.putExtra("maxTrade", business.getData().getRows().get(position).getMaxTrade() + "");
//                intent.putExtra("limitNum", business.getData().getRows().get(position).getLimitNum() + "");
//                intent.putExtra("payMethod", business.getData().getRows().get(position).getPayMethod() + "");
                startActivity(intent);

            }
        });
    }

    @Override
    public void showIntent() {
        startActivity(new Intent(getContext(), LoginActivity.class));
    }
}
