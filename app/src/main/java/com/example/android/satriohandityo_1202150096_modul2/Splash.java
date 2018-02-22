package com.example.android.satriohandityo_1202150096_modul2;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Splash extends AppCompatActivity {
    //Untuk menentukan berapa lama splashscreen akan ditampilkan 3000 berarti 3 detik
    private static int SPLASH_TIME = 3000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        new Handler().postDelayed(new Runnable(){
            @Override
            public void run(){
                //Untuk lanjut ke MainActivity setelah 3 detik
                Intent intent = new Intent(Splash.this, MainActivity.class);
                startActivity(intent);
                //Agar activity lain tidak dapat kembali lagi ke activity ini
                finish();
            }
        },SPLASH_TIME);
    }
}