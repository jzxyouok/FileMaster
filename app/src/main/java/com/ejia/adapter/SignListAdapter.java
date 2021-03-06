package com.ejia.adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.ejia.entity.Sign;

import java.util.List;

/**
 * Created by yangzhongyu on 2017/1/31.
 */
public class SignListAdapter extends BaseAdapter {

    private List<Sign> mSignList;

    private Context mContext;

    public SignListAdapter(Context context,List<Sign> signList) {
           mSignList = signList;

        mContext = context;
    }

    @Override
    public int getCount() {
        return mSignList.size();
    }

    @Override
    public Object getItem(int i) {
        return mSignList.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        TextView tv = new TextView(mContext);
        tv.setText(mSignList.get(i).getSignId()+"");
        return tv;
    }
}
