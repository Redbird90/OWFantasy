package studio.jkt.com.owfant;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

class FantasyFragmentPagerAdapter extends FragmentPagerAdapter {

    FantasyFragmentPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            Fragment currTeamFragment = new MyTeamFragment();
            return currTeamFragment;
        } else {
            return null;
        }
    }

    @Override
    public int getCount() {
        return 4;
    }
}
