package arraysTask;

public class Main {
private static Company company = new Company();

    public static void main(String[] args) {
        System.out.println("Number of employees = " + company.list().size());
        company.employeeName("Ievgen");
        company.employeeLastName("Obodianskyi");
    }
}
