package complex_tasks.grade_service;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        GradeService<Integer> integerGradeService = new GradeService<>();

        StudentGrade<Integer> grade1 = new StudentGrade<>("Bob", "History", 9);
        StudentGrade<Integer> grade4 = new StudentGrade<>("John", "Biology", 8);
        StudentGrade<Integer> grade6 = new StudentGrade<>("Monica", "History", -8);
        StudentGrade<Integer> grade9 = new StudentGrade<>("David", "History", 7);
        StudentGrade<Integer> grade10 = new StudentGrade<>("Alex", "Biology", 7);
        StudentGrade<Integer> grade11 = new StudentGrade<>("Sam", "Biology", 6);
        StudentGrade<Integer> grade12 = new StudentGrade<>("Vlad", "Biology", 6);
        StudentGrade<Integer> grade13 = new StudentGrade<>("Donald", "History", 7);

        List<StudentGrade<Integer>> studentGradeList = List.of(grade1, grade4, grade6, grade9, grade10, grade11,
                grade12, grade13);

        for (int i = 0; i < studentGradeList.size(); i++) {
            try {
                integerGradeService.addGrade(studentGradeList.get(i));
            } catch (InvalidGradeException e) {
                System.out.println("Некорректная оценка у " + studentGradeList.get(i).getName());
            }
        }

        for (StudentGrade<Integer> integerStudentGrade : integerGradeService.gradeList) {
            System.out.println(integerStudentGrade);
        }

        System.out.println(integerGradeService.averageGrade());
    }
}
