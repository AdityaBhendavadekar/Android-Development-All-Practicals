package com.example.broadcast;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

        import android.content.BroadcastReceiver;
        import android.content.Context;
        import android.content.Intent;
        import android.content.IntentFilter;
        import android.os.Bundle;
        import android.widget.TextView;


        import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private TextView mTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mTextView = findViewById(R.id.t1);

        registerReceiver(new BroadcastReceiver() {
            @Override
            public void onReceive(Context context, Intent intent) {
                mTextView.append("ACTION_AIRPLANE_MODE_CHANGED\n");
            }
        }, new IntentFilter(Intent.ACTION_AIRPLANE_MODE_CHANGED));

        registerReceiver(new BroadcastReceiver() {
            @Override
            public void onReceive(Context context, Intent intent) {
                mTextView.append("ACTION_BATTERY_CHANGED\n");
            }
        }, new IntentFilter(Intent.ACTION_BATTERY_CHANGED));

        registerReceiver(new BroadcastReceiver() {
            @Override
            public void onReceive(Context context, Intent intent) {
                mTextView.append("ACTION_BOOT_COMPLETED\n");
            }
        }, new IntentFilter(Intent.ACTION_BOOT_COMPLETED));

        registerReceiver(new BroadcastReceiver() {
            @Override
            public void onReceive(Context context, Intent intent) {
                mTextView.append("ACTION_SCREEN_ON\n");
            }
        }, new IntentFilter(Intent.ACTION_SCREEN_ON));

        registerReceiver(new BroadcastReceiver() {
            @Override
            public void onReceive(Context context, Intent intent) {
                mTextView.append("ACTION_SCREEN_OFF\n");
            }
        }, new IntentFilter(Intent.ACTION_SCREEN_OFF));

        registerReceiver(new BroadcastReceiver() {
            @Override
            public void onReceive(Context context, Intent intent) {
                mTextView.append("ACTION_SHUTDOWN\n");
            }
        }, new IntentFilter(Intent.ACTION_SHUTDOWN));

        registerReceiver(new BroadcastReceiver() {
            @Override
            public void onReceive(Context context, Intent intent) {
                mTextView.append("ACTION_TIME_TICK\n");
            }
        }, new IntentFilter(Intent.ACTION_TIME_TICK));

        registerReceiver(new BroadcastReceiver() {
            @Override
            public void onReceive(Context context, Intent intent) {
                mTextView.append("ACTION_AIRPLANE_MODE_CHANGED\n");
            }
        }, new IntentFilter(Intent.EXTRA_PHONE_NUMBER));
        registerReceiver(new BroadcastReceiver() {
            @Override
            public void onReceive(Context context, Intent intent) {
                mTextView.append("ACTION_AIRPLANE_MODE_CHANGED\n");
            }
        }, new IntentFilter(Intent.ACTION_REBOOT));

        registerReceiver(new BroadcastReceiver() {
            @Override
            public void onReceive(Context context, Intent intent) {
                mTextView.append("Headset_PUgged in\n");
            }
        }, new IntentFilter(Intent.ACTION_HEADSET_PLUG));
    }
}