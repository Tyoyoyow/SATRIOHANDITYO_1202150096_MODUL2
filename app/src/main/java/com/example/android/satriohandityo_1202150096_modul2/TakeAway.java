package com.example.android.satriohandityo_1202150096_modul2;

import android.content.Intent;
import android.support.v4.app.DialogFragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class TakeAway extends AppCompatActivity {
    EditText tanggal;
    EditText waktu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_take_away);
        Button pesan = (Button) findViewById(R.id.buttonPesanTake);
        //Untuk merespon ketika button pesan di klik akan mengalihkan ke MenuActivity
        pesan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(TakeAway.this, MenuActivity.class);
                startActivity(intent);
            }
        });
    }

    //Ketika tanggal dipilih melalui fragment maka secara otomatis field akan terisi
    public void processDatePickerResult(int year, int month, int day) {
        String month_string = Integer.toString(month+1);
        String day_string = Integer.toString(day);
        String year_string = Integer.toString(year);
        String dateMessage = (month_string + "/" +
                day_string + "/" + year_string);
        tanggal.setText(dateMessage);
    }

    //Ketika waktu dipilih melalui fragment maka secara otomatis field akan terisi
    public void processTimePickerResult(int hourOfDay, int minute) {
        String hour_string = Integer.toString(hourOfDay);
        String minute_string = Integer.toString(minute);
        String timeMessage = (hour_string + ":" + minute_string);
        waktu.setText(timeMessage);
    }
}
