package Module2.testcases;

import Module2.Actions.commons.BaseTest;
import Module2.Actions.pageObject.LoginPage;
import Module2.Actions.pageObject.PaymentPage;
import Module2.Actions.pageObject.ListPage;
import Module2.Utilities.Helpers.PropertiesFile;
import Module2.Utilities.Listeners.ReportListener;
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
    public void Test_Payment() throws InterruptedException {
        PaymentPage.Payment(driver,  "07-12-2023", "200000", "Ghi chú 5" );
    }
    @Test (priority = 2)
    public void Test_List() throws InterruptedException {
        ListPage.List(driver,"INVOICE #20", "Ghi chú 5");
    }

    @AfterClass
    public void afterTest() throws Exception {
        tearDown();
        //extent.flush();
    }
}

