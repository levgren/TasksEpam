package comparatorTaskBiloleg;

import java.util.Comparator;

public class CompareNames implements Comparator<Persons> {

    public int compare(Persons p1, Persons p2){
        return p1.getName().compareTo(p2.getName());
    }
}
