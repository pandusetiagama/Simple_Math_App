package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class TwoActivity extends AppCompatActivity {

    Button segitiga = null;
    Button jajargenjang = null;
    Button balok = null;
    Button Logout = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_two);

        segitiga = (Button)findViewById(R.id.btnSegitiga);
        jajargenjang = (Button)findViewById(R.id.btnJajarGenjang);
        balok = (Button)findViewById(R.id.btnBalok);
        Logout= (Button)findViewById(R.id.btnSignOut);
        segitiga.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view1) {
                Intent intent1 = new Intent(TwoActivity.this, SegitigaActivity.class);
                startActivity(intent1);
            }
        });
        jajargenjang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view2) {
                Intent intent2 = new Intent(TwoActivity.this, JajarGenjangActivity.class);
                startActivity(intent2);
            }
        });
        balok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view3) {
                Intent intent3 = new Intent(TwoActivity.this, BalokActivity.class);
                startActivity(intent3);
            }
        });
        Logout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view4) {
                Intent intent4 = new Intent(TwoActivity.this, MainActivity.class);
                startActivity(intent4);
                finish();
            }
        });
    }
}
