package com.example.pr9_2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText num1 = (EditText) findViewById(R.id.num1);
        EditText num2  = (EditText) findViewById(R.id.num2);
        EditText res = (EditText) findViewById(R.id.result);

        Button add = (Button) findViewById(R.id.add);
        Button sub = (Button) findViewById(R.id.sub);
        Button mul = (Button) findViewById(R.id.mul);
        Button clear = (Button) findViewById(R.id.clear);
        Button d = (Button) findViewById(R.id.d);
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double n1 = Double.parseDouble(num1.getText().toString());
                double n2 = Double.parseDouble(num2.getText().toString());
                res.setText(""+(n1+n2));
            }
        });
        sub.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                double n1 = Double.parseDouble(num1.getText().toString());
                double n2 = Double.parseDouble(num2.getText().toString());
                res.setText(""+(n1-n2));
            }
        });
        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double n1 = Double.parseDouble(num1.getText().toString());
                double n2 = Double.parseDouble(num2.getText().toString());
                res.setText(""+(n1*n2));
            }
        });
        d.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                double n1 = Double.parseDouble(num1.getText().toString());
                double n2 = Double.parseDouble(num2.getText().toString());
                res.setText(""+(n1/n2));
            }
        });
        clear.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                num1.setText("");
                num2.setText("");
                res.setText("");
                num1.requestFocus();
            }
        });
    }
}