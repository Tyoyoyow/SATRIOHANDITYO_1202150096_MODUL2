package com.example.android.satriohandityo_1202150096_modul2;

/**
 * Created by tyo on 2/22/18.
 */

public class Food {
    private int id;
    private String nama;
    private String harga;
    private int gambar;
    private String bahan;

    //Method/Constructor untuk menentukan parameter apa saja yang dibutuhkan oleh class makanan ini
    public Food(int id, String nama, String harga, int gambar, String bahan){
        this.id = id;
        this.nama = nama;
        this.harga = harga;
        this.gambar = gambar;
        this.bahan = bahan;
    }

    //Untuk mengambil data makanan
    public int getId(){
        return id;
    }

    public String getHarga() {
        return harga;
    }

    public String getNama() {
        return nama;
    }

    public int getGambar() {
        return gambar;
    }

    public String getBahan(){
        return bahan;
    }
}
