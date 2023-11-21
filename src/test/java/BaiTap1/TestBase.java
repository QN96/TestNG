package BaiTap1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

public class TestBase {

    protected static WebDriver driver;

    @BeforeClass
    public static void setUp() {
        // Khởi tạo WebDriver (ở đây sử dụng ChromeDriver)
        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");
        driver = new ChromeDriver();

        // Bước 1: Truy cập trang chủ
        driver.get("https://rise.fairsketch.com");

        // Bước 2: Login
        login("client@demo.com", "riseDemo");
    }

    @AfterClass
    public static void tearDown() {
        // Đóng trình duyệt sau khi hoàn thành các test
        driver.quit();
    }

    private static void login(String username, String password) {
        // Điền thông tin đăng nhập
        WebElement usernameField = driver.findElement(By.id("username"));
        WebElement passwordField = driver.findElement(By.id("password"));

        usernameField.sendKeys(username);
        passwordField.sendKeys(password);

        // Submit form để đăng nhập
        driver.findElement(By.id("loginButton")).click();
    }

    // Các test cases sẽ extend từ TestBase
}


