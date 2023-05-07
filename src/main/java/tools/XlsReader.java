package tools;

import enums.StudyProfile;
import java.util.logging.Level;
import java.util.logging.Logger;
import models.Student;
import models.University;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class XlsReader {
    private XlsReader(){
    }

    private final static Logger logger = Logger.getLogger(XlsReader.class.getName());
    public static List<Student> studentsReader(String fileName){
        logger.log(Level.INFO, "Reading students from Excel file started");
        List<Student> studentList = new ArrayList<>();
        try {
            FileInputStream fis = new FileInputStream(fileName);
            XSSFWorkbook workbook = new XSSFWorkbook(fis);
            XSSFSheet sheet = workbook.getSheet("Студенты");
            Iterator<Row> iterator = sheet.iterator();
            iterator.next();
            while (iterator.hasNext()) {
                Row row = iterator.next();
                Student student = new Student();
                student.setUniversityId(row.getCell(0).getStringCellValue());
                student.setFullName(row.getCell(1).getStringCellValue());
                student.setCurrentCourseNumber((int) row.getCell(2).getNumericCellValue());
                student.setAvgExamScore((float) row.getCell(3).getNumericCellValue());
                studentList.add(student);
            }
            fis.close();
        } catch (IOException e){
            logger.log(Level.SEVERE, "Reading students from Excel file failed", e);
            return studentList;
        }
        logger.log(Level.INFO, "Reading students from Excel file executed correctly");
        return studentList;
    }
    public static List<University> universitiesReader(String fileName){
        logger.log(Level.INFO, "Reading universities from Excel file started");
        List<University> universityList = new ArrayList<>();
        try {
            FileInputStream fis = new FileInputStream(fileName);
            XSSFWorkbook workbook = new XSSFWorkbook(fis);
            XSSFSheet sheet = workbook.getSheet("Университеты");
            Iterator<Row> iterator = sheet.iterator();
            iterator.next();
            while (iterator.hasNext()) {
                Row row = iterator.next();
                University university = new University();
                university.setId(row.getCell(0).getStringCellValue());
                university.setFullName(row.getCell(1).getStringCellValue());
                university.setShortName(row.getCell(2).getStringCellValue());
                university.setYearOfFoundation((int) row.getCell(3).getNumericCellValue());
                university.setMainProfile(
                    StudyProfile.valueOf(row.getCell(4).getStringCellValue()));
                universityList.add(university);
            }
            fis.close();
        } catch (IOException e) {
            logger.log(Level.SEVERE, "Reading universities from Excel file failed", e);
            return universityList;
        }
        logger.log(Level.INFO, "Reading universities from Excel file executed correctly");
        return universityList;
    }
}
