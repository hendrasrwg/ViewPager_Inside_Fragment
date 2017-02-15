package com.example.me.viewpagerinsidefragment;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

/**
 * Created by Me on 2/15/2017.
 */

public class PagerAdapter extends FragmentStatePagerAdapter {

    int positionTab;

    public PagerAdapter(FragmentManager fm, int positionTab) {
        super(fm);
        this.positionTab = positionTab;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                Tab1 tab1 = new Tab1();
                return tab1;
            case 1:
                Tab2 tab2 = new Tab2();
                return tab2;
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return positionTab;
    }
}
