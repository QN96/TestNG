package luyentap2_POM.testcases;

import luyentap2_POM.Actions.commons.BaseTest;
import luyentap2_POM.Actions.pageObject.LoginPage;
import luyentap2_POM.Actions.pageObject.HomePage;
import luyentap2_POM.Actions.pageObject.TaskPage;
import luyentap2_POM.Actions.pageObject.ListPage;
import luyentap2_POM.Utilities.Helpers.PropertiesFile;
import luyentap2_POM.Utilities.Listeners.ReportListener;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(ReportListener.class)
public class TC01_Config extends BaseTest {
    //ExtentReports extent=new ExtentReports();
    //ExtentSparkReporter spark=new ExtentSparkReporter("ExtentReport.html");
    private WebDriver driver;
    @BeforeClass
    public void setUp() {
        driver = getDriver();
        PropertiesFile.setPropertiesFile();
        //extent.attachReporter(spark);

    }

    @Test (priority = 0)
    public void Test_Login() {
        LoginPage.Login(driver, PropertiesFile.getPropValue("username"), PropertiesFile.getPropValue("password"));
//        ExtentTest test=extent.createTest("Verify log in");
//        test.log(Status.PASS,"user login");
//        test.pass("login verified");
    }

    @Test (priority = 1)
    public void Test_Task() throws InterruptedException {
        TaskPage.Task(driver, "Bug 1", "Bug không login được", "23-11-2023", "24-11-2023" );
    }
    @Test (priority = 2)
    public void Test_List() throws InterruptedException {
        ListPage.List(driver,"Bug 1");
    }
    @AfterClass
    public void afterTest() throws Exception {
        tearDown();
        //extent.flush();
    }
}

