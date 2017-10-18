package studio.jkt.com.owfant;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.LinearLayout;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private String LOG_TAG = "MainAct";

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
    private ArrayList<MyTeamPlayerDetailFragment> mMyTeamPDFragmentTsil;

    private int myTeamPlayerCount = 6; // Change to read from online data // later
    enum LeagueTypes{REGULAR, OVERWATCH}


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /*mFantFragmentPagerAdapter =
                new FantasyFragmentPagerAdapter(getSupportFragmentManager());
        mViewPager = (ViewPager) findViewById(R.id.pager);
        mViewPager.setAdapter(mFantFragmentPagerAdapter);*/

        LeagueTypes currLeagueType = LeagueTypes.OVERWATCH;

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

        mMyTeamPDFragmentTsil = new ArrayList<>();
        mMyTeamPDPresenterTsil = new ArrayList<>();

        // Start adding Player Detail views
        Log.i(LOG_TAG, "Adding Player Detail Views");
        for (int i=0; i < myTeamPlayerCount; i++) {
            // Check current league to instantiate correct views and presenters
            // Check container for fragment to be added, add fragment obj to ArrayList
            // If fragment null, layout was not inflated so reconstruct view
            // Add fragment to container through FragmentTransaction
            // Construct new presenter and link to relevant view, add to ArrayList

            if (currLeagueType == LeagueTypes.OVERWATCH) {
                MyTeamOWPlayerDetailFragment currMyTeamOWPDFrag = (MyTeamOWPlayerDetailFragment) suppFragmentManager.findFragmentById(R.id.contentFrame);
                mMyTeamPDFragmentTsil.add(i, currMyTeamOWPDFrag);

                if (mMyTeamPDFragmentTsil.get(i) == null) {
                    currMyTeamOWPDFrag = MyTeamOWPlayerDetailFragment.newInstance();

                    FragmentTransaction transaction = suppFragmentManager.beginTransaction();
                    transaction.add(R.id.myteam_linlay, currMyTeamOWPDFrag);
                    transaction.commit();
                    Log.i(LOG_TAG, "OW PD transaction committed");
                }

                MyTeamOWPlayerDetailPresenter tempOWPDPresenter = new MyTeamOWPlayerDetailPresenter(getString(R.string.playername_default), getString(R.string.playerpoints_default), getString(R.string.playerheroid_default), getString(R.string.playerroleid_default), getString(R.string.playerteam_default), getString(R.string.playernatlid_default), currMyTeamOWPDFrag) {
                };
                mMyTeamPDPresenterTsil.add(i, tempOWPDPresenter);

                Log.i(LOG_TAG, "FragmentTsil size is " + String.valueOf(mMyTeamPDFragmentTsil.size()));
                Log.i(LOG_TAG, "PresenterTsil size is " + String.valueOf(mMyTeamPDPresenterTsil.size()));

            } else if (currLeagueType == LeagueTypes.REGULAR) {
                MyTeamPlayerDetailFragment currMyTeamPDFrag = (MyTeamPlayerDetailFragment) suppFragmentManager.findFragmentById(R.id.contentFrame);
                mMyTeamPDFragmentTsil.add(i, currMyTeamPDFrag);

                if (mMyTeamPDFragmentTsil.get(i) == null) {
                    currMyTeamPDFrag = MyTeamPlayerDetailFragment.newInstance();

                    FragmentTransaction transaction = suppFragmentManager.beginTransaction();
                    transaction.add(R.id.myteam_linlay, currMyTeamPDFrag);
                    transaction.commit();
                }

                MyTeamPlayerDetailPresenter tempPDPresenter = new MyTeamPlayerDetailPresenter(getString(R.string.playername_default), getString(R.string.playerpoints_default), currMyTeamPDFrag) {
                };
                mMyTeamPDPresenterTsil.add(i, tempPDPresenter);

            }
        }

    }

}

