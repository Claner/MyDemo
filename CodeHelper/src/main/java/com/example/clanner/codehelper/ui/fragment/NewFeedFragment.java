package com.example.clanner.codehelper.ui.fragment;

import android.os.Bundle;
import android.support.v4.widget.SwipeRefreshLayout;
import android.view.View;
import android.widget.ListView;

import com.example.clanner.codehelper.R;
import com.example.clanner.codehelper.adapter.NewFeedsAdapter;
import com.example.clanner.codehelper.entity.NewFeedsEntity;

import java.util.ArrayList;

import butterknife.BindView;

/**
 * Created by Clanner on 2016/6/20.
 */
public class NewFeedFragment extends BaseFragment implements SwipeRefreshLayout.OnRefreshListener {

    @BindView(R.id.lv_newfeeds)
    ListView lvNewfeeds;
    @BindView(R.id.swipeRefreshLayout)
    SwipeRefreshLayout swipeRefreshLayout;

    private NewFeedsAdapter adapter;
    private ArrayList<NewFeedsEntity> data = new ArrayList<>();

    public static NewFeedFragment newInstance() {
        return new NewFeedFragment();
    }

    @Override
    protected void initView(View view, Bundle savedInstanceState) {
        getSwipeBackLayout().setEnableGesture(false);
        swipeRefreshLayout.setOnRefreshListener(this);
        swipeRefreshLayout.setColorSchemeResources(android.R.color.holo_blue_bright,
                android.R.color.holo_blue_light,
                android.R.color.holo_blue_bright,
                android.R.color.holo_blue_light);
        adapter = new NewFeedsAdapter(getActivity(), data);
        lvNewfeeds.setAdapter(adapter);
    }

    @Override
    protected int setLayoutId() {
        return R.layout.fragment_newfeed;
    }

    @Override
    public void onRefresh() {
    }
}
