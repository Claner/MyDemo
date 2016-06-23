package com.example.clanner.codehelper.ui.fragment;

import android.os.Bundle;
import android.view.View;

import com.example.clanner.codehelper.R;

/**
 * Created by Clanner on 2016/6/20.
 */
public class NewFeedFragment extends BaseFragment{

    public static NewFeedFragment newInstance(){
        return new NewFeedFragment();
    }

    @Override
    protected void initView(View view, Bundle savedInstanceState) {
        getSwipeBackLayout().setEnableGesture(false);
    }

    @Override
    protected int setLayoutId() {
        return R.layout.fragment_newfeed;
    }
}
