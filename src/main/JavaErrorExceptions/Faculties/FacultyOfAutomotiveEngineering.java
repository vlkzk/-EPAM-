package Faculties;

import Groups.GroupsFAE;

public class FacultyOfAutomotiveEngineering extends FacultiesParameters{

    private GroupsFAE groupsFAE;
    private FacultiesEnum facultyAE;

    public FacultyOfAutomotiveEngineering(FacultiesEnum facultyAE, GroupsFAE groupsFAE, String student, int mathScore, int physicsScore, int languageScore, int philosophyScore) {
        super(student, mathScore, physicsScore, languageScore, philosophyScore);
        this.groupsFAE = groupsFAE;
        this.facultyAE = facultyAE;
    }

    @Override
    public String getFaculty() {
        return facultyAE.toString();
    }

    @Override
    public String getGroup() {
        return groupsFAE.toString();
    }

    @Override
    public String toString() {
        return super.toString().replace("}",
                ", group = " + groupsFAE +
                        ", faculty = " + facultyAE );
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
