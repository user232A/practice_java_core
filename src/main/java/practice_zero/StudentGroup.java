package practice_zero;

public class StudentGroup {

    String groupName;
    int studentCount;

    public StudentGroup(String groupName, int studentCount){
        this.groupName = groupName;
        this.studentCount = studentCount;
    }

    public String getGroupName(){
        return groupName;
    }

    public int getStudentCount(){
        return studentCount;
    }

    public void setGroupName(String newGroupName){
        groupName = newGroupName;
    }

    public void setStudentCount(int newStudentCount){
        this.studentCount = newStudentCount;
    }

    public void printInfo(){
        System.out.println("Group " + this.getGroupName() + "   Students count " + this.getStudentCount());
    }
}
