package comparatorTaskBiloleg;

import java.util.Comparator;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {

        Comparator<Persons> compare = new CompareNames().thenComparing(new CompareAge());

        TreeSet<Persons> people = new TreeSet<>(compare);
        people.add(new Persons("Andrey", 36));
        people.add(new Persons("Andrey", 39));
        people.add(new Persons("Ievgen", 33));
        people.add(new Persons("Ievgen", 33));
        people.add(new Persons("Dima", 18));
        people.add(new Persons("Kolia", 25));
        people.add(new Persons("Koli", 45));
        people.add(new Persons("Yulia", 30));
        people.add(new Persons("Yulia", 18));

        System.out.println(people);
    }
}
