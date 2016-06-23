package com.example.clanner.codehelper.ui.activity;

import com.example.clanner.codehelper.ui.fragment.AboutFragment;
import com.example.clanner.codehelper.ui.fragment.BaseFragment;

/**
 * Created by Clanner on 2016/6/20.
 */
public class AboutActivity extends BaseFragmentActivity {

    @Override
    protected BaseFragment getFirstFragment() {
        return new AboutFragment();
    }
}
