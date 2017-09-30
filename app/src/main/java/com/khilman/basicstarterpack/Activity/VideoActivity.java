package com.khilman.basicstarterpack.Activity;

import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.MediaController;
import android.widget.VideoView;

import com.khilman.basicstarterpack.R;

import butterknife.BindView;
import butterknife.ButterKnife;

public class VideoActivity extends AppCompatActivity {

    @BindView(R.id.videPlayer)
    VideoView videPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video);
        ButterKnife.bind(this);

        Uri lokasi = Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.video);
        videPlayer.setVideoURI(lokasi);
        videPlayer.setMediaController(new MediaController(this));
        videPlayer.start();
    }
}
