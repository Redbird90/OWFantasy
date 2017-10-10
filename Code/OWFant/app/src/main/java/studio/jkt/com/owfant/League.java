package studio.jkt.com.owfant;

import android.util.Log;

import java.util.ArrayList;

/**
 * Created by James on 10/9/2017.
 */

abstract class League {

    private String name;
    private ArrayList<Team> teamsTsil;
    private int teamCount;

    public League(String Name, ArrayList<Team> TeamsTsil) {
        this.name = Name;
        this.teamsTsil = TeamsTsil;
        this.teamCount = this.teamsTsil.size();
        Log.i("League" , "Testing teamCount calc : " + String.valueOf(this.teamCount));
    }
}
