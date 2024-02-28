package com.example.practical10_2;

import static android.graphics.Color.RED;
import static com.example.practical10_2.R.*;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(layout.activity_main);
        Button reg = (Button) findViewById(id.regi);

        reg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText username = (EditText) findViewById(id.username);
                EditText password = (EditText) findViewById(id.password);
                EditText email = (EditText) findViewById(id.email);
                EditText mobile = (EditText) findViewById(id.mobile);

                String nameTxt = String.valueOf(username.getText());
                String passTxt = String.valueOf(password.getText());
                String mailTxt = String.valueOf(email.getText());
                String mobTxt = String.valueOf(mobile.getText());

                String str="";

                if(nameTxt.equals(str)){
                    Toast.makeText(MainActivity.this, "First enter your name",Toast.LENGTH_LONG).show();
                }
                else if(mailTxt.equals(str)){
                    Toast.makeText(MainActivity.this, "Please enter mail id.", Toast.LENGTH_SHORT).show();
                }
                else if(passTxt.equals(str)){
                        Toast.makeText(MainActivity.this, "Please create password", Toast.LENGTH_SHORT).show();
                    }
                else if(mobTxt.equals(str)){
                    Toast.makeText(MainActivity.this, "Please enter mobile number", Toast.LENGTH_SHORT).show();
                }
                else{
                    Toast.makeText(MainActivity.this, "Registration successfull", Toast.LENGTH_SHORT).show();
                    Intent i = new Intent(MainActivity.this,Registered.class);
                    startActivity(i);
                }
            }
        });

    }
}