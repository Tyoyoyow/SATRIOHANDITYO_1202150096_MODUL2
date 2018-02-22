package com.example.android.satriohandityo_1202150096_modul2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class DetailMenu extends AppCompatActivity {
    List<Food> listMakanan;
    TextView nama;
    TextView harga;
    TextView bahan;
    ImageView gambar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_menu);
        nama = (TextView)findViewById(R.id.namaMakanan);
        harga = (TextView)findViewById(R.id.textHarga);
        bahan = (TextView)findViewById(R.id.bahan);
        gambar = (ImageView)findViewById(R.id.gambar);
        //Untuk meset data yang dikirimkan melalui intent ke dalam layout DetailMenu
        int gambar1 = getIntent().getIntExtra("gambar",1);
        nama.setText(getIntent().getStringExtra("nama"));
        harga.setText(getIntent().getStringExtra("harga"));
        gambar.setImageDrawable(getResources().getDrawable(gambar1));
        bahan.setText(getIntent().getStringExtra("bahan"));

    }
}
