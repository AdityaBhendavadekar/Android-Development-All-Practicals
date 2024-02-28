package com.example.practical12;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button b1 = (Button) findViewById(R.id.button);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                RadioButton r1 = (RadioButton) findViewById(R.id.radioButton);
                RadioButton r2 = (RadioButton) findViewById(R.id.radioButton2);
                RadioButton male = (RadioButton) findViewById(R.id.radioButton3);
                RadioButton female = (RadioButton) findViewById(R.id.radioButton4);

                String str = "You selected: ";

                if(r1.isChecked()){
                    str+=" RadioButton 1 ";
                }
                if(r2.isChecked()){
                    str+=" RadioButton 2 ";
                }
                if(male.isChecked()){
                    str+=" Male ";
                }
                if(female.isChecked()){
                    str+=" Female ";
                }

                Toast.makeText(MainActivity.this, str, Toast.LENGTH_SHORT).show();
            }
        });
    }
}