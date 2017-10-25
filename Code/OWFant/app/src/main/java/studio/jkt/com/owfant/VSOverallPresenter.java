package studio.jkt.com.owfant;

import android.support.annotation.NonNull;

/**
 * Created by James on 10/24/2017.
 */

public abstract class VSOverallPresenter implements VSContract.OverallPresenter {

    @NonNull
    private final VSContract.OverallView mOverallView;

    private String mUserTeamName;
    private String mUserTeamRecord;
    private String mOtherTeamName;
    private String mOtherTeamRecord;

    public VSOverallPresenter(String userTeamName, String userTeamRecord, String otherTeamName, String otherTeamRecord, @NonNull VSContract.OverallView overallView) {
        mUserTeamName = userTeamName;
        mUserTeamRecord = userTeamRecord;
        mOtherTeamName = otherTeamName;
        mOtherTeamRecord = otherTeamRecord;

        mOverallView = overallView;
    }

    public void start() {
        if (mOverallView.isActive()) {
            mOverallView.setUserTeamName(mUserTeamName);
            mOverallView.setUserTeamRecord(mUserTeamRecord);
            mOverallView.setOtherTeamName(mOtherTeamName);
            mOverallView.setOtherTeamRecord(mOtherTeamRecord);
        }
    }

}
