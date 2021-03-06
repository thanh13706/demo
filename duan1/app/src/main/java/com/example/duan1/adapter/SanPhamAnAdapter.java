package com.example.duan1.adapter;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.example.duan1.R;
import com.example.duan1.model.SanPhamAn;
import com.example.duan1.model.SanPhamUong;

import java.util.ArrayList;

public class SanPhamAnAdapter extends RecyclerView.Adapter<SanPhamAnAdapter.MyViewHolder> {
    private Context context;
    private ArrayList<SanPhamAn> list;
    int bd = 0;
    public SanPhamAnAdapter(Context context, ArrayList<SanPhamAn> list) {
        this.context = context;
        this.list = list;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = ((Activity)context).getLayoutInflater();
        View view = inflater.inflate(R.layout.item_sanphaman,parent,false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.image.setImageResource(list.get(position).getImage());
        holder.plus.setImageResource(list.get(position).getPlus());
        holder.tvTitle.setText(list.get(position).getTitle());
        holder.tvPrice.setText(list.get(position).getPrice());
        holder.cardSPPB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                diaLogThem(position);
            }
        });
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        ImageView image,plus;
        TextView tvTitle, tvPrice;
        CardView cardSPPB;
        public MyViewHolder(View view){
            super(view);
            image = view.findViewById(R.id.imgSanPhamAn);
            plus = view.findViewById(R.id.imgPlus);
            tvTitle = view.findViewById(R.id.tvTenSPA);
            tvPrice = view.findViewById(R.id.tvGia);
            cardSPPB = view.findViewById(R.id.cardSPA);

        }
    }
    private void diaLogThem(int position){
        AlertDialog.Builder builder = new AlertDialog.Builder(context);
        LayoutInflater inflater = ((Activity)context).getLayoutInflater();
        View view = inflater.inflate(R.layout.dialogthemsanpham,null);
        builder.setView(view);
        Button btnHuy,btnDongY;

        final Dialog dialog = builder.create();
        final TextView tvTitle = view.findViewById(R.id.tvTitle);
        final TextView tvPrice = view.findViewById(R.id.tvPrice);
        final ImageView tvImage = view.findViewById(R.id.imgThemSanPhamPB);
        final Button btnCong = view.findViewById(R.id.btnCong);
        final Button btnTru = view.findViewById(R.id.btnTru);
        final TextView tvSoLuong = view.findViewById(R.id.tvThemSoLuong);

        btnCong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bd++;
                tvSoLuong.setText(String.valueOf(bd));            }
        });
        btnTru.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(bd == 0){
                    tvSoLuong.setText("0");
                }else {
                    bd--;
                    tvSoLuong.setText(String.valueOf(bd));
                }
            }
        });
        //fill vao view cua dialog
        tvTitle.setText(list.get(position).getTitle());
        tvPrice.setText(list.get(position).getPrice());
        tvImage.setImageResource(list.get(position).getImage());
        dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        dialog.show();
    }
}
