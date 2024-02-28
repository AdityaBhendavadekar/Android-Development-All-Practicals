package com.example.practical8_2;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

public class MainActivity extends AppCompatActivity {

    String[] sub = {"PWP","MAD","WBP","EDE","ETI","MGT","CPE"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayAdapter<String> adp = new ArrayAdapter<String>(this, android.R.layout.select_dialog_item,sub);
        AutoCompleteTextView act = (AutoCompleteTextView) findViewById(R.id.autoCompleteTextView);
        act.setThreshold(1);
        act.setAdapter(adp);
        act.setTextColor(Color.BLACK);

    }
}