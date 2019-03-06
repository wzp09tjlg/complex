package com.wuzp.testrv.testListView;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.wuzp.testrv.R;

import java.util.List;

/**
 * Created by wuzp on 2019/2/27.
 */

public class ListContentAdapter extends BaseAdapter {

    private LayoutInflater mInflater;
    private List<Cell> mData;

    public ListContentAdapter(Context context){
        mInflater = LayoutInflater.from(context);
    }

    @Override
    public int getCount() {
        return mData == null ? 0 : mData.size();
    }

    @Override
    public Object getItem(int position) {
        return mData.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder viewHolder = null;
        if (convertView == null) {
            convertView = mInflater.inflate(R.layout.item_content, parent, false);
            viewHolder = new ViewHolder(convertView);
            convertView.setTag(viewHolder);
        } else {
            viewHolder = (ViewHolder) convertView.getTag();
        }
        bindData(viewHolder,position);
        return convertView;
    }

    private void bindData(ViewHolder viewHolder,int position){
        Cell cell = mData.get(position);
        viewHolder.mName.setText(cell.name);
    }

    public void setData(List<Cell> data){
        this.mData = data;
        //设置之后 需要通知下数据有更新 然后让listView重新绘制
        notifyDataSetChanged();
    }

    static class ViewHolder {
        TextView mName;

        public ViewHolder(View view) {
            mName = (TextView)view.findViewById(R.id.tv_name);
        }
    }
}
