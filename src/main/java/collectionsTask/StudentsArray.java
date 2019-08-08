package collectionsTask;

import java.util.ArrayList;

public class StudentsArray {
    ArrayList list() {
        ArrayList<Student4> personArrayList = new ArrayList<Student4>();
        personArrayList.add(new Student4("Ievgen", "Obodianskyi", "Sergeevich",
                1986, "600-letia 40/24", "0966186951", 1, "aquaculture", 5, 1));
        personArrayList.add(new Student4("Ivan", "Regent", "Ivanovich",
                1985, "Busivka", "06734434", 2, "agricultural", 4, 2));
        personArrayList.add(new Student4("Igor", "Stoliarchuk", "Ivanovich",
                1986, "Torchyn", "0673554434", 3, "aquaculture", 5, 2));
        return personArrayList;
    }

}
