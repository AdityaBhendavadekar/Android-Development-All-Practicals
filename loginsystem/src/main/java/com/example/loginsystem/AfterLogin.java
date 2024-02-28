package com.example.loginsystem;

import androidx.appcompat.app.AppCompatActivity;



import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class AfterLogin extends AppCompatActivity {
Button logout;
    private Intent nextActivityIntent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_after_login);

        logout = findViewById(R.id.logout);

        final SharedPreferences sharedPreferences = getSharedPreferences("Data", Context.MODE_PRIVATE);

        nextActivityIntent = new Intent(this, MainActivity.class);

        logout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SharedPreferences.Editor editor = sharedPreferences.edit();
                editor.clear();
                editor.commit();
                finish();
            }
        });
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        finish();

        // Close the next activity if it is currently running
        if (nextActivityIntent != null) {
            startActivity(nextActivityIntent);
            finish();
        }
    }
}