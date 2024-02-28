package com.example.practical7_1;

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

        Button b = (Button) findViewById(R.id.button);
        b.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                EditText name =(EditText) findViewById(R.id.editTextTextPersonName);
                EditText pass = (EditText) findViewById(R.id.editTextTextPersonName2);

                TextView shname = (TextView) findViewById(R.id.textView4);
                shname.setText(name.getText());

                TextView shpass= (TextView) findViewById(R.id.textView5);
                shpass.setText(pass.getText());
            }
        });
    }

}