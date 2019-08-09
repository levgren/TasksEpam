package collectionsPlusEnumsTask;
import java.util.ArrayList;

public class University4 {

    private StudentsArray studentsArray = new StudentsArray();
    private String universityName;
    private ArrayList students = studentsArray.list();


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

    public void checkCollege(Colleges collegeName){
        for (Student4 counter : getStudents()){
            if (counter.getCollege().equals(collegeName))
                System.out.println("Student of " + collegeName + " college is: " + counter.getSurname());
        }
    }

    public void checkCollegeAndCourse(Colleges collegeName, Courses course){
        ArrayList<String> temp = new ArrayList<String>();
        for (Student4 counter : getStudents()){
            if (counter.getCollege().equals(collegeName) && counter.getCourse().equals (course))
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

    public void checkGroup(Groups group){
        ArrayList<String> temp = new ArrayList<String>();
        for (Student4 counter : getStudents()){
            if (counter.getGroup().equals(group))
                temp.add(counter.getSurname() + " " + counter.getName());
        }
        System.out.println("In " + group + " group is(are) studying such fucking buster(s): " + temp);
    }
}
