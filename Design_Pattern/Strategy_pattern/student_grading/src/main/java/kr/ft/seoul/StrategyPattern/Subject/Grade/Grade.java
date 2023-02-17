package kr.ft.seoul.StrategyPattern.Subject.Grade;

public enum Grade {
    S ("S"),
    A ("A"),
    B ("B"),
    C ("C"),
    D ("D"),
    F ("F");

    private String grade;

    Grade(String grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return grade;
    }
}
