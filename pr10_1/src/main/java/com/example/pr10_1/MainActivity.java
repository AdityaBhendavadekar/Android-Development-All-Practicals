package com.example.pr10_1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button submit = (Button) findViewById(R.id.submit);
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText name = (EditText) findViewById(R.id.username);
                EditText pass = (EditText) findViewById(R.id.password);

                String username = name.getText().toString();
                String userPass = pass.getText().toString();

//                Toast.makeText(MainActivity.this, username, Toast.LENGTH_SHORT).show();
                if(username.equals("aditya") && userPass.equals("aditya123")){
                    Toast.makeText(MainActivity.this, "Login successful", Toast.LENGTH_SHORT).show();
                }
                else{
                    Toast.makeText(MainActivity.this, "Enter correct username and password", Toast.LENGTH_SHORT).show();
                }
                }
        });
    }
}