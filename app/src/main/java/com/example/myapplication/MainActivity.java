package com.example.myapplication;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;

public class activity_mail extends AppCompatActivity {

    Button bsimpan;
    Button kosongkan;
    EditText enama;
    TextView thasil;
    RadioGroup rgjk;
    Spinner sevent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // inisialisasi
        bsimpan = (Button) findViewById(R.id.bsimpan);
        kosongkan = (Button) findViewById(R.id.kosongkan);

        enama = (EditText) findViewById(R.id.isinama);
        thasil = (TextView) findViewById(R.id.hasil);
        rgjk = (RadioGroup) findViewById(R.id.wk);
        sevent  = (Spinner) findViewById(R.id.event);

        kosongkan.setOnClickListener(new );


        bsimpan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String inputnama = String.valueOf(enama.getText().toString());


                int time = rgjk.getCheckedRadioButtonId();
                RadioButton jk = (RadioButton) findViewById(time );
                String inputwk = String.valueOf(wk.getText().toString());

                thasil.setText("\n" + "Nama lengkap\t\t\t\t\t\t\t\t\t\t\t: " + inputnama + "\n" +
                        "Nama\t\t\t\t\t\t\t\t\t\t: " + inputnama + "\n" +
                        "Waktu\t\t: " + time + "\n" +
                        "Event\t\t\t\t\t\t\t\t\t: " + sevent.getSelectedItem().toString() + "\n" +);
            }
        });

    }
}