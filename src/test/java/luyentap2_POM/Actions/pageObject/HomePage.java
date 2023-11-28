package luyentap2_POM.Actions.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import luyentap2_POM.Interfaces.HomePageUI;
public class HomePage {
    private static WebElement element = null;
    public static void Home(WebDriver driver) {
        HomePageUI.avt(driver).click();
        HomePageUI.logout(driver).click();
    }
}
