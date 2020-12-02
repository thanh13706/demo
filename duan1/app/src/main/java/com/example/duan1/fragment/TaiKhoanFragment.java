package com.example.duan1.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.duan1.CaiDatActivity;
import com.example.duan1.Login.DangNhapActivity;
import com.example.duan1.R;
import com.example.duan1.ThongTinTaiKhoanActivity;


public class TaiKhoanFragment extends Fragment {
    TextView tvDangXuat,tvTTTK,tvCaiDat;

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        tvTTTK = view.findViewById(R.id.tvThongTinKhachHang);
        tvCaiDat = view.findViewById(R.id.tvCaiDat);
        tvDangXuat = view.findViewById(R.id.tvDangXuat);

        tvTTTK.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getContext(), ThongTinTaiKhoanActivity.class));
            }
        });
        tvDangXuat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getContext(), DangNhapActivity.class));
            }
        });

        tvCaiDat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getContext(), CaiDatActivity.class));
            }
        });

        super.onViewCreated(view, savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_tai_khoan, container, false);
    }
}