package collectionsPlusEnumsTask;

public class Student4 extends Person4 {

    private int id;
    private Colleges college;
    private Courses course;
    private Groups group;

    public Student4(String name, String surname, String fathername, int yearOfBirth, String address, String phone,
                    int id, Colleges college, Courses course, Groups group) {
        super(name, surname, fathername, yearOfBirth, address, phone);
        this.id = id;
        this.college = college;
        this.course = course;
        this.group = group;
    }

    public int getId() { return id; }

    public void setId(int id) { this.id = id; }

    public Colleges getCollege() { return college; }

    public void setCollege(Colleges college) { this.college = college; }

    public Courses getCourse() { return course; }

    public void setCourse(Courses course) { this.course = course; }

    public Groups getGroup() { return group; }

    public void setGroup(Groups group) {
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
