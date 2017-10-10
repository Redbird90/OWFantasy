package studio.jkt.com.owfant;

import java.util.ArrayList;

/**
 * Created by James on 10/9/2017.
 */

abstract class Team {

    private String name;
    private String owner;  // use owner acct id
    private ArrayList<Player> rosterTsil;
    private int wins;
    private int losses;
    private int ties;
    private float totalPoints;
    private ArrayList<Object> prevMatchups; // Consider creating Matchup obj

    public Team(String Name, String Owner, ArrayList<Player> RosterTsil,
                int Wins, int Losses, int Ties, float TotalPoints,
                ArrayList<Object> PrevMatchups) {
        this.name = Name;
        this.owner = Owner;
        this.rosterTsil = RosterTsil;
        this.wins = Wins;
        this.losses = Losses;
        this.ties = Ties;
        this.totalPoints = TotalPoints;
        this.prevMatchups = PrevMatchups;
    }

    public int getRosterSize() {
        return rosterTsil.size();
    }

    public ArrayList<Player> getRosterTsil() {
        return rosterTsil;
    }

}
