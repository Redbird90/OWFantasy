package studio.jkt.com.owfant;

import android.support.annotation.NonNull;

/**
 * Created by James on 10/17/2017.
 */

public abstract class MyTeamOWPlayerDetailPresenter extends MyTeamPlayerDetailPresenter implements MyTeamContract.PlayerDetailPresenter {

    private final MyTeamContract.OWPlayerDetailView mOWPlayerDetailView;

    private String mHeroId;
    private String mRoleId;
    private String mPlayerTeam;
    private String mNationalityId;

    public MyTeamOWPlayerDetailPresenter(String playerName, String playerTotalPts, String heroId, String roleId, String playerTeam, String nationalityId, @NonNull MyTeamContract.OWPlayerDetailView playerDetailView) {

        super(playerName, playerTotalPts, playerDetailView);

        mOWPlayerDetailView = (MyTeamContract.OWPlayerDetailView) mPlayerDetailView;

        mHeroId = heroId;
        mRoleId = roleId;
        mPlayerTeam = playerTeam;
        mNationalityId = nationalityId;

    }

    @Override
    public void start() {
        if (mOWPlayerDetailView.isActive()) {
            mOWPlayerDetailView.setPlayerName(mPlayerName);
            mOWPlayerDetailView.setPlayerTotalPoints(mPlayerTotalPts);
            //mOWPlayerDetailView.setPlayerHeroPicture(someDrawable);
            //mOWPlayerDetailView.setPlayerRolePicture(someDrawable);
            mOWPlayerDetailView.setPlayerTeamName(mPlayerTeam);
            //mOWPlayerDetailView.setPlayerNationalityPicture(someDrawable);
        }
    }

    @Override
    public void editPlayer() {
        // Open pop up window to handle move
    }

}
