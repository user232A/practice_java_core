package practice_1;

public class University {

    static String universityName;
    final int studentID;
    String studentName;

    public University(int studentID, String studentName) {
        this.studentID = studentID;
        this.studentName = studentName;
    }

    static void changeUniversityName(String newName) {
        University.universityName = newName;
    }

    public String studentName() {
        return this.studentName;
    }

    public void printStudentInfo() {
        System.out.println("Student " + this.studentName + " Student ID " + this.studentID + " University name " +
                University.universityName);
    }
}
