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
 * Created by James on 10/24/2017.
 */

public class VSPlayerDetailFragment extends Fragment implements VSContract.PlayerDetailView {

    private String LOG_TAG = "VSPlayerDetailFragment";

    protected VSContract.PlayerDetailPresenter vsPDPresenter;
    protected TextView vsPlayerNameTV;
    protected TextView vsPlayerTotalPointsTV;

    public static VSPlayerDetailFragment newInstance() {
        return new VSPlayerDetailFragment();
    }

    public VSPlayerDetailFragment() {
        // All subclasses of Fragment must include a public no-argument constructor
    }

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        Log.i(LOG_TAG, "onCreateView inflating view");
        View rootView = inflater.inflate(R.layout.vs_playerview, container, false);
        vsPlayerNameTV = (TextView) rootView.findViewById(R.id.vs_player_name_tv);
        vsPlayerTotalPointsTV = (TextView) rootView.findViewById(R.id.vs_player_points_tv);
        return rootView;

    }

    @Override
    public void setPresenter(@NonNull VSContract.PlayerDetailPresenter presenter) {

        vsPDPresenter = presenter;

    }

    @Override
    public void setPlayerName(String name) {

        vsPlayerNameTV.setText(name);

    }

    @Override
    public void setPlayerTotalPoints(String points) {

        vsPlayerTotalPointsTV.setText(points);

    }

    @Override
    public boolean isActive() {
        return isAdded();
    }

}
