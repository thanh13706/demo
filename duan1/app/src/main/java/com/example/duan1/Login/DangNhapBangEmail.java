package com.example.duan1.Login;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import com.example.duan1.R;
import com.example.duan1.TrangChuActivity;

public class DangNhapBangEmail extends AppCompatActivity {
    Toolbar toolbar;
    Button btnTiepTuc;
    TextView tvQuenMatKhau;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dang_nhap_bang_email);
        btnTiepTuc = findViewById(R.id.btnDangNhapEmail);
        tvQuenMatKhau = findViewById(R.id.tvQuenMatKhauEmail);
        toolbar = findViewById(R.id.toolbarDangNhapBangEmail);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        btnTiepTuc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), TrangChuActivity.class));
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
    }
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return true;
    }
}