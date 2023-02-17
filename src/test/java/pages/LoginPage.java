package pages;

import dto.AmazonDTO;
import io.netty.handler.codec.base64.Base64Decoder;
import locators.LoginPageLocators;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class LoginPage extends BasePage {

    @FindBy(xpath = LoginPageLocators.SIGN_IN_EMAIL)
    WebElement signInEmail;
    @FindBy(xpath = LoginPageLocators.SIGN_IN_CONTINUE)
    WebElement signInContinue;
    @FindBy(xpath = LoginPageLocators.SIGN_IN_PASSWORD)
    WebElement signInPassword;
    @FindBy(xpath = LoginPageLocators.SIGN_IN_SUBMIT)
    WebElement signInSubmit;

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public void loginToApplication(AmazonDTO amazonDTO){
        wait.until(ExpectedConditions.visibilityOf(signInEmail));
        signInEmail.sendKeys(amazonDTO.getEmail());
        signInContinue.click();
        wait.until(ExpectedConditions.visibilityOf(signInPassword));
        signInPassword.sendKeys(amazonDTO.getPassword());
        signInSubmit.click();
    }


}
