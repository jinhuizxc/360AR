package com.example.jh.a360ar;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * 360°全景
 * 参考链接: https://github.com/sfsheng0322/DroidVR
 */
public class MainActivity extends AppCompatActivity {

    private ImageView ivMine;
    private TextView tvTitle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initView();
        initListener();

    }

    private void initListener() {
    }

    private void initView() {
    }
}
