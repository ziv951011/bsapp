package com.zivbs.zivbs.dagger2.comonent;

import com.zivbs.zivbs.dagger2.module.MainModule;
import com.zivbs.zivbs.ui.activity.MainActivity;
import dagger.Component;

@Component(modules = MainModule.class)
public interface MainComonent {
    void in(MainActivity mainActivity);
}
