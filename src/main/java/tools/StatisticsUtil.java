package tools;

import enums.StudyProfile;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;
import java.util.Set;
import java.util.stream.Collectors;
import models.Statistics;
import models.Student;
import models.University;
import org.apache.commons.lang3.StringUtils;

public class StatisticsUtil {

  public static List<Statistics> createStatistics(List<Student> studentList, List<University> universityList){
    List<Statistics> statisticsList = new ArrayList<>();

    Set<StudyProfile> profiles = universityList.stream()
        .map(University::getMainProfile)
        .collect(Collectors.toSet());
    profiles.forEach(profile ->{
      Statistics statistics = new Statistics();
      statisticsList.add(statistics);
      statistics.setStudyProfile(profile);

      List<String> profileUniverstiryID = universityList.stream()
          .filter(university -> university.getMainProfile().equals(profile))
          .map(University::getId)
          .toList();
      statistics.setUniNumber(profileUniverstiryID.size());
      statistics.setUniNames(StringUtils.EMPTY);

      universityList.stream()
          .filter(university -> profileUniverstiryID.contains(university.getId()))
          .map(University::getFullName)
          .forEach(uniFullName -> statistics.setUniNames(statistics.getUniNames() + uniFullName + ";"));
      List<Student> profileStudent = studentList.stream().
          filter(student -> profileUniverstiryID.contains(student.getUniversityId()))
          .toList();
      statistics.setStudentsNumber(profileStudent.size());
      OptionalDouble avgExamScore = profileStudent.stream()
          .mapToDouble(Student::getAvgExamScore)
          .average();
      statistics.setAvgExamScore(0);
      avgExamScore.ifPresent(value -> statistics.setAvgExamScore(
          (float) BigDecimal.valueOf(value).setScale(2, RoundingMode.HALF_UP).doubleValue()));
    });
    return statisticsList;
  }

}
