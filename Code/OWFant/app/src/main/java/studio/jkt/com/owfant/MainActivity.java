package studio.jkt.com.owfant;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.TabHost;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    TabHost mainTabHost;
    ViewPager mViewPager;
    FantasyFragmentPagerAdapter mFantFragmentPagerAdapter;
    LinearLayout myTeamLinLay;
    LinearLayout vsLinLay;
    LinearLayout availablePlayersLinLay;
    LinearLayout myLeagueLinLay;
    Owner userOwner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mFantFragmentPagerAdapter =
                new FantasyFragmentPagerAdapter(getSupportFragmentManager());
        mViewPager = (ViewPager) findViewById(R.id.pager);
        mViewPager.setAdapter(mFantFragmentPagerAdapter);


    }

    public void loadMyTeamViewInUI(Team myTeamObj) {

        ArrayList<Player> roster = myTeamObj.getRosterTsil();
        for (int i = 0; i < myTeamObj.getRosterSize(); i++) {
            LinearLayout currPlayerDetailView = new LinearLayout(this, )
        }
    }
}

