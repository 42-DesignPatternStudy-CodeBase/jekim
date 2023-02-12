package kr.ft.seoul.StrategyPattern.Student;

import kr.ft.seoul.StrategyPattern.Student.Exception.StudentIdException;
import kr.ft.seoul.StrategyPattern.Subject.SubjectList;
import kr.ft.seoul.StrategyPattern.Subject.Subject;

public class Student {
    int id;
    String name;
    SubjectList subjectList;

    private Student() {};

    public Student(int id, String name) {
        if (id < 0) {
            throw new StudentIdException();
        }
        this.id = id;
        this.name = name;
        subjectList = new SubjectList();
    }

    public void showGradeInfo() {
        int limit = subjectList.getSubjectCount();

        for (int i = 0; i < limit; i++) {
            Subject subject = subjectList.getSubject(i);
            System.out.println(
                "학생 " + name + "의 " 
                    + subject.getName() + " 과목 성적은 " + subject.getScore() + "점이고, "
                    + "학점은 " + subject.getGrade() + "입니다."
            );
        }
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addSubject(String subjectName, int score, boolean isMajor) {
        subjectList.addSubject(new Subject(subjectName, score, isMajor));
    }

    public void addSubject(Subject subject) {
        subjectList.addSubject(subject);
    }

    public void removeSubject(Subject subject) {
        subjectList.removeSubject(subject);
    }

    public void removeSubject(String subjectName) {
        subjectList.removeSubject(subjectName);
    }

    public SubjectList getSubjectList() {
        return this.subjectList;
    }
}
