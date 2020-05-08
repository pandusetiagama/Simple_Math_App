package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputLayout;

public class JajarGenjangActivity extends AppCompatActivity {

    private TextInputLayout a;
    private TextInputLayout t;
    private TextInputLayout s;
    Button hitung;
    TextView hasilKeliling;
    TextView hasilLuas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jajar_genjang);
        a = findViewById(R.id.txtInputAlas);
        t = findViewById(R.id.txtInputTinggi);
        s = findViewById(R.id.txtSisiMiring);
        hitung = (Button) findViewById(R.id.btnHitungJajarGenjang);
        hasilKeliling = (TextView) findViewById(R.id.tvKelilingJajarGenjang);
        hasilLuas = (TextView) findViewById(R.id.tvLuasJajarGenjang);
        hitung.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                if (a.getEditText().getText().length() == 0 && t.getEditText().getText().length() == 0 && s.getEditText().getText().length() == 0) {
                    Toast.makeText(getApplication(), "Field Can't be Empty", Toast.LENGTH_LONG).show();
                } else if (a.getEditText().getText().length() == 0) {
                    Toast.makeText(getApplication(), "Field Can't be Empty", Toast.LENGTH_LONG).show();
                } else if (s.getEditText().getText().length() == 0) {
                    Toast.makeText(getApplication(), "Field Can't be Empty", Toast.LENGTH_LONG).show();
                } else if (t.getEditText().getText().length() == 0) {
                    Toast.makeText(getApplication(), "Field Can't be Empty", Toast.LENGTH_LONG).show();
                } else {
                    String isialas = a.getEditText().getText().toString();
                    String isitinggi = t.getEditText().getText().toString();
                    String isisisimiring = s.getEditText().getText().toString();

                    double a = Double.parseDouble(isialas);
                    double t = Double.parseDouble(isitinggi);
                    double s = Double.parseDouble(isisisimiring);
                    double ks = KelilingJajarGenjang(a, t, s);
                    double ls = LuasJajarGenjang(a, t);
                    String output1 = String.valueOf(ks);
                    String output2 = String.valueOf(ls);
                    hasilKeliling.setText(output1.toString());
                    hasilLuas.setText(output2.toString());
                }
            }
        });
    }
    public double KelilingJajarGenjang(double a, double t, double s) {
        return 2 * (a + s);
    }
    public double LuasJajarGenjang(double a, double t) {
        return a * t;
    }


}
