package com.example.loginsystem;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText mob,pass;
    Button login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mob=findViewById(R.id.mobile);
        pass = findViewById(R.id.password);
        login = findViewById(R.id.login);

        final SharedPreferences sharedPreferences = getSharedPreferences("Data",Context.MODE_PRIVATE);

        final String credentials = sharedPreferences.getString("mobile","");

        if(credentials.isEmpty()){
            Toast.makeText(this, "Please Login ", Toast.LENGTH_SHORT).show();
        }
        else{
            Intent intent = new Intent(this,AfterLogin.class);
            startActivity(intent);
//            finish();
        }

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SharedPreferences.Editor editor = sharedPreferences.edit();
                editor.putString("mobile",mob.getText().toString());
                editor.putString("password",pass.getText().toString());
                editor.commit();

                Intent intent = new Intent(MainActivity.this,AfterLogin.class);
                Toast.makeText(MainActivity.this, "Login successfull", Toast.LENGTH_SHORT).show();
                startActivity(intent);
                finish();
            }
        });
    }
    @Override
    public void onBackPressed() {
        super.onBackPressed();

    }

}