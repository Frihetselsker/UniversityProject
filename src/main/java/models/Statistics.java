package models;

import enums.StudyProfile;

public class Statistics {
    StudyProfile studyProfile;
    float avgExamScore;
    int studentsNumber;
    int uniNumber;
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
