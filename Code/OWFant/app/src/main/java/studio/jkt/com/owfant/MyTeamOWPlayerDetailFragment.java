package studio.jkt.com.owfant;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by James on 10/17/2017.
 */

public class MyTeamOWPlayerDetailFragment extends MyTeamPlayerDetailFragment implements MyTeamContract.PlayerDetailView, MyTeamContract.OWPlayerDetailView {

    private String LOG_TAG = "MTOWPDFragment";

    private ImageView myTeamOWPlayerHeroIV;
    private ImageView myTeamOWPlayerRoleIV;
    private TextView myTeamOWPlayerTeamTV;
    private ImageView myTeamOWPlayerNationalityIV;

    public static MyTeamOWPlayerDetailFragment newInstance() {
        return  new MyTeamOWPlayerDetailFragment();
    }

    public MyTeamOWPlayerDetailFragment() {
        // All subclasses of Fragment must include a public no-argument constructor
    }

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        Log.i(LOG_TAG, "onCreateView inflating view");
        View rootView = inflater.inflate(R.layout.myteam_owplayerview, container, false);
        myTeamOWPlayerHeroIV = (ImageView) rootView.findViewById(R.id.myteam_owplayer_hero_imgview);
        myTeamPlayerNameTV = (TextView) rootView.findViewById(R.id.myteam_owplayer_name_tv);
        myTeamOWPlayerRoleIV = (ImageView) rootView.findViewById(R.id.myteam_owplayer_role_imgview);
        myTeamPlayerTotalPointsTV = (TextView) rootView.findViewById(R.id.myteam_owplayer_points_tv);
        myTeamOWPlayerTeamTV = (TextView) rootView.findViewById(R.id.myteam_owplayer_team_tv);
        myTeamOWPlayerNationalityIV = (ImageView) rootView.findViewById(R.id.myteam_owplayer_natl_imgview);

        return rootView;

    }

    @Override
    public void setPlayerHeroPicture(Drawable heroPicture) {

        myTeamOWPlayerHeroIV.setImageDrawable(heroPicture);

    }

    @Override
    public void setPlayerRolePicture(Drawable rolePicture) {

        myTeamOWPlayerRoleIV.setImageDrawable(rolePicture);

    }

    @Override
    public void setPlayerTeamName(String teamName) {

        myTeamOWPlayerTeamTV.setText(teamName);

    }

    @Override
    public void setPlayerNationalityPicture(Drawable nationalityPicture) {

        myTeamOWPlayerNationalityIV.setImageDrawable(nationalityPicture);

    }
}
