package models;


import jakarta.xml.bind.annotation.*;

import java.util.Date;
import java.util.List;

@XmlRootElement(name = "root")
@XmlAccessorType(XmlAccessType.FIELD)
public class FullInfo {
    @XmlElementWrapper(name = "StudentsInfo")
    @XmlElement(name = "studentEntry")
    private List<Student> studentList;
    @XmlElementWrapper(name = "UniversityInfo")
    @XmlElement(name = "universityEntry")
    private List<University> universityList;
    @XmlElementWrapper(name = "StatisticsInfo")
    @XmlElement(name = "statisticsEntry")
    private List<Statistics> statisticsList;

    @XmlElement(name = "createdAt")
    private Date date;

    public FullInfo(){

    }


    public List<Student> getStudentList() {
        return studentList;
    }

    public FullInfo setStudentList(List<Student> studentList) {
        this.studentList = studentList;
        return this;
    }

    public List<University> getUniversityList() {
        return universityList;
    }

    public FullInfo setUniversityList(List<University> universityList) {
        this.universityList = universityList;
        return this;
    }

    public List<Statistics> getStatisticsList() {
        return statisticsList;
    }

    public FullInfo setStatisticsList(List<Statistics> statisticsList) {
        this.statisticsList = statisticsList;
        return this;
    }

    public Date getDate() {
        return date;
    }

    public FullInfo setDate(Date date) {
        this.date = date;
        return this;
    }
}
