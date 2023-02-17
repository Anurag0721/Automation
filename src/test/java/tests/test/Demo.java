package tests.test;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;
import tests.basetest.BaseUiTest;
import utils.ConfigUtils;

import static reporter.TestReporter.addTestStepPassed;

public class Demo extends BaseUiTest {

    static HomePage homePage;
    static LoginPage loginPage;

    @BeforeClass(alwaysRun = true)
    public static void beforeClass(){
        homePage = new HomePage(driver);
        loginPage = new LoginPage(driver);
        driver.get(ConfigUtils.getEnvironmentVariable("website_url"));
//        addTestStepPassed("Amazon Site is Launched");
        System.out.println("beforeClass");
    }

    @Test(groups = {"test"}, enabled=true)
    public static void firstTest(){
        homePage.clickOnHomePageSignIn();
        loginPage.loginToApplication();
        homePage.validateUserLogin();
    }

    @Test(groups = {"test"}, enabled=false)
    public static void secondTest() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        addTestStepPassed("Chrome Driver Launched");
        driver.get("https://www.google.com");
        addTestStepPassed("Google Site is Launched");
        driver.manage().window().maximize();
        Thread.sleep(3000);
        driver.close();
        addTestStepPassed("Chrome Driver Closed");
    }

}
