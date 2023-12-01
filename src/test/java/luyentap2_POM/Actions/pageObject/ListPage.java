package luyentap2_POM.Actions.pageObject;

import luyentap2_POM.Interfaces.ListPageUI;
import luyentap2_POM.Actions.commons.BasePage;
import org.openqa.selenium.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ListPage {
    private static WebElement element = null;
    static BasePage basePage=new BasePage();
    public static void List(WebDriver driver, String bug, String comment1, String comment2) throws InterruptedException {
        basePage.clickToElement(driver, ListPageUI.Category);
        Thread.sleep(500);
        basePage.sendKeyToElement(driver, ListPageUI.Search,bug);
        basePage.sendKeyToElement(driver, ListPageUI.Search, String.valueOf(Keys.ENTER));
        Thread.sleep(500);
        basePage.clickToElement(driver, ListPageUI.detail);
        basePage.sendKeyToElement(driver, ListPageUI.cmt1, comment1);
        basePage.clickToElement(driver, ListPageUI.submit_cmt1);
        Thread.sleep(500);
        basePage.sendKeyToElement(driver, ListPageUI.cmt1, comment2);
        basePage.clickToElement(driver, ListPageUI.submit_cmt2);
        Thread.sleep(500);
        basePage.clickToElement(driver, ListPageUI.edit_status);
        basePage.clickToElement(driver, ListPageUI.click_Status);
        basePage.clickToElement(driver, ListPageUI.select_Status);
        basePage.clickToElement(driver, ListPageUI.Save1);
    }
}
