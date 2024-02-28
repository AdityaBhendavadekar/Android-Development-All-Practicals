package com.example.simplelogin;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button login;
    EditText username,password;
    String eUsername,ePass;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        login = findViewById(R.id.login);
        username = (EditText) findViewById(R.id.username);
        password = findViewById(R.id.password);

        login.setOnClickListener(view -> {
            eUsername = username.getText().toString();
            ePass = password.getText().toString();

            if(eUsername.equalsIgnoreCase("aditya") && ePass.equals("Aditya")){
                Toast.makeText(this, "Login Successful", Toast.LENGTH_SHORT).show();
            }
            else{
                Toast.makeText(this, "Login Unsuccessful", Toast.LENGTH_SHORT).show();
            }
        });
    }

}