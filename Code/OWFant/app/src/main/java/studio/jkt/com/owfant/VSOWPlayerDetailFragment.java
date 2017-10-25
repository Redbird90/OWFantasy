package studio.jkt.com.owfant;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by James on 10/25/2017.
 */

public class VSOWPlayerDetailFragment extends VSPlayerDetailFragment implements VSContract.PlayerDetailView, VSContract.OWPlayerDetailView {

    private String LOG_TAG = "VSOWPDFragment";

    private ImageView vsOWPlayerRoleIV;
    private TextView vsOWPlayerTeamTV;

    public static VSOWPlayerDetailFragment newInstance() {
        return new VSOWPlayerDetailFragment();
    }

    public VSOWPlayerDetailFragment() {
        // All subclasses of Fragment must include a public no-argument constructor
    }

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        Log.i(LOG_TAG, "onCreateView inflating view");
        View rootView = inflater.inflate(R.layout.vs_owplayerview, container, false);
        vsPlayerNameTV = (TextView) rootView.findViewById(R.id.vs_owplayer_name_tv);
        vsOWPlayerRoleIV = (ImageView) rootView.findViewById(R.id.vs_owplayer_role_imgview);
        vsPlayerTotalPointsTV = (TextView) rootView.findViewById(R.id.vs_owplayer_points_tv);
        vsOWPlayerTeamTV = (TextView) rootView.findViewById(R.id.vs_owplayer_team_tv);

        return rootView;

    }

    @Override
    public void setPlayerRolePicture(Drawable rolePicture) {

        vsOWPlayerRoleIV.setImageDrawable(rolePicture);

    }

    @Override
    public void setPlayerTeamName(String teamName) {

        vsOWPlayerTeamTV.setText(teamName);

    }
}
