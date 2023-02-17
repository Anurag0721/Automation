package utils;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.util.JSONPObject;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import dto.AmazonDTO;
import org.json.JSONObject;

import java.io.*;

public class TestDataFactory {
    public static JSONObject testdata = new JSONObject();
    public static ObjectMapper mapper = new ObjectMapper();
    public static void loadTestData() {
        try {
            String fileContent = "";
            File file = new File(System.getProperty("user.dir") + "\\src\\test\\resources\\TestData\\data.json");
            InputStream is = new FileInputStream(file);
            BufferedReader reader = new BufferedReader(new InputStreamReader(is));
            String line = "";
            while ((line = reader.readLine()) != null) {
                fileContent = fileContent.concat(line + "\n");
            }
            is.close();
            reader.close();
            testdata = new JSONObject(fileContent);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static Object getTestData(String data) throws IOException {
        switch (data){
            case "credentials":
                loadTestData();
                return mapper.readValue(testdata.getJSONObject(data).toString(), AmazonDTO.class);
        }
        return null;
    }

}
