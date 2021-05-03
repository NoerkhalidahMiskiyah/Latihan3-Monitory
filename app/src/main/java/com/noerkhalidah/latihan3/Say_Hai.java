package com.noerkhalidah.latihan3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Say_Hai extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_say__hai);

        Intent intent=getIntent();
        String message = intent.getStringExtra(Biodata.EXTRA_MESSAGE);
        TextView textView = (TextView)findViewById(R.id.textView);
        textView.setText("Beres! Sekarang " + message + " udah bisa ngecek penggunaan HP " + message + " tiap hari buat bantu " + message + " ngatur waktu :)");
    }
}