package com.example.aniket.openinfotech_weatherapp.activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import java.util.Timer;
import java.util.TimerTask;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Timer timer = new Timer();
        timer.schedule(new TimerTask(){
            @Override
            public void run() {

                Intent home_page = new Intent(SplashActivity.this,MainActivity.class);
                startActivity(home_page);
                finish();
            }}, 2500);

    }
}