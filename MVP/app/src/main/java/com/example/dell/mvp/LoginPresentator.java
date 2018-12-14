package com.example.dell.mvp;

public class LoginPresentator implements LoginModel.OnLoginFinishedListener {


    LoginView loginView;
    LoginModel loginModel;


    LoginPresentator(LoginView lv, LoginModel lp)
    {
        this.loginView = lv;
        this.loginModel = lp;

    }

    public void validateCredentials(String name, String password)
    {
        loginView.showProgress();


        loginModel.validate(name,password, this);

    }

    @Override
    public void onUsernameError() {

        loginView.hideProgress();
        loginView.setUsernameError();

    }

    @Override
    public void onPasswordError() {

        loginView.hideProgress();
        loginView.setPasswordError();
    }

    @Override
    public void onSuccess() {

        loginView.hideProgress();
        loginView.toastMessage();
    }
}
