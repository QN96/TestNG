package Module2.Actions.pageObject;

import Module2.Actions.commons.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import Module2.Interfaces.PaymentPageUI;

public class PaymentPage {
    private static WebElement element = null;
    private static BasePage basePage=new BasePage();

    public static void Payment(WebDriver driver, String date, String amount, String note ) throws InterruptedException {
        basePage.clickToElement(driver, PaymentPageUI.click_Sales);
        basePage.clickToElement(driver, PaymentPageUI.click_invoices);
        basePage.clickToElement(driver, PaymentPageUI.click_add);
        basePage.clickToElement(driver, PaymentPageUI.invoice);
        basePage.clickToElement(driver, PaymentPageUI.select_invoice);
        basePage.clickToElement(driver, PaymentPageUI.payment_mothod);
        basePage.clickToElement(driver, PaymentPageUI.select_payment_mothod);
        basePage.sendKeyToElement(driver, PaymentPageUI.payment_date, date);
        Thread.sleep(2000);
        basePage.sendKeyToElement(driver, PaymentPageUI.Amount, amount);
        basePage.sendKeyToElement(driver, PaymentPageUI.Note, note);
        basePage.clickToElement(driver, PaymentPageUI.Save);
    }
}
