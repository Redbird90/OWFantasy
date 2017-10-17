package studio.jkt.com.owfant;

import android.support.annotation.NonNull;

/**
 * Created by James on 10/12/2017.
 */

public abstract class MyTeamPlayerDetailPresenter implements MyTeamContract.PlayerDetailPresenter {

    @NonNull
    private final MyTeamContract.PlayerDetailView mPlayerDetailView;

    private String mPlayerName;
    private String mPlayerTotalPts;

    public MyTeamPlayerDetailPresenter(String playerName, String playerTotalPts, @NonNull MyTeamContract.PlayerDetailView playerDetailView) {
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
        // Open pop up window to handle move
    }

}
