package com.example.duan1.employee.fragmentemployee;

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
import com.example.duan1.employee.adapterempoyee.HoaDonMoiAdapter;
import com.example.duan1.employee.model.HoaDonMoi;

import java.util.ArrayList;
import java.util.List;

public class HoaDonMoiFragment  extends Fragment {
    List<HoaDonMoi> list;
    RecyclerView rcv;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_hoa_don_moi,container,false);
        rcv = view.findViewById(R.id.rcv_hdm);
        list.add(new HoaDonMoi("19","Thanh Le","28/11/2020"));

        HoaDonMoiAdapter adapter =new HoaDonMoiAdapter(getActivity(), (ArrayList<HoaDonMoi>) list);
        rcv.setLayoutManager(new GridLayoutManager(getActivity(),1));
        rcv.setAdapter(adapter);
        return view;
    }
}
