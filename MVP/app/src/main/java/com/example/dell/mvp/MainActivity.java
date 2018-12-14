package com.example.dell.mvp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements LoginView {


    private EditText userName;
    private EditText password;
    private Button login;
    private LoginPresentator loginPresentator;
    private ProgressBar progressBar;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        userName = (EditText)findViewById(R.id.username);
        password = (EditText) findViewById(R.id.password);

        login = (Button) findViewById(R.id.login);
        progressBar = (ProgressBar) findViewById(R.id.progress_bar);

        loginPresentator = new LoginPresentator(this, new LoginModel());



        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                loginPresentator.validateCredentials(userName.getText().toString(), password.getText().toString());
            }
        });



    }

    @Override
    public void showProgress() {

        progressBar.setVisibility(View.VISIBLE);
    }

    @Override
    public void hideProgress() {

        progressBar.setVisibility(View.GONE);
    }

    @Override
    public void setUsernameError() {

        userName.setError("name error");
    }

    @Override
    public void setPasswordError() {

        password.setError("password error");

    }

    @Override
    public void toastMessage() {
        Toast.makeText(getApplicationContext(),"SUCCESS",Toast.LENGTH_SHORT).show();
    }
}
