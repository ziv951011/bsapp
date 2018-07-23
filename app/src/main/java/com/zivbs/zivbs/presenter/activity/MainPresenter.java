package com.zivbs.zivbs.presenter.activity;

import com.zivbs.zivbs.presenter.base.BasePresenter;
import com.zivbs.zivbs.ui.activity.MainActivity;



public class MainPresenter extends BasePresenter {

    private MainActivity mainActivity;

    public MainPresenter(MainActivity mainActivity) {
        this.mainActivity = mainActivity;
    }

    /**
     * 根据用户名查询该用户是否已经注册
     * @param userName 用户名
     */
    public void isRegister(String userName) {

    }

    /**
     * 新用户注册
     * @param userName 用户名
     * @param passWord 密码需要进行md5加密
     */
    public void register(String userName, String passWord) {

    }
}
