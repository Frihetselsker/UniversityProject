package models;

import com.google.gson.annotations.SerializedName;

public class Student {
    @SerializedName("ФИО Студента")
    String fullName;
    @SerializedName("ID Университета")
    String universityId;
    @SerializedName("Номер текущего курса")
    int currentCourseNumber;
    @SerializedName("Средний балл студента")
    float avgExamScore;

    public Student() {
    }

    public String getFullName() {
        return fullName;
    }


    public String getUniversityId() {
        return universityId;
    }


    public int getCurrentCourseNumber() {
        return currentCourseNumber;
    }


    public float getAvgExamScore() {
        return avgExamScore;
    }


    @Override
    public String toString() {
        return "models.Student{" +
                "fullName='" + fullName + '\'' +
                ", universityId='" + universityId + '\'' +
                ", currentCourseNumber=" + currentCourseNumber +
                ", avgExamScore=" + avgExamScore +
                '}';
    }

    public Student setFullName(String fullName) {
        this.fullName = fullName;
        return this;
    }

    public Student setUniversityId(String universityId) {
        this.universityId = universityId;
        return this;
    }

    public Student setCurrentCourseNumber(int currentCourseNumber) {
        this.currentCourseNumber = currentCourseNumber;
        return this;
    }

    public Student setAvgExamScore(float avgExamScore) {
        this.avgExamScore = avgExamScore;
        return this;
    }
}
