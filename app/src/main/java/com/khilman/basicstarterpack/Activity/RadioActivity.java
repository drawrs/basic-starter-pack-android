package com.khilman.basicstarterpack.Activity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.khilman.basicstarterpack.R;
import com.wang.avi.AVLoadingIndicatorView;

import java.io.IOException;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class RadioActivity extends AppCompatActivity {

    @BindView(R.id.btnPlay)
    Button btnPlay;
    @BindView(R.id.btnStop)
    Button btnStop;

    // deklarasi kelas nya
    MediaPlayer radio;
    @BindView(R.id.loader)
    AVLoadingIndicatorView loader;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_radio);
        ButterKnife.bind(this);
        // inisialisasi media player
        // disable button stop
        btnStop.setEnabled(false);

        // siapkan progress bar


    }

    @OnClick(R.id.btnPlay)
    public void onBtnPlayClicked() {
        radio = new MediaPlayer();
        try {
            radio.setDataSource("http://103.16.198.36:9160/stream");
            radio.prepareAsync();
            radio.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
                @Override
                public void onPrepared(MediaPlayer mediaPlayer) {
                    radio.start();
                    // disable btn play
                    btnPlay.setEnabled(false);
                    btnStop.setEnabled(true);
                    // buat loader terlihat
                    loader.setVisibility(View.VISIBLE);
                }
            });
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    @OnClick(R.id.btnStop)
    public void onBtnStopClicked() {
        radio.stop();
        btnPlay.setEnabled(true);
        btnStop.setEnabled(false);
        loader.setVisibility(View.INVISIBLE);
    }
}
