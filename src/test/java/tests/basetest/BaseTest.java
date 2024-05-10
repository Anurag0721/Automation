package tests.basetest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import utils.CommonUtils;

import java.time.Duration;

import static reporter.TestReporter.addTestStepPassed;

public class BaseTest {
    public static WebDriver driver;
    private static ChromeOptions options;
//    public static WebDriverWait wait;
    @BeforeClass(alwaysRun = true)
    public void beforeChildClass(){
        options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Nikita\\Anurag_IJ\\Automation\\chromedriver.exe");
        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        System.out.println("beforeChildClass");
    }

    @AfterClass(alwaysRun = true)
    public void afterChildClass(){
        driver.quit();
        System.out.println("afterChildClass");
    }
}
