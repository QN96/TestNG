package Tester.TestCases;

import Tester.Utilities.Listeners.ReportListener;
import Tester.Utilities.Listeners.TestListener;
import Tester.Actions.Commons.BaseTest;
import Tester.Actions.PageObject.LoginPageObjects;
import Tester.Actions.PageObject.HomePageObjects;
import Tester.Utilities.Helpers.PropertiesFile;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;

@Listeners(ReportListener.class)
public class TC01_LoginLogout extends BaseTest {
    //ExtentReports extent=new ExtentReports();
    //ExtentSparkReporter spark=new ExtentSparkReporter("ExtentReport.html");
    private WebDriver driver;
    private LoginPageObjects loginPage;
    private HomePageObjects homePage;
    @BeforeClass
    public void setUp() {
        driver = getDriver();
        PropertiesFile.setPropertiesFile();
        //extent.attachReporter(spark);

    }

    @Test (priority = 0)
    public void Test_Login() {
        loginPage.Login(driver, PropertiesFile.getPropValue("username"), PropertiesFile.getPropValue("password"));
//        ExtentTest test=extent.createTest("Verify log in");
//        test.log(Status.PASS,"user login");
//        test.pass("login verified");
    }
    @Test (priority = 1)
    public void Test_Logout(){
        homePage.Logout(driver);
//        ExtentTest test=extent.createTest("Verify log out");
//        test.log(Status.PASS,"user logout");
//        test.pass("logout verified");
    }
    @AfterClass
    public void afterTest() throws Exception {
        tearDown();
        //extent.flush();
    }
}

