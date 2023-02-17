package utils;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import tests.basetest.BaseUiTest;

public class CommonUtils extends BaseUiTest {
    public  static String getBase64(){
        return ((TakesScreenshot) driver).getScreenshotAs(OutputType.BASE64);
    }

}
