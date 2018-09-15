package com.blackpai.otc.fexpay.ui.fragments.transaction.buy;

import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.blackpai.otc.fexpay.R;
import com.blackpai.otc.fexpay.base.BaseActivity;

public class BuyActivity extends BaseActivity implements View.OnClickListener {


    private ImageView b_delete;
    private ImageView b_iv_btc;
    private TextView b_buy;
    private TextView b_countdown;
    private TextView b_price;
    private TextView b_norm;
    private TextView b_number;
    private LinearLayout b_card;
    private LinearLayout b_pay;
    private LinearLayout b_weichat;
    private TextView b_place;
    private EditText b_cny_et;
    private EditText b_btc_et;
    private Button b_place_an_order;
    private int countdown = 900;

    @Override
    protected int getContentView() {
        return R.layout.activity_buy;
    }

    @Override
    protected void initView() {
        b_delete = (ImageView) findViewById(R.id.b_delete);
        b_iv_btc = (ImageView) findViewById(R.id.b_iv_btc);
        b_buy = (TextView) findViewById(R.id.b_buy);
        b_countdown = (TextView) findViewById(R.id.b_countdown);
        b_price = (TextView) findViewById(R.id.b_price);
        b_norm = (TextView) findViewById(R.id.b_norm);
        b_number = (TextView) findViewById(R.id.b_number);
        b_card = (LinearLayout) findViewById(R.id.b_card);
        b_pay = (LinearLayout) findViewById(R.id.b_pay);
        b_weichat = (LinearLayout) findViewById(R.id.b_weichat);
        b_place = (TextView) findViewById(R.id.b_place);
        b_cny_et = (EditText) findViewById(R.id.b_cny_et);
        b_btc_et = (EditText) findViewById(R.id.b_btc_et);
        b_place_an_order = (Button) findViewById(R.id.b_place_an_order);

        b_delete.setOnClickListener(this);
        b_place_an_order.setOnClickListener(this);

    }

    @Override
    protected void initData() {

        String coinName = getIntent().getStringExtra("coinName");
        String money = getIntent().getStringExtra("money");
        String price = getIntent().getStringExtra("price");
        String minTrade = getIntent().getStringExtra("minTrade");
        String maxTrade = getIntent().getStringExtra("maxTrade");
        String limitNum = getIntent().getStringExtra("limitNum");
        String payMethod = getIntent().getStringExtra("payMethod");

        switch (coinName) {
            case "BTC":
                b_iv_btc.setImageResource(R.mipmap.btc);
                break;
            case "ETH":
                b_iv_btc.setImageResource(R.mipmap.btc);
                break;
            case "UND":
                b_iv_btc.setImageResource(R.mipmap.btc);
                break;
        }


        b_buy.setText("买入" + coinName);
        b_price.setText(price);
        b_norm.setText("限额 " + minTrade + "-" + maxTrade + " " + money);
        b_number.setText("数量 " + limitNum + " " + coinName);


        if (payMethod.indexOf("bank") != -1) {
            b_card.setVisibility(View.VISIBLE);
        }
        if (payMethod.indexOf("wechat") != -1) {
            b_pay.setVisibility(View.VISIBLE);
        }
        if (payMethod.indexOf("ali") != -1) {
            b_weichat.setVisibility(View.VISIBLE);
        }

        //数字倒计时
        new Thread(new Runnable() {
            @Override
            public void run() {
                //倒计时开始，循环
                while (countdown > 0) {
                    runOnUiThread(new Runnable() {
                        @Override
                        public void run() {
                            b_countdown.setText(countdown + "");
                        }
                    });
                    try {
                        Thread.sleep(1000); //强制线程休眠1秒，就是设置倒计时的间隔时间为1秒。
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    countdown--;
                }
                //倒计时结束
                runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        finish();
                    }
                });
            }
        }).start();
    }

    @Override
    protected void initToolBar() {

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.b_delete:
                finish();
                break;
            case R.id.b_place_an_order:
                startActivity(new Intent(this, OrderActivity.class));
                break;
        }
    }
}
