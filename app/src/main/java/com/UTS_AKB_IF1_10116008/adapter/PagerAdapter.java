package com.UTS_AKB_IF1_10116008.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.UTS_AKB_IF1_10116008.fragment.Tab1;
import com.UTS_AKB_IF1_10116008.fragment.Tab2;
import com.UTS_AKB_IF1_10116008.fragment.Tab3;


public class PagerAdapter extends FragmentStatePagerAdapter {
    int mNoOfTabs;

    public PagerAdapter(FragmentManager fm, int NumberOfTabs)
    {
        super(fm);
        this.mNoOfTabs = NumberOfTabs;
    }


    @Override
    public Fragment getItem(int position) {

        /**
         * NIM : 10116008
         * NAMA : Ahmad Surya Baihaqqi
         * KELAS : IF - 1 / AKB-1
         * TANGGAL PENGERJAAN : 17 MEI 2019
         */

        switch(position)
        {

            case 0:
                Tab1 tab1 = new Tab1();
                return tab1;
            case 1:
                Tab2 tab2 = new Tab2();
                return  tab2;
            case 2:
                Tab3 tab3 = new Tab3();
                return  tab3;
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return mNoOfTabs;
    }

}
