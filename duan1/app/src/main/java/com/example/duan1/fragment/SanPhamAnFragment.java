package com.example.duan1.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.duan1.R;
import com.example.duan1.adapter.SanPhamAnAdapter;
import com.example.duan1.adapter.SanPhamUongAdapter;
import com.example.duan1.model.SanPhamAn;
import com.example.duan1.model.SanPhamUong;

import java.util.ArrayList;
import java.util.List;

public class SanPhamAnFragment extends Fragment {
    List<SanPhamAn> list;
    RecyclerView rcv;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_san_pham_an,container,false);
        rcv = view.findViewById(R.id.rcv_an);

        list = new ArrayList<>();
        list.add(new SanPhamAn(R.drawable.spa1,R.drawable.ic_plus,"Macca phủ socola","45.000 đ"));
        list.add(new SanPhamAn(R.drawable.spa8,R.drawable.ic_plus,"Mochi Kem Chocolate","19.000 đ"));
        list.add(new SanPhamAn(R.drawable.spa9,R.drawable.ic_plus,"Mochi Kem Matcha","19.000 đ"));
        list.add(new SanPhamAn(R.drawable.spa10,R.drawable.ic_plus,"Mochi Kem Xoài","19.000 đ"));
        list.add(new SanPhamAn(R.drawable.spa2,R.drawable.ic_plus,"Gà Xé Lá Chanh","25,000 đ"));
        list.add(new SanPhamAn(R.drawable.spa3,R.drawable.ic_plus,"Heo Sấy Xông Khói","35,000 đ"));
        list.add(new SanPhamAn(R.drawable.spa4,R.drawable.ic_plus,"Bánh Mì Chà Bông Phô Mai","50.000 đ"));
        list.add(new SanPhamAn(R.drawable.spa5,R.drawable.ic_plus,"Bánh Mì Que","12.000 đ"));
        list.add(new SanPhamAn(R.drawable.spa6,R.drawable.ic_plus,"Bông Lan Trứng Muối","29.000 đ"));
        list.add(new SanPhamAn(R.drawable.spa7,R.drawable.ic_plus,"Mít Sấy","20.000 đ"));

        SanPhamAnAdapter adapter =new SanPhamAnAdapter(getActivity(), (ArrayList<SanPhamAn>) list);
        rcv.setLayoutManager(new GridLayoutManager(getActivity(),2));
        rcv.setAdapter(adapter);

        return view;
    }
}