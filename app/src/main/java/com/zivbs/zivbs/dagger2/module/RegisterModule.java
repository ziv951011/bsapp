package com.zivbs.zivbs.dagger2.module;

import com.zivbs.zivbs.presenter.activity.RegisterPresenter;
import com.zivbs.zivbs.ui.activity.RegisterActivity;

import dagger.Module;
import dagger.Provides;

@Module
public class RegisterModule {
    private RegisterActivity registerActivity;

    public RegisterModule(RegisterActivity registerActivity) {
        this.registerActivity = registerActivity;
    }

    @Provides
    RegisterPresenter registerPresenterProvides() {
        return new RegisterPresenter(registerActivity);
    }
}
