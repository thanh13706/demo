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
import com.example.duan1.employee.model.LichSu;

import java.util.ArrayList;

public class LichSuAdapter extends RecyclerView.Adapter<LichSuAdapter.MyViewHolder> {
    private Context context;
    private ArrayList<LichSu> list;

    public LichSuAdapter(Context context, ArrayList<LichSu> list) {
        this.context = context;
        this.list = list;
    }
    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = ((Activity) context).getLayoutInflater();
        View view = inflater.inflate(R.layout.item_lichsu, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.ma.setText(list.get(position).getMa());
        holder.MSls.setText(list.get(position).getMSlichsu());
        holder.timenhan.setText(list.get(position).getTgnhan());
        holder.timegiao.setText(list.get(position).getTggiao());
        holder.somon.setText(list.get(position).getSomon());
        holder.tongtien.setText(list.get(position).getTongtien());
        holder.date.setText(list.get(position).getDate());
        holder.TenKH.setText(list.get(position).getTenKH());
    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        TextView  ma,MSls,TenKH,timenhan,timegiao,somon,tongtien,date;
        CardView cardHD;

        public MyViewHolder(View view) {
            super(view);

            ma = view.findViewById(R.id.MaHD);
            MSls = view.findViewById(R.id.tvMSlichsu);
            TenKH = view.findViewById(R.id.TenKH);
            timenhan = view.findViewById(R.id.tglay);
            timegiao = view.findViewById(R.id.tggiao);
            somon = view.findViewById(R.id.slmon);
            tongtien = view.findViewById(R.id.tvTongtien);
            date = view.findViewById(R.id.dategiaohang);
            cardHD = view.findViewById(R.id.cardhoadonmoi);
        }
    }
}
