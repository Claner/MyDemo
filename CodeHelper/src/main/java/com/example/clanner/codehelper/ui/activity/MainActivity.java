package com.example.clanner.codehelper.ui.activity;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.widget.Toolbar;

import com.astuetz.PagerSlidingTabStrip;
import com.example.clanner.codehelper.R;
import com.example.clanner.codehelper.ui.fragment.DiscoverFragment;
import com.example.clanner.codehelper.ui.fragment.NewFeedFragment;
import com.example.clanner.codehelper.ui.fragment.ResourceCenterFragment;
import com.example.clanner.codehelper.utils.MainFragmentPagerAdapter;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;

public class MainActivity extends BaseActivity {

    @BindView(R.id.viewPager)
    ViewPager mViewPager;
    @BindView(R.id.tabs)
    PagerSlidingTabStrip tabs;
    @BindView(R.id.toolbar)
    Toolbar toolbar;

    private String[] mTitles;
    private List<Fragment> fragments = new ArrayList<Fragment>();
    private FragmentPagerAdapter mAdapter;

    @Override
    protected int setContentViewId() {
        return R.layout.activity_main;
    }

    /**
     * 初始化布局
     *
     * @param savedInstanceState
     */
    @Override
    protected void initView(Bundle savedInstanceState) {
        initFragment();
        initActionBar(toolbar,R.string.toolbar_app,R.drawable.ic_icon_code_small,false);
        mViewPager.setAdapter(mAdapter);
        tabs.setViewPager(mViewPager);
    }

    /**
     * 初始化Fragment
     */
    private void initFragment() {
        fragments.add(NewFeedFragment.newInstance());
        fragments.add(ResourceCenterFragment.newInstance());
        fragments.add(DiscoverFragment.newInstance());
        mTitles = getResources().getStringArray(R.array.title_main);
        mAdapter = new MainFragmentPagerAdapter(getSupportFragmentManager(), fragments, mTitles);
    }
}
