package com.blackpai.otc.fexpay.ui.register;

import android.content.Intent;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.blackpai.otc.fexpay.R;
import com.blackpai.otc.fexpay.Utils.toolbar.ToolBarUtils;
import com.blackpai.otc.fexpay.base.BaseActivity;
import com.blackpai.otc.fexpay.mvp.contract.Contract;
import com.blackpai.otc.fexpay.mvp.presenter.setMessagePresenter;
import com.blackpai.otc.fexpay.ui.login.LoginActivity;

public class SetMessageActivity extends BaseActivity<setMessagePresenter> implements View.OnClickListener, Contract.IGetMessageView {

    private Toolbar smToolbar;
    private TextView smLogin;
    private EditText smNickname;
    private EditText smPass;
    private EditText smOkPass;
    private Button smRegister;

    @Override
    protected int getContentView() {
        return R.layout.activity_set_message;
    }

    protected void initView() {
        smToolbar = (Toolbar) findViewById(R.id.sm_toolbar);
        smLogin = (TextView) findViewById(R.id.sm_login);
        smNickname = (EditText) findViewById(R.id.sm_nickname);
        smPass = (EditText) findViewById(R.id.sm_pass);
        smOkPass = (EditText) findViewById(R.id.sm_ok_pass);
        smRegister = (Button) findViewById(R.id.sm_register);

        smLogin.setOnClickListener(this);
        smRegister.setOnClickListener(this);
    }

    @Override
    protected void initData() {
        Intent intent = getIntent();
        intent.getStringExtra("userName");
        intent.getStringExtra("code");
        intent.getStringExtra("password");
        intent.getStringExtra("confirmPassword");
    }

    @Override
    protected void initToolBar() {
        ToolBarUtils.getInstance().setNavigation(smToolbar);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.sm_login:
                presenter.setMessage();
                break;
            case R.id.sm_register:
                startActivity(new Intent(SetMessageActivity.this, LoginActivity.class));
                break;
        }
    }

    @Override
    public void showMessage(String message) {

    }

    @Override
    public void showMessage() {

    }

    @Override
    public void showIntent() {
        startActivity(new Intent(SetMessageActivity.this, LoginActivity.class));
    }
}
