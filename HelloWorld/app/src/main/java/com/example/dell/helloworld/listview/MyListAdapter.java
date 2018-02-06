package com.example.dell.helloworld.listview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.dell.helloworld.R;

/**
 * Created by dell on 2018/1/25.
 */

class MyListAdapter extends BaseAdapter {

    private Context mContext;
    private LayoutInflater mLayoutInflater;

    public MyListAdapter(Context context) {
        this.mContext = context;
        mLayoutInflater = LayoutInflater.from(context);
    }

    @Override
    public int getCount() {
        return 10;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    static class ViewHolder {
        public ImageView imageView;
        public TextView tvTitle;
        public TextView tvTime;
        public TextView tvContent;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder = null;
        if (convertView == null) {
            convertView = mLayoutInflater.inflate(R.layout.layout_list_item, null);
            holder = new ViewHolder();
            holder .imageView = (ImageView) convertView .findViewById(R.id.iv_list );
            holder .tvTitle= (TextView) convertView .findViewById(R.id.tv_title );
            holder .tvTime = (TextView) convertView .findViewById(R.id.tv_time );
            holder .tvContent = (TextView) convertView .findViewById(R.id.tv_content  );
            convertView.setTag(holder);
        }else {
            holder = (ViewHolder) convertView .getTag();
        }
        holder .tvTitle .setText("title");
        holder .tvTime .setText("time");
        holder .tvContent .setText("content");
        Glide.with(mContext ).load("https://www.baidu.com/img/bd_logo1.png").into(holder .imageView );
        return convertView;
    }
}
