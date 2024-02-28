package com.example.messagingapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

import android.content.pm.PackageManager;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText number, sms;
    String phone,message;
    Button send;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        send = findViewById(R.id.button);
        number = findViewById(R.id.editTextTextPersonName);
        sms = findViewById(R.id.editTextTextPersonName2);

        send.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sendSMS();
            }

            private void sendSMS() {
                phone = number.getText().toString();
                message = sms.getText().toString();

//                if(ContextCompat(MainActivity.this,Manifest.permission.)!=PackageManager.PERMISSION_GRANTED){
//                    if(ActivityCompat.shouldShowRequestPermissionRationale(MainActivity.this,Manifest.permission.SEND_SMS)){
//
//                    }
//                    else{
//                        ActivityCompat.requestPermissions(this,new String[]{Manifest.permission.SEND_SMS},MY_PERMISSION_REQUEST_SEND_SMS);
//                    }
//                }
            }
        });
    }
}