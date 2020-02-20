import Faculties.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static Faculties.FacultiesEnum.*;
import static Groups.GroupsE.*;
import static Groups.GroupsFAE.*;
import static Groups.GroupsIT.*;

public class Starter {
    static List<FacultiesParameters> students = Arrays.asList(
            new FacultyOfEngineering(1, FACULTY_OF_ENGINEERING, GROUP_ENGINEERS, "Петров Пётр Петрович", 7, 6, 6, 7),
            new FacultyOfEngineering(2, FACULTY_OF_ENGINEERING, GROUP_ENGINEERS, "Выпьем Игорь Николаев ", 5, 7, 7, 8),
            new FacultyOfEngineering(3, FACULTY_OF_ENGINEERING, GROUP_ENGINEERS, "Грозный Василий Эдуардович", 9, 8, 8, 10),
            new FacultyOfEngineering(4, FACULTY_OF_ENGINEERING, GROUP_MECHANIKS, "Казак Владислав Николаевич", 4, 4, 7, 9),
            new FacultyOfEngineering(5, FACULTY_OF_ENGINEERING, GROUP_MECHANIKS, "Нестюк Сергей Олегович", 6, 3, 6, 5),
            new FacultyOfEngineering(6, FACULTY_OF_ENGINEERING, GROUP_MECHANIKS, "Кто-то Там Чей-то", 3, 9, 4, 6),

            new FacultyOfAutomotiveEngineering(7, FACULTY_OF_AUTOMOTIVE_ENGINEERING, GROUP_ELECTRICS, "Красовский Николай Дмитриевич", 7, 2, 7, 7),
            new FacultyOfAutomotiveEngineering(8, FACULTY_OF_AUTOMOTIVE_ENGINEERING, GROUP_ELECTRICS, "Карпов Олег Незнаю", 5, 4, 6, 6),
            new FacultyOfAutomotiveEngineering(9, FACULTY_OF_AUTOMOTIVE_ENGINEERING, GROUP_ELECTRICS, "Филиппоский Валентин Александрович", 7, 7, 3, 9),
            new FacultyOfAutomotiveEngineering(10, FACULTY_OF_AUTOMOTIVE_ENGINEERING, GROUP_AUTOMATIC, "Иназумова Виктрия Алексеевна", 4, 5, 8, 9),
            new FacultyOfAutomotiveEngineering(11, FACULTY_OF_AUTOMOTIVE_ENGINEERING, GROUP_AUTOMATIC, "Макаров Дмитрий Анатольевич", 9, 9, 8, 8),
            new FacultyOfAutomotiveEngineering(12, FACULTY_OF_AUTOMOTIVE_ENGINEERING, GROUP_AUTOMATIC, "Лазакович Елизавета Эдуардовна", 5, 4, 6, 6),

            new FacultyOfInformationTechnology(13, FACULTY_OF_INFORMATION_TECHNOLOGY, GROUP_TESTERS, "Рутковская Екатерина Игоревна", 4, 7, 8, 8),
            new FacultyOfInformationTechnology(14, FACULTY_OF_INFORMATION_TECHNOLOGY, GROUP_TESTERS, "Бертман Елизавета Валентиновна", 7, 7, 6, 8),
            new FacultyOfInformationTechnology(15, FACULTY_OF_INFORMATION_TECHNOLOGY, GROUP_TESTERS, "Молотобойцев Никита Дмитриевич", 6, 7, 8, 9),
            new FacultyOfInformationTechnology(16, FACULTY_OF_INFORMATION_TECHNOLOGY, GROUP_PROGERS, "Леонова Снежанна Алексеевна", 5, 6, 6, 10),
            new FacultyOfInformationTechnology(17, FACULTY_OF_INFORMATION_TECHNOLOGY, GROUP_PROGERS, "Моисеенко Алексей Дмитриевич", 4, 5, 8, 5),
            new FacultyOfInformationTechnology(18, FACULTY_OF_INFORMATION_TECHNOLOGY, GROUP_PROGERS, "Ераховец Алексей Эдуардович", 3, 9, 7, 4)
    );

    public static void main(String[] args) throws UniversityException {

        double score;
        double counter;
        University university = new University(students);
        University students = new University(university.getStudents());

        List<FacultiesParameters> listOfStudents = new ArrayList<>(students.getStudents());
        List<FacultiesParameters> listOfStudentsSpecificFaculty = new ArrayList<>();
        List<FacultiesParameters> listOfStudentsSpecificGroup = new ArrayList<>();

        for (FacultiesParameters fP : listOfStudents) {
            score = fP.getMathScore();
            if (score > 10 | score < 0) throw new UniversityException("Incorrect score");
            score = fP.getLanguageScore();
            if (score > 10 | score < 0) throw new UniversityException("Incorrect score");
            score = fP.getPhilosophyScore();
            if (score > 10 | score < 0) throw new UniversityException("Incorrect score");
            score = fP.getPhysicsScore();
            if (score > 10 | score < 0) throw new UniversityException("Incorrect score");
        }

        for (FacultiesParameters fP : listOfStudents) {
            score = ((fP.getLanguageScore() + fP.getMathScore() + fP.getPhysicsScore() + fP.getPhilosophyScore()) / 4.0);
            System.out.printf(fP.getStudent() + " grade point average = %.2f\n", score);
        }

        for (FacultiesParameters fP : listOfStudents) {
            if (fP.getFaculty().equals(FACULTY_OF_ENGINEERING.toString())) {
                listOfStudentsSpecificFaculty.add(fP);
            }
        }

        for (FacultiesParameters fP : listOfStudentsSpecificFaculty) {
            if (!fP.getFaculty().equals(FACULTY_OF_ENGINEERING.toString()))
                throw new UniversityException("Faculty not founded");
        }

        for (FacultiesParameters fP : listOfStudentsSpecificFaculty) {
            if (fP.getGroup().equals(GROUP_ENGINEERS.toString())) listOfStudentsSpecificGroup.add(fP);
        }

        for (FacultiesParameters fP : listOfStudentsSpecificGroup) {
            System.out.println(fP);
            if (!fP.getGroup().equals(GROUP_ENGINEERS.toString())) throw new UniversityException("Group not fonded");
        }

        score = 0;
        counter = 0;
        for (FacultiesParameters fP : listOfStudentsSpecificGroup) {
            score += fP.getMathScore();
            counter++;
        }
        System.out.printf("GPA at the " + FACULTY_OF_ENGINEERING.toString() + " " + GROUP_AUTOMATIC.toString() + " in mathematics = %.2f\n", (score / counter));

        score = 0;
        counter = 0;
        for (FacultiesParameters fP : listOfStudents) {
            score += (fP.getLanguageScore());
            counter++;
        }
        System.out.printf("GPA at the university in language = %.2f", (score / counter));
    }
}
