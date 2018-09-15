package com.blackpai.otc.fexpay.ui.login;

import android.content.Intent;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.blackpai.otc.fexpay.R;
import com.blackpai.otc.fexpay.Utils.toolbar.ToolBarUtils;
import com.blackpai.otc.fexpay.base.BaseActivity;
import com.blackpai.otc.fexpay.bean.Login;
import com.blackpai.otc.fexpay.mvp.contract.Contract;
import com.blackpai.otc.fexpay.mvp.presenter.setLoginPresenter;
import com.blackpai.otc.fexpay.ui.MainActivity;
import com.blackpai.otc.fexpay.ui.register.RegisterActivity;

public class LoginActivity extends BaseActivity<setLoginPresenter> implements View.OnClickListener, Contract.IGetLoginView {

    private android.support.v7.widget.Toolbar lToolbar;
    private android.widget.TextView lRegister;
    private android.widget.EditText lPhone;
    private android.widget.EditText lPass;
    private android.widget.TextView textView4;
    private android.widget.Button lLogin;
    private android.widget.TextView lForgetPass;

    @Override
    protected int getContentView() {
        return R.layout.activity_login;
    }

    @Override
    protected void initView() {

        lToolbar = (Toolbar) findViewById(R.id.l_toolbar);
        lRegister = (TextView) findViewById(R.id.l_register);
        lPhone = (EditText) findViewById(R.id.l_phone);
        lPass = (EditText) findViewById(R.id.l_pass);
        textView4 = (TextView) findViewById(R.id.textView4);
        lLogin = (Button) findViewById(R.id.l_login);
        lForgetPass = (TextView) findViewById(R.id.l_forget_pass);

        lRegister.setOnClickListener(this);
        lLogin.setOnClickListener(this);
        lForgetPass.setOnClickListener(this);
    }

    @Override
    protected void initData() {

    }

    @Override
    protected void initToolBar() {
        ToolBarUtils.getInstance().setNavigation(lToolbar);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.l_register:
                startActivity(new Intent(LoginActivity.this, RegisterActivity.class));

                break;
            case R.id.l_login:
                presenter.setLogin(lPhone.getText().toString().trim(), lPass.getText().toString().trim());

                break;
            case R.id.l_forget_pass:
                //忘记密码
                break;
        }
    }

    @Override
    public void showMessage(String message) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }

    @Override
    public void showLogin(Login login) {

    }

    @Override
    public void showIntent() {
        startActivity(new Intent(LoginActivity.this, MainActivity.class));
    }
}
