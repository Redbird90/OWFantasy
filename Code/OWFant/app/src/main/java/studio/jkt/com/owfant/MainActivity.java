package studio.jkt.com.owfant;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.TabHost;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ViewPager mViewPager;
    private FantasyFragmentPagerAdapter mFantFragmentPagerAdapter;
    private LinearLayout myTeamLinLay;
    private LinearLayout vsLinLay;
    private LinearLayout availablePlayersLinLay;
    private LinearLayout myLeagueLinLay;
    private Owner userOwner;
    private Team userCurrTeam;
    private ArrayList<Player> userPlayerTsil;

    private MyTeamOverallPresenter mMyTeamOvPresenter;
    private ArrayList<MyTeamPlayerDetailPresenter> mMyTeamPDPresenterTsil;

    private int myTeamPlayerCount = 6; // Change to read from online data later


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mFantFragmentPagerAdapter =
                new FantasyFragmentPagerAdapter(getSupportFragmentManager());
        mViewPager = (ViewPager) findViewById(R.id.pager);
        mViewPager.setAdapter(mFantFragmentPagerAdapter);

        FragmentManager suppFragmentManager = getSupportFragmentManager();
        MyTeamFragment mMyTeamFragment = (MyTeamFragment)
                suppFragmentManager.findFragmentById(R.id.contentFrame);

        if (mMyTeamFragment == null) {
            mMyTeamFragment = mMyTeamFragment.newInstance();

            FragmentTransaction transaction = suppFragmentManager.beginTransaction();
            transaction.add(R.id.contentFrame, mMyTeamFragment);
            transaction.commit();
        }

        mMyTeamOvPresenter = new MyTeamOverallPresenter(getString(R.string.myteamname_default),
                getString(R.string.myteamrecord_default), mMyTeamFragment) {};

        mMyTeamPDPresenterTsil = new ArrayList<MyTeamPlayerDetailPresenter>();
        for (int i=0; i < myTeamPlayerCount; i++) {
            MyTeamPlayerDetailPresenter tempPDPresenter = new MyTeamPlayerDetailPresenter(getString(R.string.playername_default), getString(R.string.playerpoints_default)) {};
        }


    }

    public void loadMyTeamViewInUI(Team myTeamObj) {

        ArrayList<Player> roster = myTeamObj.getRosterTsil();
        for (int i = 0; i < myTeamObj.getRosterSize(); i++) {
            //LinearLayout currPlayerDetailView = new LinearLayout(this, )
        }
    }
}

