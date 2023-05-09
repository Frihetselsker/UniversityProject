package models;

import enums.StudyProfile;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlTransient;


@XmlAccessorType(XmlAccessType.FIELD)
public class Statistics {
    @XmlElement(name = "universityProfile")
    StudyProfile studyProfile;
    @XmlElement(name = "avgScore")
    float avgExamScore;
    @XmlTransient
    int studentsNumber;
    @XmlTransient
    int uniNumber;
    @XmlTransient
    String uniNames;

    public Statistics(){
    }


    public StudyProfile getStudyProfile() {
        return studyProfile;
    }

    public void setStudyProfile(StudyProfile studyProfile) {
        this.studyProfile = studyProfile;
    }

    public float getAvgExamScore() {
        return avgExamScore;
    }

    public void setAvgExamScore(float avgExamScore) {
        this.avgExamScore = avgExamScore;
    }

    public int getStudentsNumber() {
        return studentsNumber;
    }

    public void setStudentsNumber(int studentsNumber) {
        this.studentsNumber = studentsNumber;
    }

    public int getUniNumber() {
        return uniNumber;
    }

    public void setUniNumber(int uniNumber) {
        this.uniNumber = uniNumber;
    }

    public String getUniNames() {
        return uniNames;
    }

    public void setUniNames(String uniNames) {
        this.uniNames = uniNames;
    }
}
