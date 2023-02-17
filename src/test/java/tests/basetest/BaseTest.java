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
    public static void beforeSuite() throws IOException {
        ConfigUtils.loadTestProperties();
        System.out.println("Test properties Loaded");
        TestDataFactory.loadTestData();
        System.out.println("Test data Loaded");
    }
}
