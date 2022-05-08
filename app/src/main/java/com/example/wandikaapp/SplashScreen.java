package com.example.wandikaapp;

//Tanggal Pengerjaan: 09-05-2022
//NIM: 10119220
//Nama: Moch. Wandika Yusgiar
//Kelas: IF - 6

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import androidx.appcompat.app.AppCompatActivity;

public class SplashScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(new Intent(SplashScreen.this,MainActivity.class));
                finish();
            }
        },2000);
    }
}
