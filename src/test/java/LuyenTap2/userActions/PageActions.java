package LuyenTap2.userActions;

import org.openqa.selenium.*;
import LuyenTap2.pageObject.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.time.Instant;

public class PageActions {
    public static void Login(WebDriver driver, String email, String password) {
        LoginPage.loadPage(driver);
        LoginPage.txtbx_Email(driver).sendKeys(Keys.chord(Keys.COMMAND, "a"));
        LoginPage.txtbx_Email(driver).sendKeys(email);
        LoginPage.txtbx_Password(driver).sendKeys(Keys.chord(Keys.COMMAND, "a"));
        LoginPage.txtbx_Password(driver).sendKeys(password);
        LoginPage.btn_Login(driver).click();
    }
    public static void TaskPage(WebDriver driver, String title, String Description, String start, String deadline) throws InterruptedException {
        TaskPage.click_Tasks(driver).click();
        TaskPage.click_add(driver).click();
        TaskPage.add_title(driver).sendKeys(title);
        TaskPage.add_Description(driver).sendKeys(Description);
        TaskPage.click_Related(driver).click();
        TaskPage.select_Related(driver).click();
        Thread.sleep(500);
        TaskPage.click_Contract(driver).click();
        TaskPage.select_Contract(driver).click();
        TaskPage.click_Point(driver).click();
        TaskPage.select_Point(driver).click();
        TaskPage.click_Assign(driver).click();
        TaskPage.select_Assign(driver).click();
        TaskPage.click_Collaborators(driver).click();
        TaskPage.select_Collaborators(driver).click();
        TaskPage.click_Status(driver).click();
        TaskPage.select_Status(driver).click();
        TaskPage.click_Priority(driver).click();
        TaskPage.select_Priority(driver).click();
        TaskPage.click_Labels(driver).click();
        TaskPage.select_Labels(driver).click();
        TaskPage.start_date(driver).sendKeys(start);
        TaskPage.deadline(driver).sendKeys(deadline);
        TaskPage.Recurring(driver).click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(TaskPage.Save(driver)));
        TaskPage.Save(driver).click();
        //wait.until(ExpectedConditions.titleContains("Đợi loading"));

    }
    public static void ListPage(WebDriver driver, String search, String cmt1, String cmt2 ) throws InterruptedException {
        ListPage.search(driver).sendKeys(search);
        ListPage.search(driver).sendKeys(Keys.ENTER);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(TaskPage.Save(driver)));
        ListPage.detail(driver).click();
        ListPage.cmt1(driver).click();
        ListPage.cmt1(driver).sendKeys(cmt1);
        ListPage.submit_cmt1(driver).click();
        WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait1.until(ExpectedConditions.elementToBeClickable(TaskPage.Save(driver)));
        ListPage.cmt2(driver).click();
        ListPage.cmt2(driver).sendKeys(cmt2);
        ListPage.submit_cmt2(driver).click();
        ListPage.edit_status(driver).click();
        ListPage.click_Status(driver).click();
        ListPage.select_Status(driver).click();
        ListPage.Save1(driver).click();
    }
}
