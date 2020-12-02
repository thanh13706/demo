package com.example.duan1.employee.fragmentvoucher;

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
import com.example.duan1.employee.adapterempoyee.VoucherHetHanAdapter;
import com.example.duan1.employee.model.HetHan;

import java.util.ArrayList;
import java.util.List;

public class VoucherHetHanFragment extends Fragment {
    List<HetHan> list;
    RecyclerView rcv;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_voucher_het_han,container,false);
        rcv = view.findViewById(R.id.rcv_vchethan);

        list = new ArrayList<>();
        list.add(new HetHan(R.drawable.discount,"Khuyến mãi gạch giá","giảm giá 30%","28/11/2020","28/12/2020"));

        VoucherHetHanAdapter adapter =new VoucherHetHanAdapter(getActivity(), (ArrayList<HetHan>) list);
        rcv.setLayoutManager(new GridLayoutManager(getActivity(),1));
        rcv.setAdapter(adapter);
        return view;
    }
}
