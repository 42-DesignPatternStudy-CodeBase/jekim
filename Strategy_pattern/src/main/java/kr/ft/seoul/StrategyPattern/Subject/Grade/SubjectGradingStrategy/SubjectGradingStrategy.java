package kr.ft.seoul.StrategyPattern.Subject.Grade.SubjectGradingStrategy;

import kr.ft.seoul.StrategyPattern.Subject.Grade.Grade;

public interface SubjectGradingStrategy {
    public Grade getGradeByScore(int score);
}
