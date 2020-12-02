package com.example.duan1.Login;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.duan1.R;

public class DangKiActivity extends AppCompatActivity {
    TextView tvDaCoTaiKhoan;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dang_ki);
        tvDaCoTaiKhoan = findViewById(R.id.tvDaCoTaiKhoan);
        tvDaCoTaiKhoan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(DangKiActivity.this, DangNhapActivity.class);
                startActivity(i);
            }
        });
    }

}