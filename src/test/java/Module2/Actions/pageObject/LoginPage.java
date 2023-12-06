package Module2.Actions.pageObject;


import Module2.Actions.commons.BasePage;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import Module2.Interfaces.LoginPageUI;
import org.openqa.selenium.WebElement;

public class LoginPage {

    WebDriver driver;
    private static BasePage basePage=new BasePage();
    //PageActions
    public static void Login(WebDriver driver , String username, String password) {
        basePage.sendKeyToElement(driver,LoginPageUI.xpathUserName,username);
        basePage.sendKeyToElement(driver,LoginPageUI.xpathPassword,password);
        basePage.clickToElement(driver,LoginPageUI.xpathLoginButton);

    }

}

