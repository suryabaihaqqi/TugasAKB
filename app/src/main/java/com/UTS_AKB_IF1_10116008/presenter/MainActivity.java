package com.UTS_AKB_IF1_10116008.presenter;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.UTS_AKB_IF1_10116008.R;
import com.UTS_AKB_IF1_10116008.adapter.SlideAdapter;

public class MainActivity extends AppCompatActivity {
    /**
     * NIM : 10116008
     * NAMA : Ahmad Surya Baihaqqi
     * KELAS : IF - 1 / AKB-1
     * TANGGAL PENGERJAAN : 16 MEI 2019
     */
    private ViewPager viewPager;
    private SlideAdapter myadapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        viewPager = (ViewPager) findViewById(R.id.viewpager);
        myadapter = new SlideAdapter(this);
        viewPager.setAdapter(myadapter);

    }
}
