package com.wuzp.testrv.testRecycler;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.wuzp.testrv.R;

import java.util.List;

/**
 * Created by wuzp on 2019/2/26.
 */

public class ContentAdapter extends RecyclerView.Adapter<ContentAdapter.ViewHolder> {

    LayoutInflater mInflater;

    List<Person> mData;

    public ContentAdapter(Context context) {
        mInflater = LayoutInflater.from(context);
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = mInflater.inflate(R.layout.item_content, parent, false);
        return new ViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.mName.setText(mData.get(position).name);
    }

    @Override
    public int getItemCount() {
        return mData == null ? 0 : mData.size();
    }

    public void setData(List<Person> data) {
        this.mData = data;
        notifyDataSetChanged();
    }

    static class ViewHolder extends RecyclerView.ViewHolder {

        TextView mName;

        public ViewHolder(View view) {
            super(view);
            mName = (TextView) view.findViewById(R.id.tv_name);
        }

    }

}
