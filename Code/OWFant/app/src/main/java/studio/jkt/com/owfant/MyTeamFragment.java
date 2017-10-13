package studio.jkt.com.owfant;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.widget.TextView;

/**
 * Created by James on 10/11/2017.
 */

public class MyTeamFragment extends android.support.v4.app.Fragment implements
 MyTeamContract.OverallView {

    public static final String ARG_PLAYERNUM = "playernumber";
    private MyTeamContract.OverallPresenter myTeamOvPresenter;
    private TextView myTeamTitleTV;

    @Override
    public View onCreateView(LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.myteam_fragment_layout, container, false);
        myTeamTitleTV = (TextView) rootView.findViewById(R.id.myteam_title_tv);
        // Get number of players in team to inflate as well as all team and player info
        //Bundle args = getArguments();
        //numOfPlayers = args.getInt()
        return rootView;

    }

    @Override
    public void setPresenter(@NonNull MyTeamContract.OverallPresenter presenter) {

        myTeamOvPresenter = presenter;
    }

    @Override
    public void setTeamName(String name) {

        myTeamTitleTV.setText(name);

    }

    @Override
    public void setTeamRecord(String record) {

    }
}
