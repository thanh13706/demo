package com.example.duan1.employee;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.duan1.Login.DangNhapActivity;
import com.example.duan1.R;

public class TaiKhoanNVFragment extends Fragment {
    TextView tvDangXuat,tvTTTK;

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        tvTTTK = view.findViewById(R.id.tvThongTinKhachHang);
        tvDangXuat = view.findViewById(R.id.tvDangXuat);

        tvTTTK.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getContext(), TaiKhoanNVActivity.class));
            }
        });
        tvDangXuat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getContext(), DangNhapActivity.class));
            }
        });
        super.onViewCreated(view, savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_tai_khoan_n_v, container, false);
    }
}
