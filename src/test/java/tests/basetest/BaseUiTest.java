package tests.basetest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseUiTest extends BaseTest{
    public static WebDriver driver;
    private static ChromeOptions options;
    @BeforeClass(alwaysRun = true)
    public static void beforeChildClass(){
        options = new ChromeOptions();
        options.addArguments();
        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
    }

    @AfterClass(alwaysRun = true)
    public static void afterChildClass(){
        driver.quit();
    }
}
