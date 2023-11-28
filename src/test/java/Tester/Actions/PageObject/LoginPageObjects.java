package Tester.Actions.PageObject;

import Tester.Interfaces.LoginPageUI;
import Tester.Actions.Commons.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

//Chua tất cả actions dưới dạng method đó: click/select/verify/getText
public class LoginPageObjects {

    WebDriver driver;
    private BasePage basePage=new BasePage(this.driver);
    //PageActions
    public static void Login(WebDriver driver , String username, String password) {
        LoginPageUI.txtbx_UserName(driver).sendKeys(username);
        LoginPageUI.txtbx_Password(driver).sendKeys(password);
        LoginPageUI.btn_Login(driver).click();



    }
}

