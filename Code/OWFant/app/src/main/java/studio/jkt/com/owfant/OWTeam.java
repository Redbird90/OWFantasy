package studio.jkt.com.owfant;

import java.util.ArrayList;

/**
 * Created by James on 10/9/2017.
 */

abstract class OWTeam extends Team {

    private int rosterCount = 6;

    public OWTeam(String Name, String Owner, ArrayList<Player> RosterTsil,
                  int Wins, int Losses, int Ties, float TotalPoints,
                  ArrayList<Object> PrevMatchups) {
        super(Name, Owner, RosterTsil, Wins, Losses, Ties, TotalPoints, PrevMatchups);
    }

}