package strategy.sub02;

import java.util.ArrayList;

public class Student {

    int studentID;
    String studentName;
    ArrayList<Subject> subjectList;

    public static final int BASIC = 0;
    public static final int MAJOR = 1;

    public Student(int studentID, String studentName) {
        this.studentID = studentID;
        this.studentName = studentName;

        subjectList = new ArrayList<Subject>();
    }

    public void addSubject(String name, int score, boolean majorCode) {
        Subject subject = new Subject();

        subject.setName(name);
        subject.setScorePoint(score);
        subject.setMajorCode(majorCode);
        subjectList.add(subject);
    }

    public class Subject {
        private String name;
        private int scorePoint;
        private boolean majorCode;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getScorePoint() {
            return scorePoint;
        }

        public void setScorePoint(int scorePoint) {
            this.scorePoint = scorePoint;
        }

        public boolean isMajorCode() {
            return majorCode;
        }

        public void setMajorCode(boolean majorCode) {
            this.majorCode = majorCode;
        }
    }
}