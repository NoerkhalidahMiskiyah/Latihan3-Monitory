package com.noerkhalidah.latihan3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Login extends AppCompatActivity {

    public void tobiodata(View view) {
        Intent tobiodata = new Intent(Login.this, Biodata.class);
        startActivity(tobiodata);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }
}