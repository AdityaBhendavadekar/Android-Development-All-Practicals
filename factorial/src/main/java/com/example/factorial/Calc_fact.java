package com.example.factorial;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.provider.Telephony;
import android.widget.TextView;

public class Calc_fact extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calc_fact);
        Bundle extras = getIntent().getExtras();
        TextView fact = (TextView) findViewById(R.id.fact);
        int n = extras.getInt("num");

        int i, factorial=1;
        for(int j=1;j<=n;j++){
            factorial *=j;
        }
        fact.setText("Factorial Number: "+String.valueOf(factorial));
    }
}