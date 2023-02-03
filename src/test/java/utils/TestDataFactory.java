package utils;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;



public class TestDataFactory {
    public static Object loadTestData(){
        JsonParser parser = new JsonParser();
        Object obj = parser.parse(System.getenv("user.dir")+"/src/test/resources/TestData/data.json");
        JsonObject jObj = new JsonObject();
        return obj;
    }

}
