package studio.jkt.com.owfant;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.util.Log;

class FantasyFragmentPagerAdapter extends FragmentPagerAdapter {

    int numOfTabs = 4;
    private String LOG_TAG = "FantFragPagerAdapter";

    FantasyFragmentPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {

        Log.i(LOG_TAG, "tab position is " + String.valueOf(position));

        switch (position) {
            case 0:
                Fragment currTeamFragment = new MyTeamFragment();
                return currTeamFragment;
            case 1:
                Fragment currVsFragment = new VSFragment();
                return currVsFragment;
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return numOfTabs;
    }
}
