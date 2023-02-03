package extent;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import java.util.HashMap;

public class ExtentManager {
     // directory where output is to be printed
    private static final ExtentReports extentReports = new ExtentReports();
    public static HashMap<Integer, ExtentTest> tst = new HashMap<>();
    private static final ExtentReports extent = ExtentManager.createReporter();
    public static ExtentReports createReporter(){
        ExtentSparkReporter spark = new ExtentSparkReporter("target/Spark.html");
        extentReports.attachReporter(spark);
        return extentReports;
    }
    public static ExtentTest getTest(){
        return tst.get((int) Thread.currentThread().getId());
    }
    public static void createTest(String name, String description){
        ExtentTest test = extent.createTest(name, description);
        tst.put((int) Thread.currentThread().getId(),test);
    }

    public static void flushTest(){
        extent.flush();
    }

}



