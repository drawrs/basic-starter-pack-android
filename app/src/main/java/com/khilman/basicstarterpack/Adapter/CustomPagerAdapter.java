package com.khilman.basicstarterpack.Adapter;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.khilman.basicstarterpack.R;

/**
 * Created by root on 9/28/17.
 */

public class CustomPagerAdapter extends PagerAdapter {
    // global variable
    Context context;
    String[] namabuah;
    int[] gambarbuah;

    public CustomPagerAdapter(Context context, String[] namabuah, int[] gambarbuah) {
        this.namabuah = namabuah;
        this.context = context;
        this.gambarbuah = gambarbuah;
    }

    @Override
    public int getCount() {
        return namabuah.length;
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {

        return view == ((LinearLayout)object);
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view = inflater.inflate(R.layout.pager_item, null);
        // kenalkan widget yg ada di layout
        ImageView imgBuah = (ImageView) view.findViewById(R.id.imgBuah);
        TextView txtBuah = (TextView) view.findViewById(R.id.txtBuah);

        txtBuah.setText(namabuah[position]);
        imgBuah.setImageResource(gambarbuah[position]);
        // tambahan
        ((ViewPager)container).addView(view);
        return view;

    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        ((ViewPager)container).removeView((LinearLayout)object);
    }
}
