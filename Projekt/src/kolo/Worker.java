package kolo;

/**
 * Created by rpi on 13.10.2016.
 */
public class Worker extends Person {

    private long earns;

    public Worker(String firstName, String lastName, int age, long earns) {
        super(firstName, lastName, age);
        this.earns = earns;
    }

    public long getEarns() {
        return earns;
    }

    public void setEarns(long earns) {
        this.earns = earns;
    }
}
