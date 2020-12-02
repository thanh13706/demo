package com.example.duan1.employee.fragmentdanhgia;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.duan1.R;
import com.example.duan1.employee.adapterempoyee.DanhGiaAdapter;
import com.example.duan1.employee.model.DanhGia;

import java.util.ArrayList;
import java.util.List;

public class DanhGiaFragment extends Fragment {
    List<DanhGia> list;
    RecyclerView rcv;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_danh_gia,container,false);
        rcv = view.findViewById(R.id.rcv_danhgia);
        list = new ArrayList<>();
        list.add(new DanhGia(R.drawable.sanpham1,"1","Macca phủ socola"));
        list.add(new DanhGia(R.drawable.sanpham1,"2","Macca phủ socola"));
        list.add(new DanhGia(R.drawable.sanpham1,"3","Macca phủ socola"));
        list.add(new DanhGia(R.drawable.sanpham1,"4","Macca phủ socola"));
        list.add(new DanhGia(R.drawable.sanpham1,"5","Macca phủ socola"));
        list.add(new DanhGia(R.drawable.sanpham1,"6","Macca phủ socola"));

        DanhGiaAdapter adapter =new DanhGiaAdapter(getActivity(), (ArrayList<DanhGia>) list);
        rcv.setLayoutManager(new GridLayoutManager(getActivity(),1));
        rcv.setAdapter(adapter);
        return view;
    }
}
