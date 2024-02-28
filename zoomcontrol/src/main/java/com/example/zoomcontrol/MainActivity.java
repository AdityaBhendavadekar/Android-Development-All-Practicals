package com.example.zoomcontrol;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;
import android.widget.ZoomControls;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ZoomControls zoom = findViewById(R.id.zoom);
        ImageView img = findViewById(R.id.imageView2);

       img.setOnTouchListener(new View.OnTouchListener() {
           @Override
           public boolean onTouch(View view, MotionEvent motionEvent) {
               zoom.show();
               return false;
           }
       });

       zoom.setOnZoomInClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               float x = img.getScaleX();
               float y = img.getScaleY();
               // set increased value of scale x and y to perform zoom in functionality
               img.setScaleX((float) (x + 1));
               img.setScaleY((float) (y + 1));
               // display a toast to show Zoom In Message on Screen
               Toast.makeText(getApplicationContext(),"Zoom In",Toast.LENGTH_SHORT).show();
               // hide the ZoomControls from the screen
               zoom.hide();
           }
       });

        zoom.setOnZoomOutClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float x = img.getScaleX();
                float y = img.getScaleY();
                // set increased value of scale x and y to perform zoom in functionality
                img.setScaleX((float) (x - 1));
                img.setScaleY((float) (y - 1));
                // display a toast to show Zoom In Message on Screen
                Toast.makeText(getApplicationContext(),"Zoom out",Toast.LENGTH_SHORT).show();
                // hide the ZoomControls from the screen
                zoom.hide();
            }
        });
            }
}