package studio.jkt.com.owfant;

/**
 * Created by James on 10/8/2017.
 */
abstract class Player {

    private String name;
    private String id;
    private int age;

    public Player(String Name, String Id, int Age) {
        this.name = Name;
        this.id = Id;
        this.age = Age;
    }
}
