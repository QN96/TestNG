package Module2.Actions.pageObject;

import Module2.Interfaces.ListPageUI;
import Module2.Interfaces.PaymentPageUI;
import Module2.Actions.commons.BasePage;
import org.openqa.selenium.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ListPage {
    private static WebElement element = null;
    static BasePage basePage=new BasePage();
    public static void List(WebDriver driver, String invoice1, String note) throws InterruptedException {
        Thread.sleep(3000);
        basePage.clickToElement(driver, ListPageUI.payment_page);
        basePage.sendKeyToElement1(driver, ListPageUI.Search,invoice1);
        Thread.sleep(3000);
        //basePage.sendKeyToElement1(driver, ListPageUI.Search, String.valueOf(Keys.ENTER));
        basePage.clickToElement(driver, ListPageUI.detail);
        basePage.clickToElement(driver, ListPageUI.tab_payments);
        Thread.sleep(3000);
        basePage.sendKeyToElement1(driver, ListPageUI.Search_detail,note);
        Thread.sleep(3000);
        //basePage.sendKeyToElement1(driver, ListPageUI.Search_detail, String.valueOf(Keys.ENTER));
        basePage.clickToElement(driver, ListPageUI.delete);
    }
}
