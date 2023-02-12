package kr.ft.seoul.StrategyPattern.Subject.Exception;

public class GradeException extends RuntimeException {
    private static final String DEFAULT_MESSAGE = "점수는 0 ~ 100 사이의 값이어야 합니다.";

    public GradeException() {
        super(DEFAULT_MESSAGE);
    }
}
