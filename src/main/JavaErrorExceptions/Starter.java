import Faculties.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static Groups.GroupsE.*;
import static Groups.GroupsFAE.*;
import static Groups.GroupsIT.*;

public class Starter {
    static List<FacultiesParameters> students = Arrays.asList(
            new FacultyOfEngineering("Faculty оf Engineering", GROUP_ENGINEERS, "Петров Пётр Петрович", 7, 6, 6, 7),
            new FacultyOfEngineering("Faculty оf Engineering", GROUP_ENGINEERS, "Выпьем Игорь Николаев ", 5, 7, 7, 8),
            new FacultyOfEngineering("Faculty оf Engineering", GROUP_ENGINEERS, "Грозный Василий Эдуардович", 9, 8, 8, 10),
            new FacultyOfEngineering("Faculty оf Engineering", GROUP_MECHANIKS, "Казак Владислав Николаевич", 4, 4, 7, 9),
            new FacultyOfEngineering("Faculty of Engineering", GROUP_MECHANIKS, "Нестюк Сергей Олегович", 6, 3, 6, 5),
            new FacultyOfEngineering("Faculty of Engineering", GROUP_MECHANIKS, "Кто-то Там Чей-то", 3, 9, 4, 6),

            new FacultyOfAutomotiveEngineering("Faculty Of Automotive Engineering", GROUP_ELECTRICS, "Красовский Николай Дмитриевич", 7, 2, 7, 7),
            new FacultyOfAutomotiveEngineering("Faculty Of Automotive Engineering", GROUP_ELECTRICS, "Карпов Олег Незнаю", 5, 4, 6, 6),
            new FacultyOfAutomotiveEngineering("Faculty Of Automotive Engineering", GROUP_ELECTRICS, "Филиппоский Валентин Александрович", 7, 7, 3, 9),
            new FacultyOfAutomotiveEngineering("Faculty Of Automotive Engineering", GROUP_AUTOMATIC, "Иназумова Виктрия Алексеевна", 4, 5, 8, 9),
            new FacultyOfAutomotiveEngineering("Faculty Of Automotive Engineering", GROUP_AUTOMATIC, "Макаров Дмитрий Анатольевич", 9, 9, 8, 8),
            new FacultyOfAutomotiveEngineering("Faculty Of Automotive Engineering", GROUP_AUTOMATIC, "Лазакович Елизавета Эдуардовна", 5, 4, 6, 6),

            new FacultyOfInformationTechnology("Faculty Of Information Technology", GROUP_TESTERS, "Рутковская Екатерина Игоревна", 4, 7, 8, 8),
            new FacultyOfInformationTechnology("Faculty Of Information Technology", GROUP_TESTERS, "Бертман Елизавета Валентиновна", 7, 7, 6, 8),
            new FacultyOfInformationTechnology("Faculty Of Information Technology", GROUP_TESTERS, "Молотобойцев Никита Дмитриевич", 6, 7, 8, 9),
            new FacultyOfInformationTechnology("Faculty Of Information Technology", GROUP_PROGERS, "Леонова Снежанна Алексеевна", 5, 6, 6, 10),
            new FacultyOfInformationTechnology("Faculty Of Information Technology", GROUP_PROGERS, "Моисеенко Алексей Дмитриевич", 4, 5, 8, 5),
            new FacultyOfInformationTechnology("Faculty Of Information Technology", GROUP_PROGERS, "Ераховец Алексей Эдуардович", 3, 9, 7, 4)
    );

    public static void main(String[] args) throws UniversityException {

        double score;
        int counter = 0;

        University university = new University(students);
        University students = new University(university.getStudents());

        List<FacultiesParameters> listOfStudents = new ArrayList<>(students.getStudents());
        List<FacultiesParameters> listOfStudentsSpecificFaculty = new ArrayList<>();
        List<FacultiesParameters> listOfStudentsSpecificGroup = new ArrayList<>();


        for (FacultiesParameters fP : listOfStudents) {
            counter++;
            score = ((fP.getLanguageScore() + fP.getMathScore() + fP.getPhysicsScore() + fP.getPhilosophyScore()) / 4.0);
            System.out.printf(fP.getStudent() + " grade point average = %.2f\n", score);
        }

        for (FacultiesParameters fP : listOfStudents) {
            if (fP.getFaculty().equals("Faculty Of Automotive Engineering")) {
                listOfStudentsSpecificFaculty.add(fP);
            }
        }

        for (FacultiesParameters fP : listOfStudentsSpecificFaculty) {
            if (fP.getGroup().equals(GROUP_AUTOMATIC.toString())) listOfStudentsSpecificGroup.add(fP);
        }
        score = 0;
        counter = 0;
        for (FacultiesParameters fP : listOfStudentsSpecificGroup) {
            score += fP.getMathScore();
            counter++;
        }
        System.out.printf("GPA at the Faculty of Automotive Engineering in the " + GROUP_AUTOMATIC.toString() + " in mathematics = %.2f\n", (score / counter));


        score = 0;
        counter = 0;
        for (FacultiesParameters fP : listOfStudents) {
            score += (fP.getLanguageScore());
            counter++;
        }
        System.out.printf("GPA at the university in language = %.2f", (score / counter));
    }
}
