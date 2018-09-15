package com.blackpai.otc.fexpay.ui.fragments.order;


import android.support.v4.app.Fragment;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;

import com.blackpai.otc.fexpay.R;
import com.blackpai.otc.fexpay.base.BaseFragment;
import com.blackpai.otc.fexpay.ui.fragments.order.detalis.OrderContentFragment;

/**
 * A simple {@link Fragment} subclass.
 */
public class OrderFragment extends BaseFragment implements View.OnClickListener {


    private TextView order_whole;
    private TextView order_arrearage;
    private TextView order_account_paid;
    private TextView order_appeal;
    private TextView order_canceled;
    private TextView order_accomplish;
    private FrameLayout order_fragment;

    @Override
    protected int getCreateView() {
        return R.layout.fragment_order;
    }

    @Override
    protected void initView(View view) {

        order_whole = view.findViewById(R.id.order_whole);
        order_arrearage = view.findViewById(R.id.order_arrearage);
        order_account_paid = view.findViewById(R.id.order_account_paid);
        order_appeal = view.findViewById(R.id.order_appeal);
        order_canceled = view.findViewById(R.id.order_canceled);
        order_accomplish = view.findViewById(R.id.order_accomplish);
        order_fragment = view.findViewById(R.id.order_fragment);


        order_whole.setOnClickListener(this);
        order_arrearage.setOnClickListener(this);
        order_account_paid.setOnClickListener(this);
        order_appeal.setOnClickListener(this);
        order_canceled.setOnClickListener(this);
        order_accomplish.setOnClickListener(this);
    }

    @Override
    protected void initData(View view) {
        setContentView(OrderContentFragment.class, R.id.order_fragment);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.order_whole:

                setContentView(OrderContentFragment.class, R.id.order_fragment);
                break;
            case R.id.order_arrearage:

                setContentView(OrderContentFragment.class, R.id.order_fragment);
                break;
            case R.id.order_account_paid:

                setContentView(OrderContentFragment.class, R.id.order_fragment);

                break;
            case R.id.order_appeal:
                setContentView(OrderContentFragment.class, R.id.order_fragment);

                break;
            case R.id.order_canceled:
                setContentView(OrderContentFragment.class, R.id.order_fragment);

                break;
            case R.id.order_accomplish:
                setContentView(OrderContentFragment.class, R.id.order_fragment);

                break;
        }
    }
}
