package com.example.launchvideo;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.MediaController;
import android.widget.VideoView;

import java.net.URI;

public class MainActivity extends AppCompatActivity {

    Button btn;
    VideoView vdw;
    private static final int CAPTURE_VIDEO_ACTIVITY_REQUEST_CODE = 10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn = findViewById(R.id.button);
        vdw = findViewById(R.id.videoView);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //create Intent to record video and return it to the calling application
                Intent intent = new Intent(MediaStore.ACTION_VIDEO_CAPTURE);
                //start the video capture Intent
                startActivityForResult(intent, CAPTURE_VIDEO_ACTIVITY_REQUEST_CODE);
            }
        });
    }

    public void onActivityResult(int request,int result,Intent data) {

        super.onActivityResult(request, result, data);
        if(request==CAPTURE_VIDEO_ACTIVITY_REQUEST_CODE){
            if(result==RESULT_OK){
                VideoView videoView=(VideoView)findViewById(R.id.videoView);
                //get video uri
                Uri videoUri=data.getData();
                //set the video uri to VideoView
                videoView.setVideoURI(videoUri);
                //set media controller allowing you to play, pause, and move the
                //video forward and backward
                videoView.setMediaController(new MediaController(this));
                //play the video
                videoView.start();
            }
        }
    }
}