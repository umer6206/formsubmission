package com.example.formsubmission;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class regform extends AppCompatActivity {
    EditText username,regNo,pwd;
    Button registration;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_regform);

        getSupportActionBar().hide();

        username = (EditText) findViewById(R.id.username);
        regNo = (EditText) findViewById(R.id.regNo);
        pwd = (EditText) findViewById(R.id.pwd);
        registration =(Button) findViewById(R.id.register);


        registration.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String user = username.getText().toString();
                String pass = pwd.getText().toString();
                String reg = regNo.getText().toString();

                Intent intent = new Intent(regform.this, MainActivity.class);
                intent.putExtra("user",user);
                intent.putExtra("reg",reg);
                intent.putExtra("pass",pass);
                startActivity(intent);
            }
        });
    }
}