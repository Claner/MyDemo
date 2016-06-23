package com.example.clanner.codehelper.utils;

import android.content.Context;
import android.content.Intent;
import android.support.design.widget.Snackbar;
import android.view.View;
import android.widget.TextView;

import com.example.clanner.codehelper.R;


/**
 * Created by Clanner on 2016/6/20.
 * 常用工具类
 */
public class CommonUtils {

    /**
     * 切换Activity
     *
     * @param from
     * @param to
     */
    public static void StartActivity(Context from, Class<?> to) {
        Intent intent = new Intent(from, to);
        from.startActivity(intent);
    }
//
//    /**
//     * 初始化ActionBar
//     */
//
//    public static void initActionBar(ActionBar actionBar,boolean isCanBack){
//        actionBar.setDisplayHomeAsUpEnabled(isCanBack);
//    }
//
//    public static void initActionBar(ActionBar actionBar, String title, boolean isCanBack){
//        actionBar.setDisplayHomeAsUpEnabled(isCanBack);
//        actionBar.setTitle(title);
//    }
//
//    public static void initActionBar(ActionBar actionBar, int title, boolean isCanBack){
//        actionBar.setDisplayHomeAsUpEnabled(isCanBack);
//        actionBar.setTitle(title);
//    }
//
//    public static void initActionBar(ActionBar actionBar, String title, boolean isCanBack,int icon){
//        actionBar.setDisplayHomeAsUpEnabled(isCanBack);
//        actionBar.setTitle(title);
//        actionBar.setIcon(icon);
//    }
//
//    public static void initActionBar(ActionBar actionBar, int title, boolean isCanBack,int icon){
//        actionBar.setDisplayHomeAsUpEnabled(isCanBack);
//        actionBar.setTitle(title);
//        actionBar.setIcon(icon);
//    }

    /**
     * 修改snackbar的文字颜色
     * @param snackbar
     * @param color
     */
    public static void setSnackbarMessageTextColor(Snackbar snackbar, int color) {
        View view = snackbar.getView();
        ((TextView) view.findViewById(R.id.snackbar_text)).setTextColor(color);
    }

}
