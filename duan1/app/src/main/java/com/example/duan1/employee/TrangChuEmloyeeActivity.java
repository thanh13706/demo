package com.example.duan1.employee;

import android.os.Bundle;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import com.example.duan1.MainActivity;
import com.example.duan1.R;
import com.example.duan1.employee.fragmentdanhgia.DanhGiaFragment;
import com.example.duan1.employee.fragmentemployee.HoaDonFragment;
import com.example.duan1.employee.fragmentvoucher.VoucherFragment;
import com.ismaeldivita.chipnavigation.ChipNavigationBar;

public class TrangChuEmloyeeActivity extends AppCompatActivity {
    ChipNavigationBar chipNavigationBar;
    private static final String TAG = MainActivity.class.getSimpleName() ;
    FragmentManager manager;
    Fragment fragment= null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_trang_chu_emloyee);
        chipNavigationBar = findViewById(R.id.bottomTrangChuEmp);
        if (savedInstanceState == null) {
            getSupportFragmentManager()
                    .beginTransaction()
                    .add(R.id.frame2, new HoaDonFragment())
                    .commit();
            chipNavigationBar.setItemSelected(R.id.hoadon, true);
            chipNavigationBar.setOnItemSelectedListener(new ChipNavigationBar.OnItemSelectedListener() {

                @Override
                public void onItemSelected(int id) {
                    switch (id) {
                        case R.id.hoadon:
                            fragment = new HoaDonFragment();
                            break;
                        case R.id.danhgia:
                            fragment = new DanhGiaFragment();
                            break;
                        case R.id.voucher:
                            fragment = new VoucherFragment();
                            break;
                        case R.id.taikhoan:
                            fragment = new TaiKhoanNVFragment();
                            break;
                    }
                    if (fragment != null) {
                        manager = getSupportFragmentManager();
                        manager.beginTransaction().replace(R.id.frame2, fragment).commit();
                    } else {
                        Log.e(TAG, "Erro");
                    }

                }
            });
        }


    }
}