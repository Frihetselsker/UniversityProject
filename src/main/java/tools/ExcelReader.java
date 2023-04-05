package tools;

import enums.StudyProfile;
import models.Student;
import models.University;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ExcelReader {
    private ExcelReader(){
    }
    public static List<Student> studentsReader(String fileName) throws IOException{
        FileInputStream fis = new FileInputStream(fileName);
        XSSFWorkbook workbook = new XSSFWorkbook(fis);
        List<Student> studentList = new ArrayList<>();
        XSSFSheet sheet = workbook.getSheet("Студенты");
        Iterator<Row> iterator = sheet.iterator();
        iterator.next();
        while(iterator.hasNext()){
            Row row = iterator.next();
            Student student = new Student();
            student.setUniversityId(row.getCell(0).getStringCellValue());
            student.setFullName(row.getCell(1).getStringCellValue());
            student.setCurrentCourseNumber((int)row.getCell(2).getNumericCellValue());
            student.setAvgExamScore((float)row.getCell(3).getNumericCellValue());
            studentList.add(student);
        }
        fis.close();
        return studentList;
    }
    public static List<University> universitiesReader(String fileName) throws IOException{
        FileInputStream fis = new FileInputStream(fileName);
        XSSFWorkbook workbook = new XSSFWorkbook(fis);
        List<University> universityList = new ArrayList<>();
        XSSFSheet sheet = workbook.getSheet("Университеты");
        Iterator<Row> iterator = sheet.iterator();
        iterator.next();
        while(iterator.hasNext()){
            Row row = iterator.next();
            University university = new University();
            university.setId(row.getCell(0).getStringCellValue());
            university.setFullName(row.getCell(1).getStringCellValue());
            university.setShortName(row.getCell(2).getStringCellValue());
            university.setYearOfFoundation((int)row.getCell(3).getNumericCellValue());
            university.setMainProfile(StudyProfile.valueOf(row.getCell(4).getStringCellValue()));
            universityList.add(university);
        }
        fis.close();
        return universityList;
    }
}
