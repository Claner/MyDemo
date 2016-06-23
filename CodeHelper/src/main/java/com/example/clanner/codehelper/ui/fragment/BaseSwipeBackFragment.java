package com.example.clanner.codehelper.ui.fragment;

import android.content.Context;
import android.support.v4.app.Fragment;

import me.yokeyword.swipebackfragment.SwipeBackFragment;

/**
 * Created by Clanner on 2016/6/21.
 */
public class BaseSwipeBackFragment extends SwipeBackFragment{
    protected OnAddFragmentListener mAddFragmentListener;

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof OnAddFragmentListener) {
            mAddFragmentListener = (OnAddFragmentListener) context;
        }
    }

    @Override
    public void onDetach() {
        super.onDetach();
        mAddFragmentListener = null;
    }

    public interface OnAddFragmentListener {
        void onAddFragment(Fragment fromFragment, Fragment toFragment);
    }
}
