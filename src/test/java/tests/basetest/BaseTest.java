package tests.basetest;


import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import utils.CommonUtils;
import utils.ConfigUtils;
import utils.TestDataFactory;

import java.io.FileNotFoundException;
import java.io.IOException;

public class BaseTest {
    @BeforeSuite(alwaysRun = true)
    public static void beforeSuite()  {
        try{
            ConfigUtils.loadTestProperties();
            TestDataFactory.loadTestData();
        }
        catch(Exception e){
            e.printStackTrace();
        };
    }
}
