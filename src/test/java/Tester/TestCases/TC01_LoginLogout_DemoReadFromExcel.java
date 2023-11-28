package Tester.TestCases;

import Tester.Actions.Commons.BaseTest;
import Tester.Utilities.Listeners.TestListener;
import Tester.Actions.PageObject.HomePageObjects;
import Tester.Actions.PageObject.LoginPageObjects;
import Tester.Utilities.Helpers.ExcelHelpers;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;

@Listeners(TestListener.class)
public class TC01_LoginLogout_DemoReadFromExcel extends BaseTest {
    private WebDriver driver;
    private LoginPageObjects loginPage;
    private HomePageObjects homePage;

    @BeforeClass
    public void setUp() {
        driver = getDriver();

    }

    @Test (priority = 0)
    public void Test_Login() throws Exception {
        //Setup đường dẫn của file excel
        ExcelHelpers excel=new ExcelHelpers();
        excel.setExcelFile("src/test/java/Tester/TestData/Login.xlsx", "Sheet1");
        loginPage.Login(driver, excel.getCellData("username",1),excel.getCellData("password",1));
        Thread.sleep(1000);
    }

    @Test (priority = 1)
    public void Test_Logout(){
        homePage.Logout(driver);
    }
    @AfterClass
    public void afterTest() throws Exception {
        tearDown();
    }
}

