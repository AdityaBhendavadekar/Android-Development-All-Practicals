package com.example.pr14_2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    int flag;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button change = (Button) findViewById(R.id.button);
        final ImageView img = (ImageView) findViewById(R.id.imageView);
        flag=0;

        change.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                if(flag==0){
                    flag=1;
                    img.setImageResource(R.drawable.spidy);
                }
                else if(flag==1){
                    flag=0;
                    img.setImageResource(R.drawable.download);
                }
            }
        });
    }
}