package com.example.openwebsite;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button nav = (Button) findViewById(R.id.button);
        EditText url = (EditText) findViewById(R.id.url);

        nav.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String web = url.getText().toString();
                if(web.length()>1){
                    Intent intent = new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse("https://"+web));
//                    Intent chooser=Intent.createChooser(intent,"Launch to website");
                    startActivity(intent);
                }
                else{
                    Toast.makeText(MainActivity.this, "Please Enter valid url", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}