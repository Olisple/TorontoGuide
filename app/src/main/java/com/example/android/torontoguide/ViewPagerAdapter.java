package com.example.android.torontoguide;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by Olisp on 1/8/2017.
 */

public class ViewPagerAdapter extends FragmentPagerAdapter {

    public ViewPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return new AttractionsFragment();
            case 1:
                return new DiningFragment();
            case 2:
                return new NightlifeFragment();
            default:
                return new RecreationalFragment();
        }
    }

    @Override
    public int getCount() {
        return 4;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        switch (position) {
            case 0:
                return "Attractions";
            case 1:
                return "Dining";
            case 2:
                return "Nightlife";
            default:
                return "Recreational";
        }
    }

}
