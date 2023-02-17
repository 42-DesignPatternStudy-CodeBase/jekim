package kr.ft.seoul.StrategyPattern.Student.Exception;

public class StudentIdException extends RuntimeException {
    private static final String DEFAULT_MESSAGE = "학번은 0 이상의 양의 정수여야 합니다.";

    public StudentIdException() {
        super(DEFAULT_MESSAGE);
    }
}
