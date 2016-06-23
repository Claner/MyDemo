package com.example.clanner.codehelper.ui.fragment;

import android.os.Bundle;
import android.view.View;

import com.example.clanner.codehelper.R;
import com.example.clanner.codehelper.ui.activity.AboutActivity;
import com.example.clanner.codehelper.utils.CommonUtils;

import butterknife.OnClick;

/**
 * Created by Clanner on 2016/6/20.
 */
public class DiscoverFragment extends BaseFragment {

    public static DiscoverFragment newInstance(){
        return new DiscoverFragment();
    }

    @Override
    protected void initView(View view, Bundle savedInstanceState) {
        getSwipeBackLayout().setEnableGesture(false);
    }

    @Override
    protected int setLayoutId() {
        return R.layout.fragment_discover;
    }

    @OnClick(R.id.btn_sponsor)
    public void sponsor() {
       toast("赞助作者");
    }

    @OnClick(R.id.btn_usage)
    public void usage() {
        toast("使用手册");
    }

    @OnClick(R.id.btn_feedback)
    public void feedback() {
        toast("意见反馈");
    }

    @OnClick(R.id.btn_rateapp)
    public void rateapp() {
        toast("评价应用");
    }

    @OnClick(R.id.btn_uodate)
    public void update() {
        toast("检查更新");
    }

    @OnClick(R.id.btn_opensource)
    public void opensource() {
        toast("开源项目");
    }

    @OnClick(R.id.btn_about)
    public void about() {
        CommonUtils.StartActivity(getActivity(), AboutActivity.class);
    }
}
