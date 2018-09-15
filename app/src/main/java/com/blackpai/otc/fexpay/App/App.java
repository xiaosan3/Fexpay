package com.blackpai.otc.fexpay.App;

import android.app.Application;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by 77 on 2018/5/1.
 */

public class App extends Application {
    public static AppCompatActivity context;

    @Override
    public void onCreate() {
        super.onCreate();

        //友盟
//        UMConfigure.init(this, "5a12384aa40fa3551f0001d1", "umeng", UMConfigure.DEVICE_TYPE_PHONE, "");

//        PlatformConfig.setQQZone("1106728793", "3lc7CBdZz8sSed9C");
        /**
         * 设置组件化的Log开关
         * 参数: boolean 默认为false，如需查看LOG设置为true
         */
//        UMConfigure.setLogEnabled(true);

        /**
         * 设置日志加密
         * 参数：boolean 默认为false（不加密）
         */
//        UMConfigure.setEncryptEnabled(true);
    }
}
