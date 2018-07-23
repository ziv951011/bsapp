package com.zivbs.zivbs.dagger2.module;

import com.zivbs.zivbs.presenter.fragment.HomeFragmentPresenter;
import com.zivbs.zivbs.ui.fragment.HomeFragment;

import dagger.Module;
import dagger.Provides;

@Module
public class HomeFragmentModule {

    private HomeFragment homeFragment;

    public HomeFragmentModule(HomeFragment homeFragment) {
        this.homeFragment = homeFragment;
    }

    @Provides
    HomeFragmentPresenter homeFragmentPresenterProvides() {
        return new HomeFragmentPresenter(homeFragment);
    }
}
