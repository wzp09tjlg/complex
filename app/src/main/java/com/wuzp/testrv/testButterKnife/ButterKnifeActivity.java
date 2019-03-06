package com.wuzp.testrv.testButterKnife;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;
import android.widget.Toast;

import com.wuzp.testrv.R;
import com.wuzp.testrv.R2;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Created by wuzp on 2019/2/27.
 */

public class ButterKnifeActivity extends AppCompatActivity {

    //在butterknife 8.0.0之前是bind 在8.0.0之后是bindView  在8.7.0之后，绑定的R变成了R2
    @BindView(R2.id.tv_name)
    TextView mName;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_btk);
        ButterKnife.bind(this);
        initView();
    }

    private void initView() {

    }

    @OnClick({R2.id.tv_name})
    public void onClicked() {
        Toast.makeText(this, "this is a test butterknife", Toast.LENGTH_SHORT).show();
    }
}
