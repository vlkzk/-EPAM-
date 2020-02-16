package Faculties;

import java.util.Objects;

abstract public class FacultiesParameters {
    String faculty;
    String student;
    int mathScore;
    int physicScore;
    int languageScore;
    int philosophyScore;
    String group;

    public FacultiesParameters(String faculty, String student, int mathScore, int physicsScore, int languageScore, int philosophyScore) {
        this.faculty = faculty;
        this.student = student;
        this.mathScore = mathScore;
        this.physicScore = physicsScore;
        this.languageScore = languageScore;
        this.philosophyScore = philosophyScore;
    }

    public String getGroup() {return group;}

    public String getFaculty() {
        return faculty;
    }

    public String getStudent() {
        return student;
    }

    public int getMathScore() {
        return mathScore;
    }

    public int getPhysicsScore() {
        return physicScore;
    }

    public int getLanguageScore() {
        return languageScore;
    }

    public int getPhilosophyScore() {
        return philosophyScore;
    }

    @Override
    public String toString() {
        return  " information = '" + faculty + '\'' +
                ", group = '" + getGroup() + '\'' +
                ", student = '" + student + '\'' +
                ", math score = '" + mathScore + '\'' +
                ", physics score = '" + physicScore + '\'' +
                ", language score = '" + languageScore + '\'' +
                ", philosophy score = '" + philosophyScore + '\'';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FacultiesParameters that = (FacultiesParameters) o;
        return Objects.equals(faculty, that.faculty) &&
                Objects.equals(student, that.student) &&
                Objects.equals(mathScore, that.mathScore) &&
                Objects.equals(physicScore, that.physicScore) &&
                Objects.equals(languageScore, that.languageScore) &&
                Objects.equals(philosophyScore, that.philosophyScore);
    }

    @Override
    public int hashCode() {
        return Objects.hash(faculty, student, mathScore, physicScore, languageScore, philosophyScore);
    }
}
