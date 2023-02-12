package kr.ft.seoul.StrategyPattern.Subject.Grade.SubjectGradingStrategy;

import kr.ft.seoul.StrategyPattern.Subject.Grade.Grade;

public class NonMajorSubjectGradingStrategy implements SubjectGradingStrategy {
    public Grade getGradeByScore(int score) {
        if (score >= 90) {
            return Grade.A;
        } else if (score >= 80) {
            return Grade.B;
        } else if (score >= 70) {
            return Grade.C;
        } else if (score >= 55) {
            return Grade.D;
        } else {
            return Grade.F;
        }
    }
}
