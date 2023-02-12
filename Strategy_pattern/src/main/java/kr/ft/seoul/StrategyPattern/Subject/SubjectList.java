package kr.ft.seoul.StrategyPattern.Subject;

import java.util.ArrayList;

public class SubjectList {
    private ArrayList<Subject> subjects;

    public SubjectList() {
        subjects = new ArrayList<Subject>();
    }

    public void addSubject(Subject subject) {
        if (this.getSubject(subject.getName()) != null) {
            return;
        }
        subjects.add(subject);
    }

    public void removeSubject(Subject subject) {
        if (subjects.contains(subject) == false) {
            return;
        }
        subjects.remove(subject);
    }

    public void removeSubject(String subjectName) {
        for (Subject subject : subjects) {
            if (subject.getName().compareTo(subjectName) == 0) {
                subjects.remove(subject);
                break;
            }
        }
    }

    public Subject getSubject(String subjectName) {
        for (Subject subject : subjects) {
            if (subject.getName().compareTo(subjectName) == 0) {
                return subject;
            }
        }
        return null;
    }

    public int getSubjectCount() {
        return subjects.size();
    }
}
