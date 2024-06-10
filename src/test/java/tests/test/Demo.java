package tests.test;


import lombok.extern.slf4j.Slf4j;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;
import tests.basetest.BaseTest;
import static reporter.TestReporter.addTestStepPassed;
@Slf4j
public class Demo extends BaseTest {

    static HomePage homePage;
    static LoginPage loginPage;

    @BeforeClass(alwaysRun = true)
    public static void beforeClass(){
        homePage = new HomePage(driver);
        loginPage = new LoginPage(driver);
//        driver.get("https://www.amazon.in/");
//        add TestStepPassed("Amazon Site is Launched");
        System.out.println("beforeClass");
    }

    @Test(groups = {"test"}, enabled=false)
    public static void firstTest(){
        homePage.clickOnHomePageSignIn();
//        loginPage.loginToApplication();
//        homePage.validateUserLogin();
    }

    @Test(groups = {"test"}, enabled=true)
    public static void secondTest() throws InterruptedException {
//        WebDriver driver = new ChromeDriver();
        addTestStepPassed("Chrome Driver Launched");
        log.info("Chrome Driver Launched");
        driver.get("https://www.google.com");
        addTestStepPassed("Google Site is Launched");
        log.info("Google Site is Launched");
        Assert.assertEquals(driver.getTitle().toLowerCase(),"google");
        log.info("Title Validated Successfully");
        driver.manage().window().maximize();
        Thread.sleep(3000);
    }

}
