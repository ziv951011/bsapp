package com.zivbs.zivbs.presenter.activity;

import android.text.TextUtils;
import android.util.Log;

import com.google.gson.Gson;
import com.zhy.http.okhttp.OkHttpUtils;
import com.zhy.http.okhttp.callback.StringCallback;
import com.zivbs.zivbs.model.net.RegisterModel;
import com.zivbs.zivbs.presenter.base.BasePresenter;
import com.zivbs.zivbs.ui.activity.RegisterActivity;
import com.zivbs.zivbs.utils.BSConstants;
import com.zivbs.zivbs.utils.MD5Utils;

import okhttp3.Call;

public class RegisterPresenter extends BasePresenter {

    private RegisterActivity registerActivity;

    public RegisterPresenter(RegisterActivity registerActivity) {
        this.registerActivity = registerActivity;
    }

    public void checkUserInput(String userName, String passWord) {
        if (userName == null || TextUtils.isEmpty(userName)) {
            registerActivity.userNameIsNull();
            return;
        }

        if (passWord == null || TextUtils.isEmpty(passWord)) {
            registerActivity.passWordIsNull();
            return;
        }

        /**
         * 进行网络访问
         * 此处将密码进行加密
         */
        OkHttpUtils.get().url(BSConstants.REGISTER_URL)
                .addParams("userName", userName)
                .addParams("passWord", MD5Utils.md5(passWord))
                .build().execute(new StringCallback() {
            @Override
            public void onError(Call call, Exception e, int id) {
                // TODO 网络请求错误
                registerActivity.serverFiled(e.getMessage().toString());
            }

            @Override
            public void onResponse(String response, int id) {
                // 获取json 进行解析 此处说明已经注册成功
                Log.e(TAG, "onResponse: " + "====" + response );
                Gson gson = new Gson();
                RegisterModel registerModule = gson.fromJson(response, RegisterModel.class);
                if (registerModule.getCode() == BSConstants.SUCCESS_CODE) {
                    registerActivity.registerSuccess(registerModule.getMsg());
                } else {
                    registerActivity.registerFiled(registerModule.getMsg());
                }
            }
        });
    }
}
