package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputLayout;

public class BalokActivity extends AppCompatActivity {

    private TextInputLayout p;
    private TextInputLayout t;
    private TextInputLayout l;
    Button hitung;
    TextView hasilVolume;
    TextView hasilLuasPermukaan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_balok);
        p = findViewById(R.id.txtInputPanjang);
        t = findViewById(R.id.txtInputTinggi);
        l = findViewById(R.id.txtInputLebar);
        hitung = (Button) findViewById(R.id.btnHitungBalok);
        hasilVolume = (TextView) findViewById(R.id.tvVolumeBalok);
        hasilLuasPermukaan = (TextView) findViewById(R.id.tvLuasPermukaanBalok);
        hitung.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                if (p.getEditText().getText().length() == 0 && t.getEditText().getText().length() == 0 && l.getEditText().getText().length() == 0) {
                    Toast.makeText(getApplication(), "Field Can't be Empty", Toast.LENGTH_LONG).show();
                } else if (p.getEditText().getText().length() == 0) {
                    Toast.makeText(getApplication(), "Field Can't be Empty", Toast.LENGTH_LONG).show();
                } else if (l.getEditText().getText().length() == 0) {
                    Toast.makeText(getApplication(), "Field Can't be Empty", Toast.LENGTH_LONG).show();
                } else if (t.getEditText().getText().length() == 0) {
                    Toast.makeText(getApplication(), "Field Can't be Empty", Toast.LENGTH_LONG).show();
                } else {
                    String isipanjang = p.getEditText().getText().toString();
                    String isitinggi = t.getEditText().getText().toString();
                    String isilebar = l.getEditText().getText().toString();

                    double p = Double.parseDouble(isipanjang);
                    double t = Double.parseDouble(isitinggi);
                    double l = Double.parseDouble(isilebar);
                    double vs = VolumeJajarGenjang(p, t, l);
                    double ls = LuasPermukaanJajarGenjang(p, t, l);
                    String output1 = String.valueOf(vs);
                    String output2 = String.valueOf(ls);
                    hasilVolume.setText(output1.toString());
                    hasilLuasPermukaan.setText(output2.toString());
                }
            }
        });
    }
    public double VolumeJajarGenjang(double p, double t, double l) {
        return p * l * t;
    }
    public double LuasPermukaanJajarGenjang(double p, double t, double l) {
        return 2 * ((p * l) + (p * t) + (l * t));
    }


}
