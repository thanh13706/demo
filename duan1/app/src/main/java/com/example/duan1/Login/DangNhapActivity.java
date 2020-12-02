package com.example.duan1.Login;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;


import com.example.duan1.R;
import com.example.duan1.TrangChuActivity;

public class DangNhapActivity extends AppCompatActivity {
    Button btnDangNhap,btnDangKy,btnDangNhapGmail;
    TextView tvQuenMatKhau;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dang_nhap);
        btnDangNhap = findViewById(R.id.btnDangNhap);
        btnDangKy = findViewById(R.id.btnDangKy);
        tvQuenMatKhau = findViewById(R.id.tvQuenMatKhau);
        btnDangNhapGmail = findViewById(R.id.btnGmail);

        btnDangNhap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), TrangChuActivity.class));
                overridePendingTransition(0,0);
                Toast.makeText(DangNhapActivity.this,"Đăng nhạp thành công!!!",Toast.LENGTH_LONG).show();
            }
        });

        btnDangKy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(),DangKiActivity.class));
                overridePendingTransition(0,0);
            }
        });

        tvQuenMatKhau.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), LayMatKhauActivity.class));
                overridePendingTransition(0,0);
            }
        });
        btnDangNhapGmail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), DangNhapBangEmail.class));
                overridePendingTransition(0,0);
            }
        });
    }

}