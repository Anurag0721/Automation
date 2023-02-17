package utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ConfigUtils {
    private static Properties testProperties;

    public static void loadTestProperties() throws IOException {
        File file = new File(System.getProperty("user.dir")+"\\src\\test\\resources\\test.properties");
        InputStream is = new FileInputStream(file);
        testProperties = new Properties();
        testProperties.load(is);
        is.close();
    }

    public static String getEnvironmentVariable(String propertyName){
        return testProperties.getProperty(propertyName);
    }
}
