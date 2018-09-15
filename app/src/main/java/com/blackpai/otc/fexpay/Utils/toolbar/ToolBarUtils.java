package com.blackpai.otc.fexpay.Utils.toolbar;

import android.support.v7.widget.Toolbar;
import android.view.View;

import com.blackpai.otc.fexpay.App.App;
import com.blackpai.otc.fexpay.R;

/**
 * Created by 77 on 2018/4/23.
 */

public class ToolBarUtils {

    private static ToolBarUtils toolBarUtils;

    //用单一实例来调用这个方法
    public static ToolBarUtils getInstance() {
        if (toolBarUtils == null) {
            toolBarUtils = new ToolBarUtils();
        }
        return new ToolBarUtils();
    }

    public void setNavigation(Toolbar toolbar) {
        toolbar.setTitle("");
        App.context.setSupportActionBar(toolbar);
        toolbar.setNavigationIcon(R.mipmap.ic_launcher);
        //设置回退监听
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                App.context.finish();
            }
        });

    }
}
