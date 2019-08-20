package comparatorTaskBiloleg;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

public class SetOperations {

    public void setComparator() {

        Comparator<Persons> compare = new CompareNames().thenComparing(new CompareAge().reversed());

        TreeSet<Persons> people = new TreeSet<>(compare);
        people.add(new Persons("Andrey", 36));
        people.add(new Persons("Andrey", 35));
        people.add(new Persons("Artiom", 42));
        people.add(new Persons("Dima", 18));
        people.add(new Persons("Ievgen", 33));
        people.add(new Persons("Yulia", 28));
        people.add(new Persons("Kolia", 25));
        people.add(new Persons("Andrey", 39));
        people.add(new Persons("Andrey", 42));
        people.add(new Persons("Artiom", 36));
        people.add(new Persons("Artiom", 35));
        people.add(new Persons("Artiom", 39));
        people.add(new Persons("Ievgen", 33));
        people.add(new Persons("Ivan", 44));
        people.add(new Persons("Dima", 27));
        people.add(new Persons("Kolia", 45));
        people.add(new Persons("Yulia", 30));
        people.add(new Persons("Yulia", 18));

        Iterator<Persons> itr = people.iterator();
        while (itr.hasNext())
            System.out.println(itr.next());

        //        for (Persons person : people) System.out.println(person);
    }
}
