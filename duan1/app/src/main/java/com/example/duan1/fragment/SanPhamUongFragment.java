package com.example.duan1.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.duan1.R;
import com.example.duan1.adapter.SanPhamPhoBienAdapter;
import com.example.duan1.adapter.SanPhamUongAdapter;
import com.example.duan1.model.SanPhamPhoBien;
import com.example.duan1.model.SanPhamUong;

import java.util.ArrayList;
import java.util.List;

public class SanPhamUongFragment extends Fragment {
    List<SanPhamUong> list;
    RecyclerView rcv;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_san_pham_uong,container,false);
        rcv = view.findViewById(R.id.rcv_cafe);

        list = new ArrayList<>();
        list.add(new SanPhamUong(R.drawable.sanpham1,R.drawable.ic_plus,"Cà phê sữa đá","32.000 đ"));
        list.add(new SanPhamUong(R.drawable.spu1,R.drawable.ic_plus,"Bạc Xỉu","32.000 đ"));
        list.add(new SanPhamUong(R.drawable.sanpham3,R.drawable.ic_plus,"Cà Phê Đá Xay-Lạnh","59.000 đ"));
        list.add(new SanPhamUong(R.drawable.sanpham8,R.drawable.ic_plus,"Trà đen Macchiato","50.000 đ"));
        list.add(new SanPhamUong(R.drawable.sanpham7,R.drawable.ic_plus,"Trà Đào Cam Sả-Đá","45.000 đ"));
        list.add(new SanPhamUong(R.drawable.sanpham6,R.drawable.ic_plus,"Trà Phúc Bồn Tử","50.000 đ"));
        SanPhamUongAdapter adapter =new SanPhamUongAdapter(getActivity(), (ArrayList<SanPhamUong>) list);
        rcv.setLayoutManager(new GridLayoutManager(getActivity(),2));
        rcv.setAdapter(adapter);

        return view;
    }
}