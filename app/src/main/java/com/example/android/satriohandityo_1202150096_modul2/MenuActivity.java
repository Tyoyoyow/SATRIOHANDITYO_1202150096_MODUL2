package com.example.android.satriohandityo_1202150096_modul2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MenuActivity extends AppCompatActivity {
    //List makanan yang ada
    List<Food> listMakanan;

    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        recyclerView = (RecyclerView) findViewById(R.id.recycler);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        //Membuat array list makanan
        listMakanan = new ArrayList<>();
        //Untuk menambahkan data makanan ke dalam array
        listMakanan.add(
                new Food(1, "Mie Goreng", "Harga Rp. 14.000", R.drawable.mie_goreng, "Nasi, kecap, ayam"));

        listMakanan.add(
                new Food(2, "Bakso", "Harga Rp. 10.000", R.drawable.bakso, "Daging sapi, sayuran, kuah"));
        listMakanan.add(
                new Food(3, "Rendang", "Harga Rp. 16.000", R.drawable.rendang,"Daging sapi, bumbu"));
        listMakanan.add(
                new Food(4, "Sate Ayam", "Harga Rp. 15.000", R.drawable.sate,"Tusuk sate, daging ayam, kecap"));

        RecyclerAdapter adapter = new RecyclerAdapter(this, listMakanan);

        //Untuk meset adapter pada recyclerview yang dibuat
        recyclerView.setAdapter(adapter);

    }
}
