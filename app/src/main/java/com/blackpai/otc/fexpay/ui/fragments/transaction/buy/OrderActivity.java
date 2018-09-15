package com.blackpai.otc.fexpay.ui.fragments.transaction.buy;

import android.content.Intent;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.RelativeLayout;

import com.blackpai.otc.fexpay.R;
import com.blackpai.otc.fexpay.Utils.toolbar.ToolBarUtils;
import com.blackpai.otc.fexpay.base.BaseActivity;
import com.blackpai.otc.fexpay.ui.fragments.transaction.OrderMessageActivity;

public class OrderActivity extends BaseActivity implements View.OnClickListener {

    private Toolbar oToolbar;
    private android.widget.RelativeLayout oCancel;
    private android.widget.RelativeLayout oOk;
    private Intent intent;

    @Override
    protected int getContentView() {
        return R.layout.activity_order;
    }

    @Override
    protected void initView() {
        oToolbar = (Toolbar) findViewById(R.id.o_toolbar);
        oCancel = (RelativeLayout) findViewById(R.id.o_cancel);
        oOk = (RelativeLayout) findViewById(R.id.o_ok);

        oCancel.setOnClickListener(this);
        oOk.setOnClickListener(this);
    }

    @Override
    protected void initData() {
        intent = new Intent(OrderActivity.this, OrderMessageActivity.class);


    }

    @Override
    protected void initToolBar() {
        ToolBarUtils.getInstance().setNavigation(oToolbar);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.o_cancel:
                intent.putExtra("details", "已取消");
                startActivity(intent);
                break;
            case R.id.o_ok:
                intent.putExtra("details", "已完成");
                startActivity(intent);
                break;
        }
    }
}
