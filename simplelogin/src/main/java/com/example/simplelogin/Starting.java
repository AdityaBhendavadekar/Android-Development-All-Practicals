package com.example.simplelogin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Starting extends AppCompatActivity {

    Button b27,b28;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_starting);

        b27 = findViewById(R.id.button);
        b27.setOnClickListener(view -> {
            Intent intent = new Intent(Starting.this,MainActivity.class);
            startActivity(intent);
        });

        b28 = findViewById(R.id.button2);
        b28.setOnClickListener(view -> {
            Intent intent = new Intent(Starting.this,Practical28.class);
            startActivity(intent);
        });
    }
}