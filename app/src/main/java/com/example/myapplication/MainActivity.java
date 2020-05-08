package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import com.google.android.material.textfield.TextInputLayout;

public class MainActivity extends AppCompatActivity {

    private TextInputLayout txtUsername;
    private TextInputLayout txtPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtUsername = findViewById(R.id.txtInputUsername);
        txtPassword = findViewById(R.id.txtInputPassword);
        Button Login = (Button)findViewById(R.id.btnSignIn);

        Login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                validate(txtUsername.getEditText().getText().toString(), txtPassword.getEditText().getText().toString());
            }
        });
    }

    private void validate (String userName, String userPassword) {
        if(userName.equals("19101125") && userPassword.equals("19101125")) {
            Toast.makeText(getApplicationContext(),"Redirecting...",Toast.LENGTH_LONG).show();
            Intent intent= new Intent(MainActivity.this, TwoActivity.class);
            startActivity(intent);
        }
        else {
            Toast.makeText(getApplicationContext(), "Wrong Credentials",Toast.LENGTH_SHORT).show();
        }
    }
}
