package com.example.clanner.codehelper.ui.activity;

import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;

import com.example.clanner.codehelper.R;
import com.example.clanner.codehelper.utils.CommonUtils;

/**
 * Created by Clanner on 2016/6/20.
 */
public class WelcomeActivity extends AppCompatActivity{
    @Override
    protected void onCreate( Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                CommonUtils.StartActivity(WelcomeActivity.this,MainActivity.class);
                finish();
            }
        },1000);
    }
}
