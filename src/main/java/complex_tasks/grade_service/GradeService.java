package complex_tasks.grade_service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GradeService<T extends Number> {

    public List<StudentGrade<T>> gradeList = new ArrayList<>();

    public synchronized void addGrade(StudentGrade<T> grade) throws InvalidGradeException {
        if (grade.getGrade().doubleValue() > 0) {
            gradeList.add(grade);
        } else {
            throw new InvalidGradeException("Grade is incorrect");
        }
    }

    public Map<String, Double> averageGrade() {
        return gradeList.stream().collect(Collectors.groupingBy(StudentGrade::getSubject,
                Collectors.averagingDouble((s) -> s.getGrade().doubleValue())));
    }
}
