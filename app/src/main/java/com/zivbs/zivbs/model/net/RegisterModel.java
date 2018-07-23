package com.zivbs.zivbs.model.net;

public class RegisterModel {


    /**
     * userName : 1111
     * passWord : 1111
     * code : 200
     * msg : resgisterSuccess
     */

    private String userName;
    private String passWord;
    private int code;
    private String msg;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
