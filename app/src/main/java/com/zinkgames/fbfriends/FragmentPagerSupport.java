package com.zinkgames.fbfriends;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

/**
 * Created by sergey on 23.12.2015.
 */
public class FragmentPagerSupport extends FragmentStatePagerAdapter {
    int mNumOfTabs;

    public FragmentPagerSupport(FragmentManager fm, int NumOfTabs) {
        super(fm);
        this.mNumOfTabs = NumOfTabs;
    }

    @Override
    public Fragment getItem(int position) {

        switch (position) {
            case 0:
                TabFragmentMen tab1 = new TabFragmentMen();
                return tab1;
            case 1:
                TabFragmentWomen tab2 = new TabFragmentWomen();
                return tab2;
            case 2:
                TabFragmentKids tab3 = new TabFragmentKids();
                return tab3;
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return mNumOfTabs;
    }
}
