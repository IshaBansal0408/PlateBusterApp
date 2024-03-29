package com.example.platebuster;

import android.content.Context;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class InputAdapter extends FragmentPagerAdapter {

    private Context context;
    int totalTabs;

    public InputAdapter(FragmentManager fm, Context context, int totalTabs){
        super(fm);
        this.context=context;
        this.totalTabs=totalTabs;
    }

    @Override
    public int getCount() {
        return totalTabs;
    }

    public Fragment getItem(int position){
        switch (position){
            case 0:
                input_tab_fragment input_tab_fragment = new input_tab_fragment();
                return input_tab_fragment;
            default:
                return null;
        }
    }

}
