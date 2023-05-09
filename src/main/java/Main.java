import static tools.StatisticsUtil.createStatistics;
import static tools.XlsWriter.statisticsWrite;

import comparators.students.StudentComparator;
import comparators.universities.UniversityComparator;
import enums.StudentsComparators;
import enums.UniversityComparators;

import java.util.Date;
import java.util.logging.Level;
import java.util.logging.LogManager;
import java.util.logging.Logger;

import models.FullInfo;
import models.Student;
import models.University;
import tools.*;

import java.io.IOException;
import java.util.List;

public class Main {

  private final static Logger logger = Logger.getLogger(Main.class.getName());
  public static void main(String[] args) throws IOException {

    try {
      LogManager.getLogManager().readConfiguration(Main.class.getResourceAsStream("/logging.properties"));
    } catch(IOException e) {
      System.err.println("Could not find properties for logger");
    }

    logger.log(Level.INFO, "Application has started correctly");

    String pathIn = "C:\\Users\\MSI GL66 Pulse\\IdeaProjects\\UniversityProject\\src\\main\\resources\\universityInfo.xlsx";
    String pathOut = "C:\\Users\\MSI GL66 Pulse\\IdeaProjects\\UniversityProject\\src\\main\\resources\\statisticsInfo.xlsx";

    UniversityComparator uniComparator = ComparatorUtil.getUniversityComparator(
        UniversityComparators.YEAR);

    StudentComparator studComparator = ComparatorUtil.getStudentComparator(
        StudentsComparators.EXAM_SCORE);


    List<University> universityList = XlsReader.universitiesReader(pathIn);
    universityList.sort(uniComparator);

    List<Student> studentList = XlsReader.studentsReader(pathIn);
    studentList.sort(studComparator);


    statisticsWrite(createStatistics(studentList, universityList), pathOut);

    FullInfo fullInfo = new FullInfo()
            .setStudentList(studentList)
            .setUniversityList(universityList)
            .setStatisticsList(createStatistics(studentList, universityList))
            .setDate(new Date());

    XmlWriter.createXMLRequest(fullInfo);
    JsonWriter.createJsonRequest(fullInfo);

    logger.log(Level.INFO, "Application has ended correctly");

  }
}
