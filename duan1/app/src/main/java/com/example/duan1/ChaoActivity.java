package com.example.duan1;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import androidx.appcompat.app.AppCompatActivity;

import com.example.duan1.Onbroading.OnbroadingActivity;

public class ChaoActivity extends AppCompatActivity {

    //AnimationDrawable animationDrawable;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chao);
       // ImageView imageView = findViewById(R.id.image);
       // animationDrawable= (AnimationDrawable) imageView.getDrawable();
       // animationDrawable.start();

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(new
                        Intent(getApplicationContext(), OnbroadingActivity.class));
                finish();
            }
        },1500);
    }
}