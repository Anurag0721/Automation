package pages;


import locators.HomePageLocators;
import locators.LoginPageLocators;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

public class HomePage extends BasePage {
    @FindBy(xpath = HomePageLocators.HOME_PAGE_SIGN_IN)
     WebElement homePageSignIn;

    @FindBy(xpath = HomePageLocators.ACCOUNT_NAME)
     WebElement accountName;

    public HomePage(WebDriver driver){
        super(driver);
    }

    public void clickOnHomePageSignIn(){
        homePageSignIn.click();
    }
    public void validateUserLogin(){
        wait.until(ExpectedConditions.visibilityOf(accountName));
        String actualValue = accountName.getText();
        Assert.assertEquals(actualValue,"Hello, Anurag");
    }
}
