package com.example.practical11;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button submit = (Button) findViewById(R.id.button);
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                CheckBox read = (CheckBox) findViewById(R.id.read);
                CheckBox swim = (CheckBox) findViewById(R.id.swim);
                CheckBox story = (CheckBox) findViewById(R.id.write);
                CheckBox cook = (CheckBox) findViewById(R.id.cook);
                CheckBox sketch = (CheckBox) findViewById(R.id.sketch);

                String str="You hobbies are: ";
                if(read.isChecked()){
                    str+=" readding ";
                }
                if(swim.isChecked()){
                    str+=" Swimming ";
                }
                if(story.isChecked())
                    str+=" Story writing ";
                if(cook.isChecked())
                    str+=" Cooking ";
                if(sketch.isChecked())
                    str+=" Sketching ";

                Toast.makeText(MainActivity.this, str, Toast.LENGTH_SHORT).show();
            }
        });
    }
}