package com.blackpai.otc.fexpay.ui.fragments.transaction;

import com.blackpai.otc.fexpay.R;
import com.blackpai.otc.fexpay.base.BaseActivity;
import com.google.zxing.Result;
import com.zhangke.qrcodeview.QRCodeView;

public class SweepCodeActivity extends BaseActivity implements QRCodeView.OnQRCodeRecognitionListener {


    private QRCodeView qr_code_view;

    @Override
    protected int getContentView() {
        return R.layout.activity_sweep_code;
    }

    @Override
    protected void initView() {
        qr_code_view = (QRCodeView) findViewById(R.id.qr_code_view);
        qr_code_view.setOnQRCodeListener(this);
    }

    @Override
    protected void initData() {
    }

    @Override
    protected void initToolBar() {

    }


    @Override
    public void onQRCodeRecognition(Result result) {

    }
}
