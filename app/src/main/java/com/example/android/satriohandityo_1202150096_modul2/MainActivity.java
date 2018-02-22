package com.example.android.satriohandityo_1202150096_modul2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(getApplicationContext(), "SATRIO_1202150096", Toast.LENGTH_SHORT).show();
        final RadioButton dineIn = (RadioButton) findViewById(R.id.dineIn);
        final RadioButton takeAway = (RadioButton) findViewById(R.id.takeAway);
        Button pesan = (Button) findViewById(R.id.pesan);
        //Untuk membuat respon ketika button pesan di klik
        pesan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Jika yang di check adalah dine in maka akan ke aktivitas DineInActivity
                if (dineIn.isChecked()) {
                    Intent intent = new Intent(MainActivity.this, DineIn.class);
                    startActivity(intent);
                    //Jika yang di check adalah take away maka akan ke aktivitas TakeAwayActivity
                } else if (takeAway.isChecked()) {
                    Intent intent = new Intent(MainActivity.this, TakeAway.class);
                    startActivity(intent);
                }
            }
        });
    }

    //Untuk membuat respon ketika salah satu radio button di klik
    public void onRadioButtonClick(View view) {
        boolean checked = ((RadioButton) view).isChecked();
        switch (view.getId()) {
            //Jika radio button Dine In akan muncul toast seperti dibawah
            case R.id.dineIn:
                if (checked)
                    Toast.makeText(this, "Anda memilih Dine In", Toast.LENGTH_SHORT).show();
                break;
            //Jika radio button Take Away akan muncul toast seperti dibawah
            case R.id.takeAway:
                if (checked)
                    Toast.makeText(this, "Anda memilih Take Away", Toast.LENGTH_SHORT).show();
                break;
            //Jika tidak ada yang dipilih akan muncul log dan toast seperti dibawah
            default:
                Toast.makeText(this, "Harap pilih salah satu", Toast.LENGTH_SHORT).show();
                break;
        }
    }

}
