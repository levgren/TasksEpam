package comparatorTaskBiloleg;

import java.util.Comparator;

public class CompareAge implements Comparator<Persons> {

    public int compare(Persons p1, Persons p2){
        return Integer.compare(p1.getAge(), p2.getAge());
    }
}
