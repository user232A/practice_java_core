package complex_tasks_tests;

import complex_tasks.grade_service.GradeService;
import complex_tasks.grade_service.InvalidGradeException;
import complex_tasks.grade_service.StudentGrade;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.List;

public class GradeServiceTest {

    private static GradeService<Double> service;

    @BeforeEach
    public void setUp() {
        service = new GradeService<>();
    }

    public static void getStudentGrade() throws InvalidGradeException {
        List<StudentGrade<Double>> list = List.of(
                new StudentGrade<>("Bob", "History", 9.0),
                new StudentGrade<>("David", "History", 7.0),
                new StudentGrade<>("Alex", "History", 7.0),
                new StudentGrade<>("Sam", "History", 6.0),
                new StudentGrade<>("Vlad", "History", 6.0),
                new StudentGrade<>("John", "History", 8.0),
                new StudentGrade<>("Anna", "History", 5.0),
                new StudentGrade<>("Kevin", "History", 6.0),
                new StudentGrade<>("Tom", "History", 5.0)
        );
        for (int i = 0; i < list.size(); i++) {
            service.addGrade(list.get(i));
        }
    }

    @Test
    public void canAddGradeToList() throws InvalidGradeException {
        StudentGrade<Double> initialGrade = new StudentGrade<>("John", "Biology", 8.8);
        service.addGrade(initialGrade);
        Assertions.assertEquals(initialGrade, service.gradeList.getFirst());
    }

    @Test
    public void catchExceptionIfGradeInvalid() {
        StudentGrade<Double> initialGrade = new StudentGrade<>("John", "Biology", 0.0);
        Assertions.assertThrows(InvalidGradeException.class, () -> service.addGrade(initialGrade));
    }

    @Test
    public void canGetAverageValue() throws InvalidGradeException {
        getStudentGrade();
        double expectedValue = 6.5555;
        double actualValue = new BigDecimal(Double.toString(service.averageGrade().get("History")))
                .setScale(4, RoundingMode.DOWN).doubleValue();
        Assertions.assertEquals(expectedValue, actualValue);
    }
}
