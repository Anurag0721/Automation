package listener;

import extent.ExtentManager;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import utils.CommonUtils;

import static reporter.TestReporter.addTestStepFailed;

public class ExtentListeners implements ITestListener {


    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
        ITestListener.super.onTestFailedButWithinSuccessPercentage(result);
    }

    @Override
    public void onFinish(ITestContext context) {
        ExtentManager.flushTest();
    }

    @Override
    public void onTestFailure(ITestResult result) {
        String base64 = CommonUtils.getBase64();
        addTestStepFailed(result.getThrowable().toString(),base64);
//          System.out.println("Test Got Failed");
    }

    @Override
    public void onTestSkipped(ITestResult result) {
        ITestListener.super.onTestSkipped(result);
    }

    @Override
    public void onStart(ITestContext context) {
        System.out.println("*****Execution started********");
    }

    @Override
    public void onTestStart(ITestResult result) {
        System.out.println(result.getMethod().getMethodName());
        ExtentManager.createTest(result.getMethod().getMethodName(), result.getMethod().getMethodName());
        System.out.println("testStarted");
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        System.out.println("Test Got Passed Successfully");
    }

    @Override
    public void onTestFailedWithTimeout(ITestResult result) {
        ITestListener.super.onTestFailedWithTimeout(result);
    }
}
