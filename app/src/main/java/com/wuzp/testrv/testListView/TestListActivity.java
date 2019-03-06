package com.wuzp.testrv.testListView;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import com.wuzp.testrv.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by wuzp on 2019/2/27.
 */

public class TestListActivity extends AppCompatActivity {

    private ListView mContent;
    private ListContentAdapter mAdapter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listview);
        initView();
    }

    private void initView(){
        mContent = (ListView)findViewById(R.id.lv_content);
        mAdapter = new ListContentAdapter(this);
        mContent.setAdapter(mAdapter);

        //listview 在数据变化不大，仅仅只是做数据展示时 使用会更好一些，如果数据变化很大
        // 并且对于展示要求更高 或者 要求做动画 或者是 更好的视觉效果的法 那么还是推荐使用RV
        //可以添加header 和 footer 等等
        //mContent.addHeaderView();
        //mContent.addFooterView();
    }

    private void initData(){
        List<Cell> data = new ArrayList<>();
        data.add(new Cell("cell name",100));
        mAdapter.setData(data);
    }
}
