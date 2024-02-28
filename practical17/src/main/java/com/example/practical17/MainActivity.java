package com.example.practical17;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("Activity","Is created");
    }
    @Override
    protected void onStart(){
        super.onStart();
        Log.d("Activity","Started");
    }
    protected void onStop(){
        super.onStop();
        Log.d("Activity","Stopped");
    }
    protected void onDestroy(){
        super.onDestroy();
        Log.d("Activity","Stopped");
    }
    protected void onPause(){
        super.onPause();
        Log.d("Activity","Paused");
    }
    protected void onResume(){
        super.onResume();
        Log.d("Activity","Resume");
    }
}