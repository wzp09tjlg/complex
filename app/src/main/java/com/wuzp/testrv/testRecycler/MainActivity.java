package com.wuzp.testrv.testRecycler;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.wuzp.testrv.R;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView mContent;
    ContentAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    private void initView() {
        mContent = (RecyclerView) findViewById(R.id.rv_content);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
        mContent.setLayoutManager(layoutManager);
        mAdapter = new ContentAdapter(this);
        mContent.setAdapter(mAdapter);

        //上边的是rv的基本使用 但是在一般的场景中 还是需要更复杂的东西来实现更友好的界面。比如动画 或者是 分割线
    }

    private void initData() {

    }

    private void getData() {
        List<Person> data = new ArrayList<>();
        data.add(new Person("walter"));
        mAdapter.setData(data);
    }

}
