package com.example.duan1;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import com.example.duan1.Login.DoiMatKhauActivity;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.bottomsheet.BottomSheetDialog;

public class ThongTinTaiKhoanActivity extends AppCompatActivity {
    Toolbar tbTttk;
    TextView tvDMK;
    ImageView imgHinh;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_thong_tin_tai_khoan);
        tbTttk = findViewById(R.id.toolbarThongTinTaiKhoan);
        tvDMK = findViewById(R.id.tvDoiMatKhauTTKH);
        imgHinh = findViewById(R.id.image_Hinh);

        setSupportActionBar(tbTttk);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        tvDMK.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), DoiMatKhauActivity.class));
                overridePendingTransition(0,0);
            }
        });

        imgHinh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final BottomSheetDialog bottomSheetDialog = new BottomSheetDialog(
                        ThongTinTaiKhoanActivity.this,R.style.BottomSheet
                );
                View bottomSheet = LayoutInflater.from(getApplicationContext())
                        .inflate(R.layout.bottm_sheet_layout,
                                (LinearLayout)findViewById(R.id.bottom_sheetCont));

                bottomSheet.findViewById(R.id.tvChonAnh).setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Toast.makeText(ThongTinTaiKhoanActivity.this, "Chọn ảnh !!!", Toast.LENGTH_SHORT).show();
                    }
                });
                bottomSheetDialog.setContentView(bottomSheet);
                bottomSheetDialog.show();
            }
        });

    }
    @Override
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return true;
    }

}