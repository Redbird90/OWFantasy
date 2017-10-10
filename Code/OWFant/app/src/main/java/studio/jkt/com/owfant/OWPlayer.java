package studio.jkt.com.owfant;

/**
 * Created by James on 10/8/2017.
 */

abstract class OWPlayer extends Player {

    //private Team Team;
    private String position;
    private String nationality;

    public OWPlayer(String Name, String Id, int Age, String Position, String Nationality) {
        super(Name, Id, Age);
        this.position = Position;
        this.nationality = Nationality;
    }
}
