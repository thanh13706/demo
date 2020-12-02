package com.example.duan1.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import com.example.duan1.R;
import com.example.duan1.XemGioHang;
import com.example.duan1.adapter.TabLayoutAdapter;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.tabs.TabLayout;


public class MenuFragment extends Fragment {
    ViewPager viewPager;
    ImageView imgGioHang;

    public void addTab(ViewPager viewPager){
        TabLayoutAdapter adapter = new TabLayoutAdapter(getChildFragmentManager());
        adapter.add(new SanPhamPhoBienFragment(),"Phổ biến");
        adapter.add(new SanPhamUongFragment(),"Loại uống");
        adapter.add(new SanPhamAnFragment(),"Loại ăn");

        viewPager.setAdapter(adapter);
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_menu,container,false);
        imgGioHang = view.findViewById(R.id.imgGioHang);

        imgGioHang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getActivity(), XemGioHang.class);
                startActivity(i);
            }
        });

        viewPager = view.findViewById(R.id.viewPager);
        addTab(viewPager);
        ((TabLayout)view.findViewById(R.id.tabLayout)).setupWithViewPager(viewPager);
        return view;
    }


}