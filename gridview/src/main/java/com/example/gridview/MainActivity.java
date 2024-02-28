package com.example.gridview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    String buttonName[]={"Button 1","Button 2","Button 3","Button 4","Button 5","Button 6","Button 7","Button 8",
                   "Button 9", "Button 10","Button 11","Button 12","Button 13","Button 14","Button 15"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        GridView gd = (GridView) findViewById(R.id.gridview);
        ArrayAdapter <String> adp = new ArrayAdapter<>(MainActivity.this,R.layout.activity_grid,R.id.button,buttonName);
        gd.setAdapter(adp);

        gd.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                 Toast.makeText(MainActivity.this, ""+buttonName[i], Toast.LENGTH_SHORT).show();
            }
        });
    }
}