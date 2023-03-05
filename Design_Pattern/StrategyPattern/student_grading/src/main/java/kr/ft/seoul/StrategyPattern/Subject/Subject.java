package kr.ft.seoul.StrategyPattern.Subject;

import kr.ft.seoul.StrategyPattern.Subject.Exception.GradeException;
import kr.ft.seoul.StrategyPattern.Subject.Grade.SubjectGradingStrategy.*;
import kr.ft.seoul.StrategyPattern.Subject.Grade.*;

public class Subject {
    private String name;
    private int score;
    private boolean isMajor;
    private SubjectGradingStrategy gradingStrategy;
    private Grade grade;

    public Subject(String name, int score, boolean isMajor) {
        this.name = name;
        if (score < 0 || score > 100) {
            throw new GradeException();
        }
        this.score = score;
        this.isMajor = isMajor;
        if (isMajor == true) {
            this.gradingStrategy = new MajorSubjectGradingStrategy();
        } else {
            this.gradingStrategy = new NonMajorSubjectGradingStrategy();
        }
        this.grade = gradingStrategy.getGradeByScore(score);
    }

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }

    public boolean isMajor() {
        return isMajor;
    }

    public String getGrade() {
        return grade.toString();
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public void setMajor(boolean major) {
        isMajor = major;
    }
}
