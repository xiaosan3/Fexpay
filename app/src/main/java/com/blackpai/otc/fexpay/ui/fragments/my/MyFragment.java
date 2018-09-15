package com.blackpai.otc.fexpay.ui.fragments.my;


import android.support.v4.app.Fragment;
import android.view.View;
import android.widget.ImageView;

import com.blackpai.otc.fexpay.R;
import com.blackpai.otc.fexpay.base.BaseFragment;
import com.blackpai.otc.fexpay.Utils.util.UtilBitmap;

/**
 * A simple {@link Fragment} subclass.
 */
public class MyFragment extends BaseFragment {


    private ImageView vague;
    private ImageView m_head;

    @Override
    protected int getCreateView() {
        return R.layout.fragment_my;
    }

    @Override
    protected void initView(View view) {
        vague = view.findViewById(R.id.vague);
        m_head = view.findViewById(R.id.m_head);

    }

    @Override
    protected void initData(View view) {
        UtilBitmap.blurImageView(getContext(), vague, 10);
    }

}
