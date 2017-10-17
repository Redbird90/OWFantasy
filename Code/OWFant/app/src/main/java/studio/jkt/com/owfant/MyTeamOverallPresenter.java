package studio.jkt.com.owfant;

import android.support.annotation.NonNull;

/**
 * Created by James on 10/12/2017.
 */

public abstract class MyTeamOverallPresenter implements MyTeamContract.OverallPresenter {

    @NonNull
    private final MyTeamContract.OverallView mOverallView;

    private String mTeamName;

    private String mTeamRecord;

    public MyTeamOverallPresenter(String teamName, String teamRecord, @NonNull MyTeamContract.OverallView overallView) {
        mTeamName = teamName;
        mTeamRecord = teamRecord;
        mOverallView = overallView;

        mOverallView.setPresenter(this);
    }

    public void start() {
        if (mOverallView.isActive()) {
            mOverallView.setTeamName(mTeamName);
            mOverallView.setTeamRecord(mTeamRecord);
        }
    }

    public void changeName() {
        // Open pop up window to accept new String entry
    }

}
