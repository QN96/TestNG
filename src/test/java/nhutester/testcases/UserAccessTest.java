//package nhutester.testcases;
//
//import nhutester.commons.TestListener;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.Assert;
//import org.testng.annotations.Listeners;
//import org.testng.annotations.Test;
//import org.testng.annotations.BeforeTest;
//import org.testng.annotations.AfterTest;
//import nhutester.pageObject.*;
//import nhutester.userActions.*;
//
//@Listeners(TestListener.class)
//
//public class UserAccessTest {
//    private static WebDriver driver;
//    @BeforeTest
//    public void beforeTest() {
//        //driver = new FirefoxDriver();
//        driver = new ChromeDriver();
//    }
//    @Test
//    public void Test_Login() {
//        //LoginPage.loadPage(driver);
//        //driver.manage().window().maximize();
//        PageActions.Login(driver, "Admin", "admin123");
//        Assert.assertTrue(HomePage.text_Dashboard(driver).isDisplayed());
//    }
//    @Test
//    public void Test_Logout(){
//        PageActions.Logout(driver);
//    }
//    @AfterTest
//    public void afterTest() {
//        driver.quit();
//    }
//}
