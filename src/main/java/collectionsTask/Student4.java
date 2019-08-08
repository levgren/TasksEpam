package collectionsTask;
public class Student4 extends Person4 {

    private int id;
    private String college;
    private int course;
    private int group;

    public Student4(String name, String surname, String fathername, int yearOfBirth, String address, String phone,
                    int id, String college, int course, int group) {
        super(name, surname, fathername, yearOfBirth, address, phone);
        this.id = id;
        this.college = college;
        this.course = course;
        this.group = group;
    }

    public int getId() { return id; }

    public void setId(int id) { this.id = id; }

    public String getCollege() { return college; }

    public void setCollege(String college) { this.college = college; }

    public int getCourse() { return course; }

    public void setCourse(int course) { this.course = course; }

    public int getGroup() { return group; }

    public void setGroup(int group) {
        this.group = group;
    }

    @Override
    public String toString() {
        return "Student4{" +
                "id=" + id +
                ", college='" + college + '\'' +
                ", course='" + course + '\'' +
                ", group='" + group + '\'' +
                '}';
    }
}
