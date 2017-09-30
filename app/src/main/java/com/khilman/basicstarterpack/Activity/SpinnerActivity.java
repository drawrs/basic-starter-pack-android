package com.khilman.basicstarterpack.Activity;

import android.media.AudioManager;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;

import com.khilman.basicstarterpack.R;

import java.io.IOException;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class SpinnerActivity extends AppCompatActivity {
    String namabuah[] = {"alpukat", "apel", "ceri", "durian", "jambu air", "mangis", "strawberry"};
    int gambarbuah[] = {R.drawable.alpukat1, R.drawable.apel1, R.drawable.ceri1, R.drawable.duriani, R.drawable.jambuairi, R.drawable.manggisi, R.drawable.strawberrya};
    int suaraBuah[] = {R.raw.alpukat, R.raw.apel, R.raw.ceri, R.raw.durian, R.raw.jambuair, R.raw.manggis, R.raw.strawberry};
    @BindView(R.id.spinner)
    Spinner spinner;
    @BindView(R.id.txtbuah)
    TextView txtbuah;
    @BindView(R.id.gambar)
    ImageView gambar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spinnet);
        ButterKnife.bind(this);

        ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, namabuah);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        // set adapter ke spinner
        spinner.setAdapter(adapter);

        // event on selected
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int position, long l) {
                // aksi ketika salahsatu item di pilih
                txtbuah.setText(namabuah[position]);
                gambar.setImageResource(gambarbuah[position]);
                // putar audio
                putarAudio(position);
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
                // aksi ketika tidak ada yg dipilih
            }
        });

    }
    private void putarAudio(int position) {
        int suara_buah = suaraBuah[position];

        MediaPlayer mediaPlayer = new MediaPlayer();
        Uri lokasi_audio = Uri.parse("android.resource://" + getPackageName() + "/" + suara_buah);
        mediaPlayer.setAudioSessionId(AudioManager.STREAM_MUSIC);

        try {
            mediaPlayer.setDataSource(getApplicationContext(), lokasi_audio);
            mediaPlayer.prepare();
            mediaPlayer.start();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    @OnClick(R.id.gambar)
    public void onViewClicked() {
    }
}
