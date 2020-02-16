package Faculties;

import Groups.GroupsE;

public class FacultyOfEngineering extends FacultiesParameters {

    private GroupsE groupsE;

    public FacultyOfEngineering(String faculty, GroupsE groupsE, String student, int mathScore, int physicsScore, int languageScore, int philosophyScore) {
        super(faculty, student, mathScore, physicsScore, languageScore, philosophyScore);
        this.groupsE = groupsE;
    }

    @Override
    public String getGroup() {
        return groupsE.toString();
    }

    @Override
    public String toString() {
        return super.toString().replace("}",
                ", group = " + groupsE +
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
