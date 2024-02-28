package com.example.factorial;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EditText num = (EditText) findViewById(R.id.number);

        Button b = findViewById(R.id.fact);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int number = Integer.parseInt(num.getText().toString());
                Intent intent = new Intent(MainActivity.this, Calc_fact.class);
                intent.putExtra("num",number);
                startActivity(intent);
            }
        });
    }
}