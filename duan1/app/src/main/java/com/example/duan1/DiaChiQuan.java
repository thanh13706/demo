package com.example.duan1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.duan1.fragment.CuaHangFragment;

public class DiaChiQuan extends AppCompatActivity {
    ImageView iv;
    CardView cv;
    TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dia_chi_quan);
        iv = findViewById(R.id.ivQuaylai);
        tv = findViewById(R.id.tvPhone);
        iv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(DiaChiQuan.this, CuaHangFragment.class);
                startActivity(i);
            }
        });
        cv = findViewById(R.id.cv_phone);
        cv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String phone = tv.getText().toString();
                Intent i = new Intent(DiaChiQuan.this,MyService.class);
                Bundle bundle = new Bundle();
                bundle.putString("phone",phone);
                i.putExtra("value",bundle);
                startService(i);
            }
        });
    }
}