package Faculties;

import Groups.GroupsIT;

public class FacultyOfInformationTechnology extends FacultiesParameters {

    private GroupsIT groupsIT;

    public FacultyOfInformationTechnology(String faculty, GroupsIT groupsIT, String student, int mathScore, int physicsScore, int languageScore, int philosophyScore) {
        super(faculty, student, mathScore, physicsScore, languageScore, philosophyScore);
        this.groupsIT = groupsIT;
    }

    @Override
    public String getGroup() {
        return groupsIT.toString();
    }

    @Override
    public String toString() {
        return super.toString().replace("}",
                ", group = " + groupsIT +
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
