package arraysTask;

import java.util.ArrayList;

public class Company {
    private String companyName;
    private ArrayList<Person> persons = list();

    public ArrayList list(){
        ArrayList<Person> personArrayList = new ArrayList<Person>();
        personArrayList.add(new Person("Ievgen", "Obodianskyi", 33));
        personArrayList.add(new Person("andrey", "dorokhin", 36));
        personArrayList.add(new Person("septimius", "severus", 1800));
        return personArrayList;
    }

    public void employeeName(String firstName){
        for (Person person : persons){
            if (person.getFirstName().equalsIgnoreCase(firstName)) {
                System.out.println("There is employee with name: " + firstName);
                break;
            }
            System.out.println("There is NOT employee with such name");
        }
    }

    public void employeeLastName(String lastName){
        for (Person person : persons){
            if (person.getLastName().equalsIgnoreCase(lastName)) {
                System.out.println("There is employee with last name: " + lastName);
                break;
            }
            System.out.println("There is NOT employee with such surname");
        }
    }

}






