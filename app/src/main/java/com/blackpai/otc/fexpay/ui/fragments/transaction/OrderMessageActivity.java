package com.blackpai.otc.fexpay.ui.fragments.transaction;

import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;

import com.blackpai.otc.fexpay.R;
import com.blackpai.otc.fexpay.Utils.toolbar.ToolBarUtils;
import com.blackpai.otc.fexpay.base.BaseActivity;

public class OrderMessageActivity extends BaseActivity implements View.OnClickListener {

    private android.support.v7.widget.Toolbar omToolbar;
    private android.widget.TextView omMessage;
    private android.widget.TextView omProperty;
    private android.widget.TextView omContact;

    @Override
    protected int getContentView() {
        return R.layout.activity_order_message;
    }

    @Override
    protected void initView() {

        omToolbar = (Toolbar) findViewById(R.id.om_toolbar);
        omMessage = (TextView) findViewById(R.id.om_message);
        omProperty = (TextView) findViewById(R.id.om_property);
        omContact = (TextView) findViewById(R.id.om_contact);

        omProperty.setOnClickListener(this);
        omContact.setOnClickListener(this);
    }

    @Override
    protected void initData() {
        omMessage.setText(getIntent().getStringExtra("details"));
    }

    @Override
    protected void initToolBar() {
        ToolBarUtils.getInstance().setNavigation(omToolbar);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.om_property:
                //查看资产
                break;
            case R.id.om_contact:
                //联系对方
                break;
        }
    }
}
