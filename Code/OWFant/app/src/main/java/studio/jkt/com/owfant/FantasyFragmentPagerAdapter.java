package studio.jkt.com.owfant;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.app.FragmentStatePagerAdapter;
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
                Log.i(LOG_TAG, "returning myteamfrag");
                Fragment currTeamFragment = MyTeamFragment.newInstance();
                return currTeamFragment;
            case 1:
                Log.i(LOG_TAG, "returning vsfrag");
                Fragment currVsFragment = VSFragment.newInstance();
                return currVsFragment;
            case 2:
                return new Fragment();
            case 3:
                return new Fragment();
            default:
                return new Fragment();
        }
    }

    @Override
    public int getCount() {
        return numOfTabs;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        switch (position) {
            case 0:
                return "My Team";
            case 1:
                return "VS";
            case 2:
                return "Players";
            case 3:
                return "League";
            default:
                return "Def Tab";
        }
    }
}
