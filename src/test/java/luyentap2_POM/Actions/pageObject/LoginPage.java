package luyentap2_POM.Actions.pageObject;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import luyentap2_POM.Interfaces.LoginPageUI;
public class LoginPage {
    private static WebElement element = null;
    public static void Login(WebDriver driver , String username, String password) {
        LuyenTap2.pageObject.LoginPage.txtbx_Email(driver).sendKeys(Keys.chord(Keys.COMMAND, "a"));
        LoginPageUI.txtbx_Email(driver).sendKeys(username);
        LuyenTap2.pageObject.LoginPage.txtbx_Password(driver).sendKeys(Keys.chord(Keys.COMMAND, "a"));
        LoginPageUI.txtbx_Password(driver).sendKeys(password);
        LoginPageUI.btn_Login(driver).click();
    }
}

