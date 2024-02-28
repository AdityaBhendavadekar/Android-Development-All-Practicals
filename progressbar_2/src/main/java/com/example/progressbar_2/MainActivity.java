package com.example.progressbar_2;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;

public class MainActivity extends AppCompatActivity {
    ProgressBar pg;
    ProgressDialog progressDialog;
    Handler handler = new Handler();
    int progress=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button dwd = (Button) findViewById(R.id.dwd);
         progressDialog = new ProgressDialog(this);
        dwd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                progress=0;
                showProgressDialogWithTitle("File Downloading","please wait");
            }
            private void showProgressDialogWithTitle(String title,String substring) {
                progressDialog.setTitle(title);
                progressDialog.setMessage(substring);
                progressDialog.setProgressStyle(1);
                progressDialog.setCancelable(true);
                progressDialog.setMax(100);
                progressDialog.show();

                // Start Process Operation in a background thread
                new Thread(new Runnable() {
                    public void run() {
                        while (progress < 100) {
                            try{
                                // This is mock thread using sleep to show progress
                                Thread.sleep(200);
                                progress += 5;
                            } catch (InterruptedException e){
                                e.printStackTrace();
                            }
                            handler.post(new Runnable() {
                                public void run() {
                                    progressDialog.setProgress(progress);
                                }
                            });
                        }
                        progressDialog.dismiss();
                    }
                }).start();

            }
        });
    }
}