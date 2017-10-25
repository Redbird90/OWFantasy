package studio.jkt.com.owfant;

import android.support.annotation.NonNull;

/**
 * Created by James on 10/25/2017.
 */

public abstract class VSOWPlayerDetailPresenter extends VSPlayerDetailPresenter implements VSContract.PlayerDetailPresenter {

    private final VSContract.OWPlayerDetailView mOWPlayerDetailView;

    private String mRoleId;
    private String mPlayerTeam;

    public VSOWPlayerDetailPresenter(String playerName, String playerTotalPts, String roleId, String playerTeam, @NonNull VSContract.OWPlayerDetailView playerDetailView) {

        super(playerName, playerTotalPts, playerDetailView);

        mOWPlayerDetailView = (VSContract.OWPlayerDetailView) mPlayerDetailView;

        mRoleId = roleId;
        mPlayerTeam = playerTeam;

    }

    @Override
    public void start() {
        if (mOWPlayerDetailView.isActive()) {
            mOWPlayerDetailView.setPlayerName(mPlayerName);
            mOWPlayerDetailView.setPlayerTotalPoints(mPlayerTotalPts);
            //mOWPlayerDetailView.setPlayerRolePicture(someDrawable);
            mOWPlayerDetailView.setPlayerTeamName(mPlayerTeam);
        }
    }

    @Override
    public void editPlayer() {
        // Open pop up window to handle move / view details
    }

}
