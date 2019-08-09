package collectionsPlusEnumsTask;
import java.util.ArrayList;

public class StudentsArray {
    ArrayList list() {
        ArrayList<Student4> personArrayList = new ArrayList<Student4>();
        personArrayList.add(new Student4("Ievgen", "Obodianskyi", "Sergeevich",
                1986, "600-letia 40/24", "0966186951", 1, Colleges.WATERBIORESOURCES, Courses.LAST, Groups.SMARTS));
        personArrayList.add(new Student4("Ivan", "Regent", "Ivanovich",
                1985, "Busivka", "06734434", 2, Colleges.ZOOENGINEERING, Courses.FOURTH, Groups.MAZHORY));
        personArrayList.add(new Student4("Igor", "Stoliarchuk", "Ivanovich",
                1986, "Torchyn", "0673554434", 3, Colleges.AGRICULTURAL, Courses.FOURTH, Groups.BOTANY));
        personArrayList.add(new Student4("Serhiy", "Melnychenko", "Petrovich",
                1986, "Vyshgorod", "5453554434", 3, Colleges.MEKHANIZATION, Courses.FOURTH, Groups.DEBILOIDY));
        return personArrayList;
    }
}
