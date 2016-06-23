package com.example.clanner.codehelper.ui.fragment;

import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;

import com.example.clanner.codehelper.R;

import butterknife.BindView;

/**
 * Created by Clanner on 2016/6/23.
 */
public class TestFragment2 extends BaseFragment {
    @BindView(R.id.toolbar)
    Toolbar toolbar;

    public static TestFragment2 newInstance(){
        return new TestFragment2();
    }

    @Override
    protected int setLayoutId() {
        return R.layout.fragment_test2;
    }

    @Override
    protected void initView(View view, Bundle savedInstanceState) {
        initActionBar(toolbar,"fragment2");
    }
}
