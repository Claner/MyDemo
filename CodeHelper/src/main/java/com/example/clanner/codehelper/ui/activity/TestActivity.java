package com.example.clanner.codehelper.ui.activity;

import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.util.Log;

import com.example.clanner.codehelper.R;
import com.zhy.http.okhttp.OkHttpUtils;
import com.zhy.http.okhttp.callback.Callback;

import butterknife.BindView;
import okhttp3.Call;
import okhttp3.Response;

/**
 * Created by Clanner on 2016/6/23.
 */
public class TestActivity extends BaseActivity {
    @BindView(R.id.toolbar)
    Toolbar toolbar;
    String url = "http://www.csdn.net/";

    @Override
    protected int setContentViewId() {
        return R.layout.activity_test;
    }

    @Override
    protected void initView(Bundle savedInstanceState) {
        initActionBar(toolbar,"测试",true);
        OkHttpUtils.get().url(url).build().execute(new Callback() {
            @Override
            public Object parseNetworkResponse(Response response, int id) throws Exception {
                return null;
            }

            @Override
            public void onError(Call call, Exception e, int id) {
                Log.e("Hello","失败");
            }

            @Override
            public void onResponse(Object response, int id) {
                Log.e("Hello","成功");
            }
        });
    }
}
