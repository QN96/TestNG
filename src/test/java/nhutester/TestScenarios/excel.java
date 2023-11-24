package nhutester.TestScenarios;

import nhutester.Base.BaseSetup;
import nhutester.commons.TestListener;
import nhutester.pageObject.HomePage;
import nhutester.pageObject.LoginPage;
import nhutester.Utilities.ExcelHelpers;
import nhutester.Utilities.PropertiesFile;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(TestListener.class)
public class excel extends BaseSetup {
    private WebDriver driver;
    private LoginPage loginPage;
    private HomePage homePage;

    @BeforeClass
    public void setUp() {
        driver = getDriver();

    }


    @Test (priority = 0)
    public void Test_Login() throws Exception {
        //Setup đường dẫn của file excel
        ExcelHelpers excel=new ExcelHelpers();
        excel.setExcelFile("/src/test/java/nhutester/Data/Login.xlsx", "Sheet1");
        loginPage.Login(driver, excel.getCellData("username",2),excel.getCellData("password",2));
        Thread.sleep(1000);

    }
    @Test (priority = 1)
    public void Test_Logout(){
        homePage.Logout(driver);
    }
    @AfterTest
    public void afterTest() throws Exception {
        tearDown();
    }
}


