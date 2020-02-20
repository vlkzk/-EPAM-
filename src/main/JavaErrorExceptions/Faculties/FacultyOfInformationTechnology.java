package Faculties;

import Groups.GroupsIT;

public class FacultyOfInformationTechnology extends FacultiesParameters {

    private GroupsIT groupsIT;
    private FacultiesEnum facultyIT;

    public FacultyOfInformationTechnology(int id, FacultiesEnum facultyIT, GroupsIT groupsIT, String student, int mathScore, int physicsScore, int languageScore, int philosophyScore) {
        super(id, student, mathScore, physicsScore, languageScore, philosophyScore);
        this.groupsIT = groupsIT;
        this.facultyIT = facultyIT;
    }

    @Override
    public String getGroup() {
        return groupsIT.toString();
    }

    @Override
    public String getFaculty() {
        return facultyIT.toString();
    }

    @Override
    public String toString() {
        return super.toString().replace("}",
                ", group = " + groupsIT +
                        ", faculty = " + facultyIT );
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
