package practice_1;

public class Company {

    static String companyName = "Caterpillar";
    final int employeeID;
    String employeeName;

    public Company(int employeeID, String employeeName) {
        this.employeeID = employeeID;
        this.employeeName = employeeName;
    }

    static void printCompanyName() {
        System.out.println(Company.companyName);
    }

    public String getEmployeeName() {
        return this.employeeName;
    }

    public void setEmployeeName(String name) {
        this.employeeName = name;
    }
}
