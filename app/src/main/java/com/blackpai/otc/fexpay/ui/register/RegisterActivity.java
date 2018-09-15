package com.blackpai.otc.fexpay.ui.register;

import android.content.Intent;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.blackpai.otc.fexpay.R;
import com.blackpai.otc.fexpay.Utils.toolbar.ToolBarUtils;
import com.blackpai.otc.fexpay.base.BaseActivity;
import com.blackpai.otc.fexpay.mvp.contract.Contract;
import com.blackpai.otc.fexpay.mvp.presenter.setRegisterPresenter;
import com.blackpai.otc.fexpay.ui.login.LoginActivity;
import com.blackpai.otc.fexpay.url.Urls;
import com.geetest.sdk.Bind.GT3GeetestBindListener;
import com.geetest.sdk.Bind.GT3GeetestUtilsBind;
import com.geetest.sdk.GTCallBack;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.HashMap;
import java.util.Map;

import static com.blackpai.otc.fexpay.R.id.r_code;

public class RegisterActivity extends BaseActivity<setRegisterPresenter> implements Contract.IGetRegisterView, View.OnClickListener {

    private EditText rPhone;
    private EditText rCode;
    private Button rSendCode;
    private EditText rPass;
    private EditText rOkPass;
    private Button rNext;
    private android.support.v7.widget.Toolbar rToolbar;
    private android.widget.TextView rLogin;
    private GT3GeetestUtilsBind gt3GeetestUtils;
    private Map<String, String> map;
    private android.widget.CheckBox rCheck;

    @Override
    protected int getContentView() {
        return R.layout.activity_register;
    }

    protected void initView() {
        rPhone = (EditText) findViewById(R.id.r_phone);
        rCode = (EditText) findViewById(r_code);
        rSendCode = (Button) findViewById(R.id.r_send_code);
        rPass = (EditText) findViewById(R.id.r_pass);
        rOkPass = (EditText) findViewById(R.id.r_ok_pass);
        rNext = (Button) findViewById(R.id.r_next);
        rToolbar = (Toolbar) findViewById(R.id.r_toolbar);
        rLogin = (TextView) findViewById(R.id.r_login);

        rNext.setOnClickListener(this);
        rLogin.setOnClickListener(this);
        rSendCode.setOnClickListener(this);
        rCheck = (CheckBox) findViewById(R.id.r_check);
    }

    @Override
    protected void initData() {
        map = new HashMap<String, String>();
        //初始化极验
        gt3GeetestUtils = new GT3GeetestUtilsBind(RegisterActivity.this);
        // 设置是否可以点击Dialog灰色区域关闭验证码
        gt3GeetestUtils.setDialogTouch(true);
        // 设置debug模式，开代理抓包可使用，默认关闭，TODO 生产环境务必设置为false
        gt3GeetestUtils.setDebug(true);
        // 设置加载webview超时时间，单位毫秒，默认15000，仅且webview加载静态文件超时，不包括之前的http请求
        gt3GeetestUtils.setTimeout(15000);
        // 设置webview请求超时(用户点选或滑动完成，前端请求后端接口)，单位毫秒，默认10000
        gt3GeetestUtils.setWebviewTimeout(10000);

    }

    @Override
    protected void initToolBar() {
        ToolBarUtils.getInstance().setNavigation(rToolbar);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.r_next:

                presenter.setRegister();
                break;
            case R.id.r_login:
                startActivity(new Intent(RegisterActivity.this, LoginActivity.class));
                break;
            case R.id.r_send_code:
                if (rPhone.getText().toString().trim().equals("")) {
                    Toast.makeText(this, "手机号为空！", Toast.LENGTH_SHORT).show();
                    return;
                }
                if (!rPhone.getText().toString().trim().matches("[1][345678]\\d{9}")) {
                    Toast.makeText(this, "手机号格式不正确！", Toast.LENGTH_SHORT).show();
                    return;
                }
                //获取验证码之前先进行极验
                startVerify(rPhone.getText().toString().trim());

                break;
        }
    }

    private void startVerify(final String trim) {
        gt3GeetestUtils.getGeetest(RegisterActivity.this, Urls.EXTREME, Urls.SEND_CODE, null, new GT3GeetestBindListener() {

            /**
             * 返回是否自定义api2，true为自定义api2
             * false： gt3GetDialogResult(String result)，返回api2需要参数
             * true： gt3GetDialogResult(boolean a, String result)，返回api2需要的参数
             */
            @Override
            public boolean gt3SetIsCustom() {
                return false;
            }

            /**
             * 为API2接口添加数据，数据拼接在URL后，API2接口默认get请求
             * 默认已有数据：geetest_challenge，geetest_validate，geetest_seccode
             * TODO 注意： 切勿重复添加以上数据
             */

            @Override
            public Map<String, String> gt3SecondResult() {
                map.put("userName", trim);
                map.put("country_code", "86");
                map.put("model", "1");
                map.put("type", "0");
                return map;
            }

            /**
             * api2完成回调，判断是否验证成功，且成功调用gt3TestFinish，失败调用gt3TestClose
             *
             * @param s api2接口返回数据
             */
            @Override
            public void gt3DialogSuccessResult(String s) {
                try {
                    JSONObject jsonObject = new JSONObject(s);
                    String code = jsonObject.getString("code");
                    if (code.equals("0")) {
                        gt3GeetestUtils.gt3TestFinish();
                        // 设置loading消失回调
                        gt3GeetestUtils.setGtCallBack(new GTCallBack() {
                            @Override
                            public void onCallBack() {
                                // 跳转其他页面操作等
                            }
                        });
                    } else {
                        gt3GeetestUtils.gt3TestClose();
                    }
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
        });

    }

    @Override
    public void showMessage(String message) {

    }

    @Override
    public void showRegister() {

    }

    @Override
    public void showIntent() {

        if (!rCheck.isChecked()) {
            Toast.makeText(this, "尚未同意用户协议", Toast.LENGTH_SHORT).show();
            return;
        }
        if (rPass.getText().toString().trim().equals("")) {
            Toast.makeText(this, "密码不能为空！", Toast.LENGTH_SHORT).show();
            return;
        }
        if (rOkPass.getText().toString().trim().equals("")) {
            Toast.makeText(this, "确认密码不能为空！", Toast.LENGTH_SHORT).show();
            return;
        }
        if (!rOkPass.getText().toString().trim().equals(rPass.getText().toString().trim())) {
            Toast.makeText(this, "确认密码和密码输入不一致", Toast.LENGTH_SHORT).show();
            return;
        }
        Intent intent = new Intent(RegisterActivity.this, SetMessageActivity.class);
        intent.putExtra("userName", rPhone.getText().toString().trim());
        intent.putExtra("code", rCode.getText().toString().trim());
        intent.putExtra("password", rPhone.getText().toString().trim());
        intent.putExtra("confirmPassword", rPhone.getText().toString().trim());
        startActivity(intent);

    }


}
