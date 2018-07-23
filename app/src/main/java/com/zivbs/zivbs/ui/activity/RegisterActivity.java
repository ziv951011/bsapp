package com.zivbs.zivbs.ui.activity;

import android.app.AlertDialog;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;
import android.widget.Button;

import com.rengwuxian.materialedittext.MaterialEditText;
import com.zivbs.zivbs.R;
import com.zivbs.zivbs.dagger2.comonent.DaggerRegisterActivityComonent;
import com.zivbs.zivbs.dagger2.module.RegisterModule;
import com.zivbs.zivbs.presenter.activity.RegisterPresenter;
import com.zivbs.zivbs.ui.base.BaseActivity;
import com.zivbs.zivbs.utils.ToastUtil;

import javax.inject.Inject;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;


/**
 * 新用户注册
 */
public class RegisterActivity extends BaseActivity {

    private static final String TAG = RegisterActivity.class.getSimpleName();


    @Inject
    RegisterPresenter registerPresenter;

    @BindView(R.id.et_userName)
    MaterialEditText etUserName;
    @BindView(R.id.et_passWord)
    MaterialEditText etPassWord;
    @BindView(R.id.btn_register)
    Button btnRegister;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        ButterKnife.bind(this);

        // 完成初始化动作
        init();
    }

    private void init() {
        DaggerRegisterActivityComonent.builder().registerModule(new RegisterModule(this))
                .build().in(this);

    }

    @OnClick(R.id.btn_register)
    public void onViewClicked() {

        // 获取用户输入的信息
        String userName = etUserName.getText().toString().trim();
        String passWord = etPassWord.getText().toString().trim();

        // 校验用户输入
        registerPresenter.checkUserInput(userName, passWord);
    }

    public void userNameIsNull() {
        ToastUtil.shortToast(this, "用户名不能为空");
    }

    public void passWordIsNull() {
        ToastUtil.shortToast(this, "密码不能为空");
    }

    public void serverFiled(String s) {
        ToastUtil.shortToast(this, "服务器异常,请稍后再试！");
        Log.e(TAG, "serverFiled: " + s);
    }

    public void registerSuccess(String msg) {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("温馨提示");
        builder.setMessage(msg);
        builder.setNegativeButton("确定", null);
        builder.show();
    }

    public void registerFiled(String msg) {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("温馨提示");
        builder.setMessage(msg);
        builder.setNegativeButton("确定", null);
        builder.show();
    }
}
