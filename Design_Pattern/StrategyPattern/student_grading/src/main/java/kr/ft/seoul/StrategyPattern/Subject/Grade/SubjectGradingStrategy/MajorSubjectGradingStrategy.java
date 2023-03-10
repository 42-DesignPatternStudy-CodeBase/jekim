package kr.ft.seoul.StrategyPattern.Subject.Grade.SubjectGradingStrategy;

import kr.ft.seoul.StrategyPattern.Subject.Grade.Grade;

public class MajorSubjectGradingStrategy implements SubjectGradingStrategy {
    public Grade getGradeByScore(int score) {
        if (score >= 95) {
            return Grade.S;
        } else if (score >= 90) {
            return Grade.A;
        } else if (score >= 80) {
            return Grade.B;
        } else if (score >= 70) {
            return Grade.C;
        } else if (score >= 60) {
            return Grade.D;
        } else {
            return Grade.F;
        }
    }
}
