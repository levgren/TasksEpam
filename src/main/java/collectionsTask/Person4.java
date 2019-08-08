package collectionsTask;

public class Person4 {

    private String name;
    private String surname;
    private String fathername;
    private int yearOfBirth;
    private String address;
    private String phone;

    public String getPhone() {
        return phone;
    }

    public Person4(String name, String surname, String fathername, int dateOfBirth, String address, String phone) {
        this.name = name;
        this.surname = surname;
        this.fathername = fathername;
        this.yearOfBirth = dateOfBirth;
        this.address = address;
        this.phone = phone;
    }

    public String getAddress() { return address; }

    public String getName() { return name; }

    public void setName(String name) { this.name = name; }

    public String getSurname() { return surname; }

    public void setSurname(String surname) { this.surname = surname; }

    public String getFathername() { return fathername; }

    public void setFathername(String fathername) { this.fathername = fathername; }

    public int getDateOfBirth() { return yearOfBirth; }

    public void setDateOfBirth(int dateOfBirth) { this.yearOfBirth = dateOfBirth; }

    public void setAddress(String address) { this.address = address; }

    public void setPhone(String phone) { this.phone = phone; }


    @Override
    public String toString() {
        return "Person4{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", fathername='" + fathername + '\'' +
                ", dateOfBirth='" + yearOfBirth + '\'' +
                ", address='" + address + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }

}
