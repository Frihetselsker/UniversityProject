import comparators.students.StudentComparator;
import comparators.universities.UniversityComparator;
import enums.StudentsComparators;
import enums.UniversityComparators;
import models.Student;
import models.University;
import tools.ComparatorUtil;
import tools.ExcelReader;
import tools.JsonUtil;

import java.io.IOException;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {

        String path = "C:\\Users\\MSI GL66 Pulse\\IdeaProjects\\UniversityProject\\src\\main\\resources\\universityInfo.xlsx";

        UniversityComparator uniComparator = ComparatorUtil.getUniversityComparator(UniversityComparators.YEAR);
        StudentComparator studComparator = ComparatorUtil.getStudentComparator(StudentsComparators.EXAM_SCORE);


        List<University> universityList = ExcelReader.universitiesReader(path);
        universityList.sort(uniComparator);
        String uniListJson = JsonUtil.universityListToJson(universityList);
        System.out.println(uniListJson);
        List<University> universityListRestored = JsonUtil.jsonToUniversityList(uniListJson);

        if(universityList.size() == universityListRestored.size())
            System.out.println("Deserialization of UniversityList completed correctly!");
        else System.out.println("Deserialization of UniversityList completed incorrectly...");

        System.out.println("__________________________________________________");

        universityList.forEach(u -> {
            String uniJson = JsonUtil.universityToJson(u);
            System.out.println(uniJson);
            University uRestored = JsonUtil.jsonToUniversity(uniJson);
            System.out.println(uRestored);
            System.out.println("__________________________________________________");
        });

        List<Student> studentList = ExcelReader.studentsReader(path);
        String studListJson = JsonUtil.studentListToJson(studentList);
        System.out.println(studListJson);
        List<Student> studentListRestored = JsonUtil.jsonToStudentList(studListJson);

        if(studentList.size() == studentListRestored.size())
            System.out.println("Deserialization of StudentList completed correctly!");
        else System.out.println("Deserialization of StudentList completed incorrectly...");

        System.out.println("__________________________________________________");

        studentList.forEach(s -> {
            String studJson = JsonUtil.studentToJson(s);
            System.out.println(studJson);
            Student sRestored = JsonUtil.jsonToStudent(studJson);
            System.out.println(sRestored);
            System.out.println("__________________________________________________");
        });

    }
}
