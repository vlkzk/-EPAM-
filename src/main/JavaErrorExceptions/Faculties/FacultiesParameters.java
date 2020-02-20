package Faculties;

import java.util.Objects;

abstract public class FacultiesParameters {
    int id;
    String faculty;
    String group;
    String student;
    int mathScore;
    int physicScore;
    int languageScore;
    int philosophyScore;

    public FacultiesParameters(int id, String student, int mathScore, int physicsScore, int languageScore, int philosophyScore) {
        this.id = id;
        this.student = student;
        this.mathScore = mathScore;
        this.physicScore = physicsScore;
        this.languageScore = languageScore;
        this.philosophyScore = philosophyScore;
    }

    public String getGroup() {
        return group;
    }

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


    @Override
    public String toString() {
        return "id = " + id +
                ", faculty = '" + getFaculty() + '\'' +
                ", group = '" + getGroup() + '\'' +
                ", student = '" + student + '\'' +
                ", mathScore = " + mathScore +
                ", physicScore = " + physicScore +
                ", languageScore = " + languageScore +
                ", philosophyScore = " + philosophyScore;
    }

    public int getPhilosophyScore() {
        return philosophyScore;
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
