package studio.jkt.com.owfant;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.TabHost;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    TabHost mainTabHost;
    LinearLayout myTeamLinLay;
    LinearLayout vsLinLay;
    LinearLayout availablePlayersLinLay;
    LinearLayout myLeagueLinLay;
    Owner userOwner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mainTabHost = (TabHost) findViewById(R.id.mainTabHostLay);
        myTeamLinLay = (LinearLayout) mainTabHost.findViewById(R.id.myteam_tab);

    }

    public void loadMyTeamViewInUI(Team myTeamObj) {

        ArrayList<Player> roster = myTeamObj.getRosterTsil();
        for (int i = 0; i < myTeamObj.getRosterSize(); i++) {
            LinearLayout currPlayerDetailView = new LinearLayout(this, )
        }
    }
}
