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
    public static String listToJson(List<?> list){
        return new GsonBuilder().setPrettyPrinting().create().toJson(list);
    }
}
