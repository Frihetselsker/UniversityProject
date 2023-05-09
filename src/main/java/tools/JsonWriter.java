package tools;

import models.FullInfo;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.logging.Level;
import java.util.logging.Logger;

public class JsonWriter {
    private final static Logger logger = Logger.getLogger(JsonWriter.class.getName());

    private JsonWriter(){

    }

    public static void createJsonRequest(FullInfo fullInfo){
        logger.log(Level.INFO, "JSON writing has started");
        try{
            Files.createDirectory(Paths.get("jsonReqs"));
            logger.log(Level.INFO, "Directory was created successfully");
        } catch (IOException e){
            logger.log(Level.FINE, "Directory is already created");
        }
        
        writeStudents(fullInfo);
        writeUniversities(fullInfo);
        writeStatistics(fullInfo);
        
        logger.log(Level.INFO, "JSON writing completed successfully");
    }

    private static void writeStatistics(FullInfo fullInfo) {
        String statisticsJson = JsonUtil.listToJson(fullInfo.getStatisticsList());
        try {
            FileOutputStream outputStream = new FileOutputStream("jsonReqs/statistics" + fullInfo.getDate().getTime() + ".json");
            outputStream.write(statisticsJson.getBytes(StandardCharsets.UTF_8));
        } catch (IOException e){
            logger.log(Level.SEVERE, "StatisticsJSON writing failed");
        }
    }

    private static void writeUniversities(FullInfo fullInfo) {
        String universitiesJson = JsonUtil.listToJson(fullInfo.getUniversityList());
        try {
            FileOutputStream outputStream = new FileOutputStream("jsonReqs/universities" + fullInfo.getDate().getTime() + ".json");
            outputStream.write(universitiesJson.getBytes(StandardCharsets.UTF_8));
        } catch (IOException e){
            logger.log(Level.SEVERE, "UniversitiesJSON writing failed");
        }
    }

    private static void writeStudents(FullInfo fullInfo) {
        String studentsJson = JsonUtil.listToJson(fullInfo.getStudentList());
        try {
            FileOutputStream outputStream = new FileOutputStream("jsonReqs/students" + fullInfo.getDate().getTime() + ".json");
            outputStream.write(studentsJson.getBytes(StandardCharsets.UTF_8));
        } catch (IOException e){
            logger.log(Level.SEVERE, "StudentsJSON writing failed");
        }
    }
}
