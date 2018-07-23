package com.zivbs.zivbs.ui.activity;


import android.os.Bundle;
import android.support.annotation.Nullable;

import com.heima.tabview.library.TabView;
import com.heima.tabview.library.TabViewChild;
import com.zivbs.zivbs.R;
import com.zivbs.zivbs.ui.base.BaseActivity;
import com.zivbs.zivbs.ui.fragment.HomeFragment;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;


public class MainActivity extends BaseActivity {


    @BindView(R.id.tabView)
    TabView tabView;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        init();
    }

    private void init() {
        List<TabViewChild> tabViewChildList = new ArrayList<>();
        TabViewChild tabViewChild01 = new TabViewChild(R.mipmap.main_tab_home_selector, R.mipmap.main_tab_home_normal, "首页", HomeFragment.newInstance());
        TabViewChild tabViewChild02 = new TabViewChild(R.mipmap.main_tab_release_selector, R.mipmap.main_tab_release_normal, "发需求", HomeFragment.newInstance());
        TabViewChild tabViewChild03 = new TabViewChild(R.mipmap.main_tab_mine_selector, R.mipmap.main_tab_mine_normal, "我的", HomeFragment.newInstance());
        tabViewChildList.add(tabViewChild01);
        tabViewChildList.add(tabViewChild02);
        tabViewChildList.add(tabViewChild03);
        // 默认选中第一个
        tabView.setTabViewDefaultPosition(0);
        tabView.setTextViewSelectedColor(getResources().getColor(R.color.tab_selector));
        tabView.setTextViewUnSelectedColor(getResources().getColor(R.color.tab_normal));

        tabView.setTabViewChild(tabViewChildList, getSupportFragmentManager());
    }

}
