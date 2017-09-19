package com.khilman.myvideoplayer;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity {

    VideoView video;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        video = (VideoView) findViewById(R.id.video);
        //siapkan lokasi filenya
        Uri lokasi_video = Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.video);
        video.setVideoURI(lokasi_video); // set lokasi video
        video.setMediaController(new MediaController(this)); // atur controler player
        video.start(); // jalankan video
    }
}
