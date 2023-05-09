package models;

import com.google.gson.annotations.SerializedName;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;


@XmlAccessorType(XmlAccessType.FIELD)
public class Student {
    @SerializedName("ФИО Студента")
    @XmlElement(name = "fullName")
    String fullName;
    @SerializedName("ID Университета")
    @XmlElement(name = "universityID")
    String universityId;
    @SerializedName("Номер текущего курса")
    @XmlElement(name = "courseNumber")
    int currentCourseNumber;
    @SerializedName("Средний балл студента")
    @XmlElement(name = "avgScore")
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
