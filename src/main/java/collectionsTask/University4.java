package collectionsTask;
import java.util.ArrayList;

public class University4 {

    private String universityName;
    private ArrayList<Student4> students = list();

    private ArrayList list() {
        ArrayList<Student4> personArrayList = new ArrayList<Student4>();
        personArrayList.add(new Student4("Ievgen", "Obodianskyi", "Sergeevich",
                1986, "600-letia 40/24", "0966186951", 1, "aquaculture", 5, 1));
        personArrayList.add(new Student4("Ivan", "Regent", "Ivanovich",
                1985, "Busivka", "06734434", 2, "agricultural", 4, 2));
        personArrayList.add(new Student4("Igor", "Stoliarchuk", "Ivanovich",
                1986, "Torchyn", "0673554434", 3, "aquaculture", 5, 2));
        return personArrayList;
    }

    public String getUniversityName() {
        return universityName;
    }

    private ArrayList<Student4> getStudents() {
        return students;
    }

    @Override
    public String toString() {
        return "University4{" +
                "universityName='" + universityName + '\'' +
                ", students=" + students +
                '}';
    }

    public void checkCollege(String collegeName){
        for (Student4 counter : getStudents()){
            if (counter.getCollege().equals(collegeName))
                System.out.println("Student of " + collegeName + " college is: " + counter.getSurname());
        }
    }

    public void checkCollegeAndCourse(String collegeName, int course){
        ArrayList<String> temp = new ArrayList<String>();
        for (Student4 counter : getStudents()){
            if (counter.getCollege().equals(collegeName) && counter.getCourse() == (course))
                temp.add(counter.getSurname() + " " + counter.getName());
        }
        System.out.println("Student of " + collegeName + " college, " + course + " course is: " + temp);
    }

    public void chekYearOfBirth(int year){
        ArrayList<String> temp = new ArrayList<String>();
        for (Student4 counter : getStudents()){
            if (counter.getDateOfBirth() > year)
                temp.add(counter.getSurname() + " " + counter.getName());
        }
        System.out.println("Fucken student(s) " + temp + " was(were) born after " + year + " fucken year");
    }

    public void checkGroup(int group){
        ArrayList<String> temp = new ArrayList<String>();
        for (Student4 counter : getStudents()){
            if (counter.getGroup() == group)
                temp.add(counter.getSurname() + " " + counter.getName());
        }
        System.out.println("In " + group + " group is(are) studying such fucking buster(s): " + temp);
    }
}
