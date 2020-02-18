package Faculties;

import Groups.GroupsE;

public class FacultyOfEngineering extends FacultiesParameters {

    private GroupsE groupsE;
    private FacultiesEnum facultyE;

    public FacultyOfEngineering(FacultiesEnum facultyE, GroupsE groupsE, String student, int mathScore, int physicsScore, int languageScore, int philosophyScore) {
        super(student, mathScore, physicsScore, languageScore, philosophyScore);
        this.groupsE = groupsE;
        this.facultyE = facultyE;
    }

    @Override
    public String getGroup() {
        return groupsE.toString();
    }

    @Override
    public String getFaculty() {
        return facultyE.toString();
    }

    @Override
    public String toString() {
        return super.toString().replace("}",
                ", group = " + groupsE +
                        ", faculty = " + facultyE );
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
