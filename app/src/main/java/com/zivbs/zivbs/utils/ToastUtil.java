package com.zivbs.zivbs.utils;

import android.content.Context;
import android.widget.Toast;

public class ToastUtil {

    /**
     *
     * @param context
     * @param desc
     */
    public static void shortToast(Context context, String desc) {
        Toast.makeText(context, desc, Toast.LENGTH_SHORT).show();
    }
}
