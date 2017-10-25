package studio.jkt.com.owfant;

import android.support.annotation.NonNull;

/**
 * Created by James on 10/25/2017.
 */

public abstract class VSPlayerDetailPresenter implements VSContract.PlayerDetailPresenter {

    @NonNull
    protected final VSContract.PlayerDetailView mPlayerDetailView;

    protected String mPlayerName;
    protected String mPlayerTotalPts;

    public VSPlayerDetailPresenter(String playerName, String playerTotalPts, @NonNull VSContract.PlayerDetailView playerDetailView) {
        mPlayerName = playerName;
        mPlayerTotalPts = playerTotalPts;
        mPlayerDetailView = playerDetailView;

        mPlayerDetailView.setPresenter(this);
    }

    public void start() {
        if (mPlayerDetailView.isActive()) {
            mPlayerDetailView.setPlayerName(mPlayerName);
            mPlayerDetailView.setPlayerTotalPoints(mPlayerTotalPts);
        }
    }

    public void editPlayer() {
        // Open pop up window to handle move/view details
    }

}
