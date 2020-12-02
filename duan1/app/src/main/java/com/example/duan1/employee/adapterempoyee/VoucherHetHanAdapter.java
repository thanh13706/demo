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
import com.example.duan1.employee.model.HetHan;

import java.util.ArrayList;

public class VoucherHetHanAdapter extends RecyclerView.Adapter<VoucherHetHanAdapter.MyViewHolder>{
    private Context context;
    private ArrayList<HetHan> list;

    public VoucherHetHanAdapter(Context context, ArrayList<HetHan> list) {
        this.context = context;
        this.list = list;
    }
    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = ((Activity) context).getLayoutInflater();
        View view = inflater.inflate(R.layout.item_voucherhethan, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.image.setImageResource(list.get(position).getImage());
        holder.tvName.setText(list.get(position).getTenKM());
        holder.tvmota.setText(list.get(position).getMota());
        holder.batdau.setText(list.get(position).getNgaybatdau());
        holder.ketthuc.setText(list.get(position).getNgayketthuc());
    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        ImageView image;
        TextView tvName, tvmota,batdau,ketthuc;
        CardView cardDC;

        public MyViewHolder(View view) {
            super(view);
            image = view.findViewById(R.id.ivKMHH);

            tvName = view.findViewById(R.id.tvTenKM);
            tvmota = view.findViewById(R.id.tvMotaKM);
            batdau = view.findViewById(R.id.batdaugiamgia);
            ketthuc = view.findViewById(R.id.ketthucgiamgia);
            cardDC = view.findViewById(R.id.voucherhethan);
        }
    }
}
