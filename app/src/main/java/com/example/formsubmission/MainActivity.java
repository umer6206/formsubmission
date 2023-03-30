package com.example.formsubmission;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Button ADD;
    TextView reg, user, pwd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();

        ADD = (Button) findViewById(R.id.ADD);
        reg= (TextView) findViewById(R.id.regg);
        user = (TextView) findViewById(R.id.user);
        pwd = (TextView) findViewById(R.id.password);
        ADD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, regform.class);
                startActivity(intent);
            }
        });

        Intent formData = getIntent();
        String username = formData.getStringExtra("user");
        String registration_number = formData.getStringExtra("reg");
        String pass = formData.getStringExtra("pass");


        reg.setText(registration_number);
        user.setText(username);
        pwd.setText(pass);



    }
}