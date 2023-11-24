package THContact.Tcs;

import THContact.commons.TestListener;
import THContact.PageObject.ContactDetailPage;
import THContact.PageObject.ContactPage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;
import THContact.PageObject.*;

import java.util.concurrent.TimeUnit;

@Listeners(TestListener.class)
public class Access {
    public static WebDriver driver;

    @Parameters({"browser","appURL"})
    @BeforeTest
    public static void loadPage(String browserName, String appURL) {
        if (browserName.equalsIgnoreCase("chrome")){
            WebDriverManager.chromedriver().setup();
            driver=new ChromeDriver();

        } else if (browserName.equalsIgnoreCase("firefox")) {
            WebDriverManager.chromedriver().setup();
            driver=new FirefoxDriver();
        }
        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get(appURL);
    }

    @Test (priority = 0)
    public void Test_Login() {

        LoginPage.Login(driver, "admin@demo.com", "riseDemo");
    }
    @Test (priority = 1)
    public void Test_Home() {
        HomePage.Home(driver);
    }
    @Test (priority = 2)
    public void Test_Contact(){

        ContactPage.Contact(driver);
    }
    @Test (priority = 3)
    public void Test_ContactDetail(){

        ContactDetailPage.ContactDetails(driver);
    }
    @AfterTest
    public void afterTest() {
        driver.quit();
    }
}
