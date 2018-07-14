package com.example.android.visitkaunas;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.example.android.visitkaunas.fragments.ChurchesFragment;
import com.example.android.visitkaunas.fragments.ExtraPlacesFragment;
import com.example.android.visitkaunas.fragments.MuseumsFragment;
import com.example.android.visitkaunas.fragments.PubsFragment;

/**
 * {@link CustomFragmentPagerAdapter} is a {@link FragmentPagerAdapter} that can provide the layout for
 * each list item based on a data source which is a list of {@link } objects.
 */
public class CustomFragmentPagerAdapter extends FragmentPagerAdapter {

    private String tabFragmentTitles[] = new String[] {"Museums", "Churches", "Pubs", "Extra Places"};

    /**
     * Create a new {@link CustomFragmentPagerAdapter} object.
     *
     * @param fm      is the fragment manager that will keep each fragment's state in the adapter
     *                across swipes.
     */
    public CustomFragmentPagerAdapter(FragmentManager fm){
        super(fm);
    }

    @Override
    public int getCount() {
        return 4;
    }

    @Override
    public Fragment getItem(int position) {
        if (0 == position) {
            return new MuseumsFragment();
        }
            else if(1 == position){
                return new ChurchesFragment();
            }
            else if(2 == position) {
            return new PubsFragment();
        }
        else {
            return new ExtraPlacesFragment();
        }
        }

    @Override
    public CharSequence getPageTitle(int position) {
        return tabFragmentTitles[position];
    }
}

