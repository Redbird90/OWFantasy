package studio.jkt.com.owfant;

import android.support.v4.app.Fragment;

/**
 * Created by James on 10/12/2017.
 */

public class MyTeamPlayerDetailFragment extends Fragment implements MyTeamContract.PlayerDetailView {

    private MyTeamContract.PlayerDetailPresenter myTeamPDPresenter;
    private TextView
    @Override
    public void setPresenter(MyTeamContract.PlayerDetailPresenter presenter) {

    }

    @Override
    public void setPlayerName(String playerName) {

    }

    @Override
    public void setPlayerTotalPoints(String points) {

    }

    @Override
    public boolean isActive() {
        return false;
    }
}
