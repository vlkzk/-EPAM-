import Faculties.*;
import Groups.GroupsE;
import Groups.GroupsFAE;
import Groups.GroupsIT;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Starter {
    static List<FacultiesParameters> students = Arrays.asList(
            new FacultyOfEngineering("Faculty оf Engineering", GroupsE.GROUP_ENGINEERS, "Петров Пётр Петрович", 1, 2, 3, 4),
            new FacultyOfEngineering("Faculty оf Engineering", GroupsE.GROUP_ENGINEERS, "Выпьем Игорь Николаев ", 1, 2, 3, 4),
            new FacultyOfEngineering("Faculty оf Engineering", GroupsE.GROUP_ENGINEERS, "Грозный Василий Эдуардович", 1, 2, 3, 4),
            new FacultyOfEngineering("Faculty оf Engineering", GroupsE.GROUP_MECHANIKS, "Казак Владислав Николаевич", 1, 2, 3, 4),
            new FacultyOfEngineering("Faculty of Engineering", GroupsE.GROUP_MECHANIKS, "Нестюк Сергей Олегович", 1, 2, 3, 4),
            new FacultyOfEngineering("Faculty of Engineering", GroupsE.GROUP_MECHANIKS, "Кто-то Там Чей-то", 1, 2, 3, 4),

            new FacultyOfAutomotiveEngineering("Faculty Of Automotive Engineering", GroupsFAE.GROUP_ELECTRICS, "Красовский Николай Дмитриевич", 1, 2, 3, 4),
            new FacultyOfAutomotiveEngineering("Faculty Of Automotive Engineering", GroupsFAE.GROUP_ELECTRICS, "Карпов Олег Незнаю", 1, 2, 3, 4),
            new FacultyOfAutomotiveEngineering("Faculty Of Automotive Engineering", GroupsFAE.GROUP_ELECTRICS, "Филиппоский Валентин Александрович", 1, 2, 3, 4),
            new FacultyOfAutomotiveEngineering("Faculty Of Automotive Engineering", GroupsFAE.GROUP_AUTOMATIC, "Иназумова Виктрия Алексеевна", 1, 2, 3, 4),
            new FacultyOfAutomotiveEngineering("Faculty Of Automotive Engineering", GroupsFAE.GROUP_AUTOMATIC, "Макаров Дмитрий Анатольевич", 1, 2, 3, 4),
            new FacultyOfAutomotiveEngineering("Faculty Of Automotive Engineering", GroupsFAE.GROUP_AUTOMATIC, "Лазакович Елизавета Эдуардовна", 1, 2, 3, 4),

            new FacultyOfInformationTechnology("Faculty Of Information Technology", GroupsIT.GROUP_TESTERS, "Рутковская Екатерина Игоревна", 1, 2, 3, 4),
            new FacultyOfInformationTechnology("Faculty Of Information Technology", GroupsIT.GROUP_TESTERS, "Бертман Елизавета Валентиновна", 1, 2, 3, 4),
            new FacultyOfInformationTechnology("Faculty Of Information Technology", GroupsIT.GROUP_TESTERS, "Молотобойцев Никита Дмитриевич", 1, 2, 3, 4),
            new FacultyOfInformationTechnology("Faculty Of Information Technology", GroupsIT.GROUP_PROGERS, "Леонова Снежанна Алексеевна", 1, 2, 3, 4),
            new FacultyOfInformationTechnology("Faculty Of Information Technology", GroupsIT.GROUP_PROGERS, "Моисеенко Алексей Дмитриевич", 1, 2, 3, 4),
            new FacultyOfInformationTechnology("Faculty Of Information Technology", GroupsIT.GROUP_PROGERS, "Ераховец Алексей Эдуардович", 1, 2, 3, 4)
    );

    public static void main(String[] args) {
        University university = new University(students);
        University students = new University(university.getStudents());
        List<FacultiesParameters> facultiesParameters = new ArrayList<>(students.getStudents());
        int score = 0;
        for (FacultiesParameters facultiesParameters1 : facultiesParameters) {
            score = (facultiesParameters1.getLanguageScore() + facultiesParameters1.getMathScore() + facultiesParameters1.getPhysicsScore() + facultiesParameters1.getPhilosophyScore()) / 4;
            System.out.println(facultiesParameters1.getStudent() + " grade point average = " + score);
        }
    }
}
