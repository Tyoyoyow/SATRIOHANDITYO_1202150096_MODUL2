package com.example.android.satriohandityo_1202150096_modul2;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;



/**
 * Created by tyo on 2/22/18.
 */

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.RecyclerViewHolder> {

    private Context mCtx;

    private List<Food> listMakanan;

    //Method/Constructor pada class RecyclerAdapter
    public RecyclerAdapter(Context mCtx, List<Food> listMakanan) {
        this.mCtx = mCtx;
        this.listMakanan = listMakanan;
    }


    @Override
    public RecyclerViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(mCtx);
        View view = inflater.inflate(R.layout.activity_list_layout, null);
        return new RecyclerViewHolder(view);
    }

    //Mehtod agar ketika salah satu menu makanan diklik maka akan muncul DetailMenuActivity yang berisi detail dari menu yang dipilih
    @Override
    public void onBindViewHolder(RecyclerViewHolder holder, int position) {
        final Food makanan = listMakanan.get(position);

        holder.textNama.setText(makanan.getNama());
        holder.textHarga.setText(makanan.getHarga());
        holder.gambar.setImageDrawable(mCtx.getResources().getDrawable(makanan.getGambar()));
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(mCtx, DetailMenu.class);
                intent.putExtra("nama", makanan.getNama());
                intent.putExtra("harga", makanan.getHarga());
                intent.putExtra("gambar", makanan.getGambar());
                intent.putExtra("bahan", makanan.getBahan());
                mCtx.startActivity(intent);
            }
        });
    }

    //Method untuk menghitung jumlah list makanan
    @Override
    public int getItemCount() {
        return listMakanan.size();
    }

    //Class untuk recycleviewholder
    public class RecyclerViewHolder extends RecyclerView.ViewHolder {
        TextView textNama, textHarga;
        ImageView gambar;

        public RecyclerViewHolder(View itemView) {
            super(itemView);

            textNama = itemView.findViewById(R.id.textNama);
            textHarga = itemView.findViewById(R.id.textHarga);
            gambar = itemView.findViewById(R.id.img);

        }
    }
}
