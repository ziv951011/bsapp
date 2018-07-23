package com.zivbs.zivbs.ui.apdater;


import android.content.Context;

import com.zhy.adapter.recyclerview.MultiItemTypeAdapter;
import com.zivbs.zivbs.ui.apdater.delagate.BannerItemDelagate;

import java.util.List;

public class HomeAdapter extends MultiItemTypeAdapter {

    public HomeAdapter(Context context, List datas) {
        super(context, datas);
//        addItemViewDelegate(new BannerItemDelagate());
    }
}
