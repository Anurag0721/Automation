package tests.test;


import dto.AmazonDTO;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;
import tests.basetest.BaseUiTest;
import utils.ConfigUtils;
import utils.TestDataFactory;

import static reporter.TestReporter.addTestStepPassed;

public class Demo extends BaseUiTest {

    static HomePage homePage;
    static LoginPage loginPage;

    @BeforeClass(alwaysRun = true)
    public static void beforeClass(){
        homePage = new HomePage(driver);
        loginPage = new LoginPage(driver);
        driver.get(ConfigUtils.getEnvironmentVariable("website_url"));
    }

    @Test(groups = {"test"}, enabled=true)
    public static void firstTest(){
        AmazonDTO amazonDTO = (AmazonDTO) TestDataFactory.getTestData("amazon");
        homePage.clickOnHomePageSignIn();
        addTestStepPassed("Home Page Sign in got clicked");
        loginPage.loginToApplication(amazonDTO);
        addTestStepPassed("Credentials entered");
        homePage.validateUserLogin();
        addTestStepPassed("User is Successfully Logged in");
    }
}
