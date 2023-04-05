package tools;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import models.Student;
import models.University;

import java.util.List;

public class JsonUtil {
    private JsonUtil(){
    }

    public static String studentToJson(Student s){
        return new GsonBuilder().setPrettyPrinting().create().toJson(s);
    }
    public static Student jsonToStudent(String json){
        return new Gson().fromJson(json, Student.class);
    }


    public static String universityToJson(University u){
        return new GsonBuilder().setPrettyPrinting().create().toJson(u);
    }
    public static University jsonToUniversity(String json){
        return new Gson().fromJson(json, University.class);
    }


    public static List<Student> jsonToStudentList(String json){
        return new Gson().fromJson(json, new TypeToken<List<Student>>() {}.getType());
    }
    public static String studentListToJson(List<Student> studentList){
        return new GsonBuilder().setPrettyPrinting().create().toJson(studentList);
    }


    public static List<University> jsonToUniversityList(String json){
        return new Gson().fromJson(json, new TypeToken<List<University>>() {}.getType());
    }
    public static String universityListToJson(List<University> universityList){
        return new GsonBuilder().setPrettyPrinting().create().toJson(universityList);
    }
}
