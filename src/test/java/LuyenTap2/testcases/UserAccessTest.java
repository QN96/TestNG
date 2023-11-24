package LuyenTap2.testcases;

import LuyenTap2.commons.TestListener;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import LuyenTap2.pageObject.*;
import LuyenTap2.userActions.*;
@Listeners(TestListener.class)

public class UserAccessTest {
    private static WebDriver driver;
    @BeforeTest
    public void beforeTest() {
        driver = new ChromeDriver();
    }

    @Test(priority = 1)
    public void Test_Login() {
        LoginPage.loadPage(driver);
        //driver.manage().window().maximize();
        PageActions.Login(driver, "admin@demo.com", "riseDemo");
    }

    @Test(priority = 2)
    public void Test_Task() throws InterruptedException {
        PageActions.TaskPage(driver, "Bug nè", "Không thể login", "22-11-2023", "23-11-2023");
    }

    @Test(priority = 3)
    public void Test_List() throws InterruptedException {
        PageActions.ListPage(driver, "Bug nè", "comment 1", "comment 2" );
    }

    @AfterTest
    public void afterTest() {
        driver.quit();
    }
}
