package reporter;

import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.model.Media;
import extent.ExtentManager;
import org.openqa.selenium.TakesScreenshot;

import static utils.CommonUtils.getBase64;

public class TestReporter {

    public static void addTestStepPassed(String description){
        ExtentManager.getTest().log(Status.PASS,description);
    }

    public static void addTestStepFailed(String description, String base64){
        ExtentManager.getTest().fail(description, MediaEntityBuilder.createScreenCaptureFromBase64String(base64).build());
    }
}
