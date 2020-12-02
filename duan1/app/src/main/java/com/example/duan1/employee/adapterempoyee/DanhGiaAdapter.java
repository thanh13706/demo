package com.example.duan1.employee.adapterempoyee;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.example.duan1.R;
import com.example.duan1.employee.model.DanhGia;

import java.util.ArrayList;

public class DanhGiaAdapter extends RecyclerView.Adapter<DanhGiaAdapter.MyViewHolder> {
    private Context context;
    private ArrayList<DanhGia> list;

    public DanhGiaAdapter(Context context, ArrayList<DanhGia> list) {
        this.context = context;
        this.list = list;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = ((Activity) context).getLayoutInflater();
        View view = inflater.inflate(R.layout.item_danhgia, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.image.setImageResource(list.get(position).getImage());
        holder.tvSTT.setText(list.get(position).getMa());
        holder.tvName.setText(list.get(position).getTenMon());

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        ImageView image;
        TextView tvName, tvSTT;
        CardView cardDG;

        public MyViewHolder(View view) {
            super(view);
            image = view.findViewById(R.id.imgdanhgia);
            tvSTT = view.findViewById(R.id.tvMSdanhgia);
            tvName = view.findViewById(R.id.tvtenmondanhgia);
            cardDG = view.findViewById(R.id.carddanhgia);
        }
    }
}
