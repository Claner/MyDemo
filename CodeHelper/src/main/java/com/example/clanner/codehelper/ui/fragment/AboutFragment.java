package com.example.clanner.codehelper.ui.fragment;

import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;

import com.example.clanner.codehelper.R;
import com.example.clanner.codehelper.ui.activity.BaseFragmentActivity;

import butterknife.BindView;
import butterknife.OnClick;

/**
 * Created by Clanner on 2016/6/21.
 */
public class AboutFragment extends BaseFragment {
    @BindView(R.id.toolbar)
    Toolbar toolbar;

    @Override
    protected int setLayoutId() {
        return R.layout.fragment_about;
    }

    @Override
    protected void initView(View view, Bundle savedInstanceState) {
        getSwipeBackLayout().setEnableGesture(false);
        initActionBar(toolbar, R.string.toolbar_about);
    }

    @OnClick({R.id.btn_test1, R.id.btn_test2, R.id.btn_test3, R.id.btn_test4, R.id.btn_test5})
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btn_test1:
                addFragment(TestFragment.newInstance(),((BaseFragmentActivity)getActivity()));
                break;
            case R.id.btn_test2:
                toast("测试2");
                break;
            case R.id.btn_test3:
                toast("测试3");
                break;
            case R.id.btn_test4:
                toast("测试4");
                break;
            case R.id.btn_test5:
                toast("测试5");
                break;
        }
    }

    @Override
    protected void initActionBar(Toolbar toolbar, int title) {
        toolbar.setNavigationIcon(R.mipmap.ic_back_white);
        toolbar.setTitle(title);
        toolbar.setNavigationIcon(R.mipmap.ic_back_white);
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getActivity().finish();
            }
        });
    }
}
