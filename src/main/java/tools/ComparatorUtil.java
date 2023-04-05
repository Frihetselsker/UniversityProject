package tools;

import comparators.students.*;
import comparators.universities.*;
import enums.StudentsComparators;
import enums.UniversityComparators;

public class ComparatorUtil {
    private ComparatorUtil(){
    }

    public static StudentComparator getStudentComparator(StudentsComparators comparator){
        return switch (comparator) {
            case NAME -> new StudentFullNameComparator();
            case COURSE -> new StudentCurrentCourseNumberComparator();
            case UNIVERSITY_ID -> new StudentUniversityIDComparator();
            case EXAM_SCORE -> new StudentAvgExamScoreComparator();
            default -> new StudentFullNameComparator();
        };
    }

    public static UniversityComparator getUniversityComparator(UniversityComparators comparator){
        return switch (comparator) {
            case ID -> new UniversityIDComparator();
            case FULL_NAME -> new UniversityFullNameComparator();
            case YEAR -> new UniversityYearFoundationComparator();
            case PROFILE -> new UniversityStudyProfileComparator();
            case SHORT_NAME -> new UniversityShortNameComparator();
            default -> new UniversityFullNameComparator();
        };
    }
}
