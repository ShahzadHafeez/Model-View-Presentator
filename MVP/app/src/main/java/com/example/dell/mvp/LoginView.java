package com.example.dell.mvp;

public interface LoginView {

    void showProgress();
    void hideProgress();
    void setUsernameError();
    void setPasswordError();
    void toastMessage();
}
