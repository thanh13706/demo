package com.example.duan1.Login;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.duan1.R;

public class LayMatKhauActivity extends AppCompatActivity {
    TextView tvQuayLaiDangNhap;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lay_mat_khau);
        tvQuayLaiDangNhap = findViewById(R.id.tvQuayLaiDangNhap);
        tvQuayLaiDangNhap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(LayMatKhauActivity.this,DangNhapActivity.class);
                startActivity(i);
            }
        });
    }

}