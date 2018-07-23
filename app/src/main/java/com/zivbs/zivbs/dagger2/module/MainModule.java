package com.zivbs.zivbs.dagger2.module;

import com.zivbs.zivbs.presenter.activity.MainPresenter;
import com.zivbs.zivbs.ui.activity.MainActivity;

import dagger.Module;
import dagger.Provides;

@Module
public class MainModule {

    private MainActivity mainActivity;

    public MainModule(MainActivity mainActivity) {
        this.mainActivity = mainActivity;
    }


    @Provides
    MainPresenter mainPresenterProvides() {
        return new MainPresenter(mainActivity);
    }
}
