package com.example.duan1.employee;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import com.example.duan1.R;
import com.google.android.material.bottomsheet.BottomSheetDialog;

public class TaiKhoanNVActivity extends AppCompatActivity {
    Toolbar tbTttk;
    ImageView imgHinhnv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tai_khoan_n_v);
        tbTttk = findViewById(R.id.toolbarThongTinTaiKhoan);
        imgHinhnv = findViewById(R.id.image_Hinhnv);
        setSupportActionBar(tbTttk);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        imgHinhnv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final BottomSheetDialog bottomSheetDialog = new BottomSheetDialog(
                        TaiKhoanNVActivity.this,R.style.BottomSheet
                );
                View bottomSheet = LayoutInflater.from(getApplicationContext())
                        .inflate(R.layout.bottm_sheet_layout,
                                (LinearLayout)findViewById(R.id.bottom_sheetCont));

                bottomSheet.findViewById(R.id.tvChonAnh).setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Toast.makeText(TaiKhoanNVActivity.this, "Chọn ảnh !!!", Toast.LENGTH_SHORT).show();
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