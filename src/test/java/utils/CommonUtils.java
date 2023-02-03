package utils;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import tests.basetest.BaseTest;

public class CommonUtils extends BaseTest {
    public  static String getBase64(){
        return ((TakesScreenshot) driver).getScreenshotAs(OutputType.BASE64);
    }
}
