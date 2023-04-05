import comparators.students.StudentComparator;
import comparators.universities.UniversityComparator;
import enums.StudentsComparators;
import enums.UniversityComparators;
import models.Student;
import models.University;
import tools.ComparatorUtil;
import tools.ExcelReader;

import java.io.IOException;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {

        String path = "C:\\Users\\MSI GL66 Pulse\\IdeaProjects\\UniversityProject\\src\\main\\resources\\universityInfo.xlsx";

        UniversityComparator uniComparator = ComparatorUtil.getUniversityComparator(UniversityComparators.YEAR);
        StudentComparator studComparator = ComparatorUtil.getStudentComparator(StudentsComparators.EXAM_SCORE);

        List<University> universityList = ExcelReader.universitiesReader(path);
        List<Student> studentList = ExcelReader.studentsReader(path);

        universityList.stream()
                .sorted(uniComparator)
                .forEach(System.out :: println);
        studentList.stream()
                .sorted(studComparator)
                .forEach(System.out :: println);





    }
}
