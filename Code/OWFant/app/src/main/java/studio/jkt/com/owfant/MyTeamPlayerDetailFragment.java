package studio.jkt.com.owfant;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by James on 10/12/2017.
 */

public class MyTeamPlayerDetailFragment extends Fragment implements MyTeamContract.PlayerDetailView {

    private String LOG_TAG = "MTPlayerDetailFragment";

    protected MyTeamContract.PlayerDetailPresenter myTeamPDPresenter;
    protected TextView myTeamPlayerNameTV;
    protected TextView myTeamPlayerTotalPointsTV;

    public static MyTeamPlayerDetailFragment newInstance() {
        return new MyTeamPlayerDetailFragment();
    }

    public MyTeamPlayerDetailFragment() {
        // All subclasses of Fragment must include a public no-argument constructor
    }

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        Log.i(LOG_TAG, "onCreateView inflating view");
        View rootView = inflater.inflate(R.layout.myteam_playerview, container, false);
        myTeamPlayerNameTV = (TextView) rootView.findViewById(R.id.myteam_player_name_tv);
        myTeamPlayerTotalPointsTV = (TextView) rootView.findViewById(R.id.myteam_player_points_tv);
        return rootView;

    }

    @Override
    public void setPresenter(@NonNull MyTeamContract.PlayerDetailPresenter presenter) {

        myTeamPDPresenter = presenter;

    }

    @Override
    public void setPlayerName(String playerName) {

        myTeamPlayerNameTV.setText(playerName);

    }

    @Override
    public void setPlayerTotalPoints(String points) {

        myTeamPlayerTotalPointsTV.setText(points);

    }

    @Override
    public boolean isActive() {
        return isAdded();
    }

}
