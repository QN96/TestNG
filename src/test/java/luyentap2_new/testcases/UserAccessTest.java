package luyentap2_new.testcases;

import LuyenTap2.commons.TestListener;
import io.github.bonigarcia.wdm.WebDriverManager;
import luyentap2_new.pageObject.ListPage;
import luyentap2_new.pageObject.TaskPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;
import nhutester.pageObject.*;
import java.util.concurrent.TimeUnit;

@Listeners(TestListener.class)

public class UserAccessTest {
    private static WebDriver driver;
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
    public void Test_Task(){
        TaskPage.Task(driver, "Bug 1", "Bug không login được", "23-11-2023", "24-11-2023" );
    }
    @Test (priority = 2)
    public void Test_List() throws InterruptedException {
        ListPage.List(driver,"Bug 1");
    }
    @AfterTest
    public void afterTest() {
        driver.quit();
    }

}
