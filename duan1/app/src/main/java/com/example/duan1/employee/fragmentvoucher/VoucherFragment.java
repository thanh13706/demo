package com.example.duan1.employee.fragmentvoucher;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import com.example.duan1.R;
import com.example.duan1.adapter.TabLayoutAdapter;
import com.example.duan1.fragment.SanPhamPhoBienFragment;
import com.example.duan1.fragment.SanPhamUongFragment;
import com.google.android.material.tabs.TabLayout;

public class VoucherFragment extends Fragment {
    ViewPager viewPager;

    public void addTab(ViewPager viewPager){
        TabLayoutAdapter adapter = new TabLayoutAdapter(getChildFragmentManager());
        adapter.add(new SanPhamPhoBienFragment(),"Đang chạy");
        adapter.add(new SanPhamUongFragment(),"hết hạn");

        viewPager.setAdapter(adapter);
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_voucher,container,false);
        viewPager = view.findViewById(R.id.viewPagervoucher);
        addTab(viewPager);
        ((TabLayout)view.findViewById(R.id.tabLayoutvoucher)).setupWithViewPager(viewPager);
        return view;
    }
}
