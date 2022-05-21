package com.example.gethelp;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onLogin(View view){
        Intent login = new Intent(this, LogIn.class);
        startActivity(login);
    }

    public void onSignUp(View view){
        Intent signUp = new Intent(this, SignUp.class);
        startActivity(signUp);
    }
}