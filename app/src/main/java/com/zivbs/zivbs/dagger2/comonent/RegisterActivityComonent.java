package com.zivbs.zivbs.dagger2.comonent;

import com.zivbs.zivbs.dagger2.module.RegisterModule;
import com.zivbs.zivbs.ui.activity.RegisterActivity;

import dagger.Component;

@Component(modules = RegisterModule.class)
public interface RegisterActivityComonent {
    void in(RegisterActivity registerActivity);
}
