package com.zivbs.zivbs.ui.base;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.zivbs.zivbs.utils.Transparency;


/**
 * Activity 基类
 */
public class BaseActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // 初始化状态栏
        Transparency.initTransparency(this);
    }

}
