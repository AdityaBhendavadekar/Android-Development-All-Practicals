package com.example.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView l1;
    String lang[]={"c","c++","python","java","scala","R","Javascript","PHP","vb.Net","flask", "Swift","Kotlin","Flutter","Go","C#","Perl","Rust"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        l1 = (ListView) findViewById(R.id.listview);
//        ArrayAdapter <String> adp = new ArrayAdapter<String>(MainActivity.this, android.R.layout.simple_list_item_1,lang);
        ArrayAdapter<String> adp = new ArrayAdapter<>(MainActivity.this, android.R.layout.simple_list_item_1,lang);

        l1.setAdapter(adp);
        l1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(MainActivity.this, ""+lang[i], Toast.LENGTH_SHORT).show();
            }
        });
    }
}