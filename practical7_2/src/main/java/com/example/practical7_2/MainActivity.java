package com.example.practical7_2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button submit = (Button) findViewById(R.id.button);
        submit.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                EditText name = (EditText) findViewById(R.id.namefield);
                EditText age = (EditText) findViewById(R.id.ageField);
                EditText height = (EditText) findViewById(R.id.heightField);
                EditText weight = (EditText) findViewById(R.id.weightField);

                TextView shname= (TextView) findViewById(R.id.showName);
                TextView shage= (TextView) findViewById(R.id.showAge);
                TextView shheight= (TextView) findViewById(R.id.showHeight);
                TextView shweight = (TextView) findViewById(R.id.showWeight);

                shname.setText(name.getText());
                shage.setText(age.getText());
                shheight.setText(height.getText()+" cm");
                shweight.setText(weight.getText()+" kg");
            }
        });
    }
}