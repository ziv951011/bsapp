package com.zivbs.zivbs.ui.fragment;

import android.annotation.SuppressLint;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import com.zivbs.zivbs.R;
import com.zivbs.zivbs.dagger2.comonent.DaggerHomeFragmentComonent;
import com.zivbs.zivbs.dagger2.module.HomeFragmentModule;
import com.zivbs.zivbs.presenter.fragment.HomeFragmentPresenter;
import com.zivbs.zivbs.ui.base.BaseFragment;


import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.inject.Inject;

import butterknife.BindView;

/**
 * 主页fragment
 */
public class HomeFragment extends BaseFragment {

    @Inject
    HomeFragmentPresenter homeFragmentPresenter;

    @BindView(R.id.rv_main)
    RecyclerView rvMain;

    Map<String,Object> map = new HashMap<>();

    @SuppressLint("ValidFragment")
    private HomeFragment() {
    }


    public static HomeFragment newInstance() {
        return FragmentHolder.HOME_FRAGMENT;
    }


    private static class FragmentHolder {
        private static final HomeFragment HOME_FRAGMENT = new HomeFragment();
    }

    @Override
    protected Object setLayout() {
        return R.layout.fragment_home;
    }

    @Override
    protected void init() {
        DaggerHomeFragmentComonent.builder().homeFragmentModule(new HomeFragmentModule(this)).build().in(this);
        homeFragmentPresenter.getHomeData();
    }
}
