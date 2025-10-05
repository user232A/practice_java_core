package practice_1;

public class Person {

    private String firstName;
    private String lastName;
    private final String ssn;

    public Person(String firstName, String lastName, String ssn) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.ssn = ssn;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public String getSsn() {
        return this.ssn;
    }

    public void setFirstName(String newFirstName) {
        this.firstName = newFirstName;
    }

    public void setLastName(String newLastName) {
        this.lastName = newLastName;
    }

    public void printPersonInfo() {
        System.out.println("Имя " + this.firstName + " Фамилия " + this.lastName + " SSN " + this.ssn);
    }

    public void printInfo() {
        System.out.println(String.format("Имя %s. Фамилия %s. SSN %s", this.firstName, this.lastName, this.ssn));
    }
}
