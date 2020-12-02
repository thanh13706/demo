package com.example.duan1.employee.adapterempoyee;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.example.duan1.R;
import com.example.duan1.employee.model.HoaDonMoi;

import java.util.ArrayList;

public class HoaDonMoiAdapter extends RecyclerView.Adapter<HoaDonMoiAdapter.MyViewHolder> {
    private Context context;
    private ArrayList<HoaDonMoi> list;

    public HoaDonMoiAdapter(Context context, ArrayList<HoaDonMoi> list) {
        this.context = context;
        this.list = list;
    }
    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = ((Activity) context).getLayoutInflater();
        View view = inflater.inflate(R.layout.item_hoadonmoi, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

        holder.dateHDmoi.setText(list.get(position).getDatehdmoi());
        holder.MSmoi.setText(list.get(position).getMa());
        holder.TenKH.setText(list.get(position).getTenKH());
    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

        TextView dateHDmoi, MSmoi,TenKH;
        CardView cardHD;

        public MyViewHolder(View view) {
            super(view);

            dateHDmoi = view.findViewById(R.id.datehdmoi);
            MSmoi = view.findViewById(R.id.tvMSmoi);
            TenKH = view.findViewById(R.id.TenKH);
            cardHD = view.findViewById(R.id.cardhoadonmoi);
        }
    }
}
