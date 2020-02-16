package Faculties;

import Groups.GroupsFAE;

public class FacultyOfAutomotiveEngineering extends FacultiesParameters{

    private GroupsFAE groupsFAE;

    public FacultyOfAutomotiveEngineering(String faculty, GroupsFAE groupsFAE, String student, int mathScore, int physicsScore, int languageScore, int philosophyScore) {
        super(faculty, student, mathScore, physicsScore, languageScore, philosophyScore);
        this.groupsFAE = groupsFAE;
    }

    @Override
    public String getGroup() {
        return groupsFAE.toString();
    }

    @Override
    public String toString() {
        return super.toString().replace("}",
                ", group = " + groupsFAE +
                        '}');
    }

    @Override
    public boolean equals(Object o) {
        return super.equals(o);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }
}
