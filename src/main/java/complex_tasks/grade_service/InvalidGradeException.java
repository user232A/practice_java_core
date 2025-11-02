package complex_tasks.grade_service;

public class InvalidGradeException extends Exception {
    public InvalidGradeException(String message) {
        super(message);
    }
}
