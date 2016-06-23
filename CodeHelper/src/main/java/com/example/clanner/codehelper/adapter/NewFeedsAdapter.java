package com.example.clanner.codehelper.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.clanner.codehelper.R;
import com.example.clanner.codehelper.entity.NewFeedsEntity;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by Clanner on 2016/6/23.
 */
public class NewFeedsAdapter extends BaseAdapter {
    List<NewFeedsEntity> data;
    Context context;

    public NewFeedsAdapter(Context context, List<NewFeedsEntity> data) {
        this.data = data;
        this.context = context;
    }

    @Override
    public int getCount() {
        return data.size();
    }

    @Override
    public Object getItem(int position) {
        return data.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup praent) {
        ViewHolder h = null;
        if (convertView == null){
            convertView = LayoutInflater.from(context).inflate(R.layout.adapter_newfeeds,null);
            h = new ViewHolder(convertView);
            convertView.setTag(h);
        }else {
            h = (ViewHolder) convertView.getTag();
        }
        //h.title.setText();
        return convertView;
    }

    class ViewHolder {
        @BindView(R.id.tv_title)
        TextView title;
        @BindView(R.id.tv_time)
        TextView time;
        @BindView(R.id.tv_description)
        TextView description;

        public ViewHolder(View view) {
            ButterKnife.bind(this, view);
        }
    }
}
