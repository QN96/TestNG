package nhutester.TestScenarios;

import nhutester.commons.TestListener;
import nhutester.Base.BaseSetup;
import nhutester.pageObject.LoginPage;
import nhutester.pageObject.HomePage;
import nhutester.Utilities.PropertiesFile;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;

@Listeners(TestListener.class)
public class TC01_LoginLogout extends BaseSetup {
    private WebDriver driver;
    private LoginPage loginPage;
    private HomePage homePage;
    @BeforeClass
    public void setUp() {
        driver = getDriver();
        PropertiesFile.setPropertiesFile();
    }

    @Test (priority = 0)
    public void Test_Login() {
        loginPage.Login(driver, PropertiesFile.getPropValue("username"), PropertiesFile.getPropValue("password"));
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


//import nhutester.commons.TestListener;
//import nhutester.Base.BaseSetup;
//import nhutester.pageObject.LoginPage;
//import nhutester.pageObject.HomePage;
//import org.openqa.selenium.WebDriver;
//import org.testng.annotations.*;
//
//@Listeners(TestListener.class)
//public class TC01_LoginLogout extends BaseSetup {
//    private WebDriver driver;
//    @BeforeClass
//    public void setUp() {
//        driver = getDriver();
//    }
//    public LoginPage loginPage;
//    public HomePage homePage;
//
//    @Test (priority = 0)
//    public void Test_Login() {
//        loginPage.Login(driver, "Admin", "admin123");
//    }
//    @Test (priority = 1)
//    public void Test_Logout(){
//        homePage.Logout(driver);
//    }
//    @AfterTest
//    public void afterTest() throws Exception {
//        tearDown();
//    }
//}

