package com.example.clanner.codehelper.ui.fragment;

import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;

import com.example.clanner.codehelper.R;
import com.example.clanner.codehelper.ui.activity.BaseFragmentActivity;

import butterknife.BindView;
import butterknife.OnClick;

/**
 * Created by Clanner on 2016/6/23.
 */
public class TestFragment extends BaseFragment {

    public static TestFragment newInstance() {
        //因为不明原因直接new TestFragment的话无法添加Fragment
        return new TestFragment();
    }

    @BindView(R.id.toolbar)
    Toolbar toolbar;

    @Override
    protected int setLayoutId() {
        return R.layout.fragment_test;
    }

    @Override
    protected void initView(View view, Bundle savedInstanceState) {
        initActionBar(toolbar, "测试");
    }

    @OnClick(R.id.btn_test_fragment)
    public void onClick() {
        addFragment(TestFragment2.newInstance(), (BaseFragmentActivity) getActivity());
    }
}
