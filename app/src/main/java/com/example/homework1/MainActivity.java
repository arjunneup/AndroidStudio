package com.example.homework1;

import android.content.Intent;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText etUsername, etPassword;
    Button btnLogin;
    String userName, userPassoword;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etUsername = (EditText) findViewById(R.id.et_username);
        etPassword= (EditText) findViewById(R.id.et_userPassword);
        btnLogin= (Button) findViewById(R.id.login_button);

    }


    public void buttonClicked(View view) {

        userName = etUsername.getText().toString();
        userPassoword = etPassword.getText().toString();

        if(userName.equals("student@gc.ca") && userPassoword.equals("Password")){
            Snackbar.make(view,"Welcome",Snackbar.LENGTH_LONG).show();

            Intent myIntent = new Intent(this, Main2Activity.class);
            startActivity(myIntent);
        }else{
            Snackbar.make(view,"Try again",Snackbar.LENGTH_LONG).show();
        }
    }
}
