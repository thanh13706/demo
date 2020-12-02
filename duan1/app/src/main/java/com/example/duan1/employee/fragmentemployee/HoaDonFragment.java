package com.example.duan1.employee.fragmentemployee;

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
import com.example.duan1.fragment.SanPhamAnFragment;
import com.example.duan1.fragment.SanPhamPhoBienFragment;
import com.example.duan1.fragment.SanPhamUongFragment;
import com.google.android.material.tabs.TabLayout;

public class HoaDonFragment extends Fragment {
    ViewPager viewPager;

    public void addTab(ViewPager viewPager){
        TabLayoutAdapter adapter = new TabLayoutAdapter(getChildFragmentManager());
        adapter.add(new SanPhamPhoBienFragment(),"Mới");
        adapter.add(new SanPhamUongFragment(),"Đã nhận");
        adapter.add(new SanPhamAnFragment(),"Lịch sử");

        viewPager.setAdapter(adapter);
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_hoa_don,container,false);
        viewPager = view.findViewById(R.id.viewPagerhoadon);
        addTab(viewPager);
        ((TabLayout)view.findViewById(R.id.tabLayouthoadon)).setupWithViewPager(viewPager);
        return view;
    }
}
