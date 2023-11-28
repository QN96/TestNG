package Tester.Actions.PageObject;

import Tester.Interfaces.HomePageUI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
public class HomePageObjects {
    private static WebElement element = null;
    //menu

    //Page Actions
    public static void Logout(WebDriver driver){
        HomePageUI.text_Dashboard(driver).isDisplayed();
        HomePageUI.menu_Profile(driver).click();
        HomePageUI.menu_LogOut(driver).click();
    }
}
