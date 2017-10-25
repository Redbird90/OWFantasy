package studio.jkt.com.owfant;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by James on 10/24/2017.
 */

public class VSFragment extends Fragment implements VSContract.OverallView {

    public static final String ARG_PLAYERNUM = "playernumber";
    private VSContract.OverallPresenter vsOvPresenter;
    private TextView vsMyTeamTitleTV;
    private TextView vsMyTeamRecordTV;
    private TextView vsOtherTeamTitleTV;
    private TextView vsOtherTeamRecordTV;

    public static VSFragment newInstance() {
        return new VSFragment();
    }

    public VSFragment() {
        // All subclasses of Fragment must include a public no-argument constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.vs_overallview, container, false);
        vsMyTeamTitleTV = (TextView) rootView.findViewById(R.id.vs_myteam_title_tv);
        vsMyTeamRecordTV = (TextView) rootView.findViewById(R.id.vs_myteam_record_tv);
        vsOtherTeamTitleTV = (TextView) rootView.findViewById(R.id.vs_otherteam_title_tv);
        vsOtherTeamRecordTV = (TextView) rootView.findViewById(R.id.vs_otherteam_record_tv);
        return rootView;

    }

    @Override
    public void setPresenter(@NonNull VSContract.OverallPresenter presenter) {

        vsOvPresenter = presenter;

    }

    @Override
    public void setUserTeamName(String name) {

        vsMyTeamTitleTV.setText(name);

    }

    @Override
    public void setUserTeamRecord(String record) {

        vsMyTeamRecordTV.setText(record);

    }

    @Override
    public void setOtherTeamName(String name) {

        vsOtherTeamTitleTV.setText(name);

    }

    @Override
    public void setOtherTeamRecord(String record) {

        vsOtherTeamRecordTV.setText(record);

    }

    @Override
    public boolean isActive() {
        return isAdded();
    }

}
