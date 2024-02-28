package com.example.practical9_1;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.CompoundButton;
import android.widget.TextView;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView text = (TextView) findViewById(R.id.textView);
        ToggleButton blue = (ToggleButton) findViewById(R.id.bluetooth);
        blue.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(b){
                    text.setText("Bluetooth is On");
                    text.setBackgroundColor(Color.GREEN);
                }
                else{
                    text.setText("Bluetooth is off.");
                    text.setBackgroundColor(Color.RED);
                }
            }
        });
    }
}