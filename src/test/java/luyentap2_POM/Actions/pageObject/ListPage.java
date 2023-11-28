package luyentap2_POM.Actions.pageObject;

import org.openqa.selenium.*;
import luyentap2_POM.Interfaces.ListPageUI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ListPage {
    private static WebElement element = null;

    public static void List(WebDriver driver, String bug) throws InterruptedException {
        ListPageUI.Category(driver).click();
        Thread.sleep(500);
        ListPageUI.Search(driver).sendKeys(bug);
        ListPageUI.Search(driver).sendKeys(Keys.ENTER);
        Thread.sleep(500);
        ListPageUI.detail(driver).click();
        ListPageUI.cmt1(driver).click();
        ListPageUI.submit_cmt1(driver).click();
        Thread.sleep(500);
        ListPageUI.cmt2(driver).click();
        ListPageUI.submit_cmt2(driver).click();
        Thread.sleep(500);
        ListPageUI.edit_status(driver).click();
        ListPageUI.click_Status(driver).click();
        ListPageUI.select_Status(driver).click();
        ListPageUI.Save1(driver).click();
    }
}
