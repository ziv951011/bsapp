package com.zivbs.zivbs.dagger2.comonent;

import com.zivbs.zivbs.dagger2.module.HomeFragmentModule;
import com.zivbs.zivbs.ui.fragment.HomeFragment;

import dagger.Component;

@Component(modules = HomeFragmentModule.class)
public interface HomeFragmentComonent {
    void in(HomeFragment homeFragment);
}
