package com.example.dell.mvp;

import android.text.TextUtils;

import java.util.logging.Handler;

public class LoginModel {

    interface OnLoginFinishedListener {
        void onUsernameError();

        void onPasswordError();

        void onSuccess();
    }


    public void validate(String name, String pass, OnLoginFinishedListener listener)
    {
        if (TextUtils.isEmpty(name)) {
            listener.onUsernameError();
            return;
        }
        if (TextUtils.isEmpty(pass)) {
            listener.onPasswordError();
            return;
        }
        listener.onSuccess();


    }

}
