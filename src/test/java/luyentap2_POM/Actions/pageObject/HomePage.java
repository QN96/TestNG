package luyentap2_POM.Actions.pageObject;

import luyentap2_POM.Actions.commons.BasePage;
import luyentap2_POM.Interfaces.HomePageUI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
public class HomePage {
    private static WebElement element = null;
    //menu
    static BasePage basePage=new BasePage();
    //Page Actions
    public static void Logout(WebDriver driver){
        basePage.clickToElement(driver,HomePageUI.avt);
        basePage.clickToElement(driver,HomePageUI.logout);
    }
}
