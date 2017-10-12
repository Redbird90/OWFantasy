package studio.jkt.com.owfant;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by James on 10/11/2017.
 */

public class MyTeamFragment extends Fragment {

    public static final String ARG_PLAYERNUM = "playernumber";

    @Override
    public View onCreateView(LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.myteam_fragment_layout, container, false);
        // Get number of players in team to inflate as well as all team and player info
        Bundle args = getArguments();
        numOfPlayers = args.getInt()

    }
}
