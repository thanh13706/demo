package com.example.duan1.fragment;

import android.app.Dialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridLayout;
import android.widget.ImageView;

import androidx.appcompat.app.AlertDialog;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.duan1.R;
import com.example.duan1.adapter.SanPhamPhoBienAdapter;
import com.example.duan1.model.SanPhamPhoBien;

import java.util.ArrayList;
import java.util.List;

public class SanPhamPhoBienFragment extends Fragment {
    List<SanPhamPhoBien> list;
    RecyclerView rcv;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_san_pham_pho_bien,container,false);
        rcv = view.findViewById(R.id.rcv_sanphamphobien);

        list = new ArrayList<>();
        list.add(new SanPhamPhoBien(R.drawable.sppb1,R.drawable.ic_plus,"Cà phê lúa mạch đá","69.000 đ"));
        list.add(new SanPhamPhoBien(R.drawable.sppb2,R.drawable.ic_plus,"Cà phê lúa mạch nóng","69.000 đ"));
        list.add(new SanPhamPhoBien(R.drawable.sppb3,R.drawable.ic_plus,"Sôcôla Lúa Mạch đá xay","69.000 đ"));
        list.add(new SanPhamPhoBien(R.drawable.sppb4,R.drawable.ic_plus,"Sôcôla Lúa Mạch nóng","69.000 đ"));
        list.add(new SanPhamPhoBien(R.drawable.sanpham2,R.drawable.ic_plus,"Cà phê đen","32.000 đ"));
        list.add(new SanPhamPhoBien(R.drawable.sanpham1,R.drawable.ic_plus,"Cà phê sữa","32.000 đ"));
        SanPhamPhoBienAdapter adapter =new SanPhamPhoBienAdapter(getActivity(), (ArrayList<SanPhamPhoBien>) list);
        rcv.setLayoutManager(new GridLayoutManager(getActivity(),2));
        rcv.setAdapter(adapter);

        return view;
    }

}