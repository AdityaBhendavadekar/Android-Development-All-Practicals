package com.example.practical15_2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        CheckBox pizza = (CheckBox) findViewById(R.id.pizza);
        CheckBox coffee = (CheckBox) findViewById(R.id.coffee);
        CheckBox burger = (CheckBox) findViewById(R.id.burger);


        Button order = (Button) findViewById(R.id.order);

        order.setOnClickListener(new View.OnClickListener() {
            String show="";
            int sum=0;
            @Override
            public void onClick(View view) {
                show = "Selected Items\n";
                sum=0;
                if(pizza.isChecked() || coffee.isChecked() || burger.isChecked()) {
                    if (pizza.isChecked()) {
                        show += "Pizza: 100Rs \n";
                        sum += 100;
                    }
                    if (coffee.isChecked()) {
                        show += "Coffee: 50Rs \n";
                        sum += 50;
                    }
                    if (burger.isChecked()) {
                        show += "Burger: 120Rs \n";
                        sum += 120;
                    }
                    Toast.makeText(MainActivity.this, ""+show+"Total: " + sum+"Rs", Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(MainActivity.this, "Please order something", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
}