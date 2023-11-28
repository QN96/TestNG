package luyentap2_POM.Interfaces;

import org.openqa.selenium.*;

public class HomePageUI {
    private static WebElement element = null;
    WebDriver driver;

    public HomePageUI(WebDriver driver) {
        this.driver = driver;
    }

    //Web locator
    static By avt = By.xpath("//a[@id='user-dropdown']");
    static By logout = By.xpath("//a[text()=' Sign Out']");

    public static WebElement avt(WebDriver driver) throws NoSuchElementException {
        try {
            element = driver.findElement(avt);
        } catch (Exception e) {
            System.out.println("Exceptions Caught" + e.getMessage());
        }
        return element;
    }
    public static WebElement logout(WebDriver driver) throws NoSuchElementException {
        try {
            element = driver.findElement(logout);
        } catch (Exception e) {
            System.out.println("Exceptions Caught" + e.getMessage());
        }
        return element;
    }
}
