package com.example.simplelogin;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Practical28 extends AppCompatActivity {

    Button login;
    EditText username,password;
    String eUsername,ePass;
    int count;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_practical28);

        login = findViewById(R.id.login);
        username = (EditText) findViewById(R.id.username);
        password = findViewById(R.id.password);
        count = 0;

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                eUsername = username.getText().toString();
                ePass = password.getText().toString();

                if (eUsername.isEmpty() || ePass.isEmpty()) {
                    Toast.makeText(Practical28.this, "Username/Password shouldn't be empty.", Toast.LENGTH_SHORT).show();
                    return;
                } else if (eUsername.length() <= 3 || ePass.length() <= 3) {
                    Toast.makeText(Practical28.this, "Username or password length must be greater than 3", Toast.LENGTH_SHORT).show();
                    return;
                } else if (ePass.length() > 6) {
                    Toast.makeText(Practical28.this, "Passoword must be less than 6 digits.", Toast.LENGTH_SHORT).show();
                    return;
                } else if (eUsername.equalsIgnoreCase("aditya") && ePass.equals("Aditya")) {
                    Toast.makeText(Practical28.this, "Login Successful", Toast.LENGTH_SHORT).show();
                    count=0;
                } else {
                    Toast.makeText(Practical28.this, "Login Unsuccessful" + (++count), Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}