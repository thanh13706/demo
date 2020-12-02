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
import com.example.duan1.employee.adapterempoyee.LichSuAdapter;
import com.example.duan1.employee.model.LichSu;

import java.util.ArrayList;
import java.util.List;

public class LichSuFragment extends Fragment {
    List<LichSu> list;
    RecyclerView rcv;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_lich_su,container,false);
        rcv = view.findViewById(R.id.rcv_ls);
        list = new ArrayList<>();
        list.add(new LichSu(1,21000,"19","12345678912","Thanh Le","21:30","21:45","28/11/2020"));

        LichSuAdapter adapter =new LichSuAdapter(getActivity(), (ArrayList<LichSu>) list);
        rcv.setLayoutManager(new GridLayoutManager(getActivity(),1));
        rcv.setAdapter(adapter);
        return view;
    }
}
