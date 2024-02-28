package com.example.pr_26;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.lang.ref.WeakReference;

public class MainActivity extends AppCompatActivity {

    private EditText editTextName;
    private EditText editTextAge;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextName = findViewById(R.id.editTextName);
        editTextAge = findViewById(R.id.editTextAge);

        Button buttonInsert = findViewById(R.id.buttonInsert);
        buttonInsert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = editTextName.getText().toString();
                String age = editTextAge.getText().toString();

                new InsertDataAsyncTask(MainActivity.this).execute(name, age);
            }
        });
    }
}

class InsertDataAsyncTask extends AsyncTask<String, Void, Void> {

    private WeakReference<Activity> activityReference;

    InsertDataAsyncTask(Activity context) {
        activityReference = new WeakReference<>(context);
    }

    @Override
    protected Void doInBackground(String... params) {
        String name = params[0];
        String age = params[1];

        return null;
    }

    @Override
    protected void onPostExecute(Void aVoid) {
        super.onPostExecute(aVoid);

        Activity activity = activityReference.get();
        if (activity == null || activity.isFinishing()) {
            return;
        }

        Toast.makeText(activity, "Data inserted successfully", Toast.LENGTH_SHORT).show();
    }
}