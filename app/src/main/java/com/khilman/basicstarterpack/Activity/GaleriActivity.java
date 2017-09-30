package com.khilman.basicstarterpack.Activity;

import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

import com.khilman.basicstarterpack.Adapter.CustomPagerAdapter;
import com.khilman.basicstarterpack.R;

import butterknife.BindView;
import butterknife.ButterKnife;

public class GaleriActivity extends AppCompatActivity {
    String namabuah[] = {"alpukat", "apel", "ceri", "durian", "jambu air", "mangis", "strawberry"};
    int gambarbuah[] = {R.drawable.alpukat1, R.drawable.apel1, R.drawable.ceri1, R.drawable.duriani, R.drawable.jambuairi, R.drawable.manggisi, R.drawable.strawberrya};
    @BindView(R.id.viewPager)
    ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_galeri);
        ButterKnife.bind(this);

        // Buat adapter untuk view pager
        CustomPagerAdapter adapter = new CustomPagerAdapter(this, namabuah, gambarbuah);
        viewPager.setAdapter(adapter);

    }
}
