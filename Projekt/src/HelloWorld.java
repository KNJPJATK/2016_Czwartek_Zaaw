import kolo.Person;
import kolo.Student;
import kolo.Worker;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by rpi on 13.10.2016.
 */
public class HelloWorld {

    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();

        people.add(new Worker("Jan", "Kowalski", 5, 34000));
        people.add(new Student("Mikołaj", "Stefanowski", 5, "s55234"));

        System.out.println(people);
    }

}
