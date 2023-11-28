package luyentap2_POM.Actions.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import luyentap2_POM.Interfaces.TaskPageUI;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class TaskPage {
    private static WebElement element = null;

    public static void Task(WebDriver driver, String title, String Des, String start, String deadline ) throws InterruptedException {
        TaskPageUI.click_Tasks(driver).click();
        TaskPageUI.click_add(driver).click();
        TaskPageUI.add_title(driver).sendKeys(title);
        TaskPageUI.add_Description(driver).sendKeys(Des);
        TaskPageUI.click_Related(driver).click();
        TaskPageUI.select_Related(driver).click();
        Thread.sleep(500);
        TaskPageUI.click_Contract(driver).click();
        TaskPageUI.select_Contract(driver).click();
        TaskPageUI.click_Point(driver).click();
        TaskPageUI.select_Point(driver).click();
        TaskPageUI.click_Assign(driver).click();
        TaskPageUI.select_Assign(driver).click();
        TaskPageUI.click_Collaborators(driver).click();
        TaskPageUI.select_Collaborators(driver).click();
        TaskPageUI.click_Status(driver).click();
        TaskPageUI.select_Status(driver).click();
        TaskPageUI.click_Priority(driver).click();
        TaskPageUI.select_Priority(driver).click();
        TaskPageUI.click_Labels(driver).click();
        TaskPageUI.select_Labels(driver).click();
        TaskPageUI.start_date(driver).sendKeys(start);
        TaskPageUI.deadline(driver).sendKeys(deadline);
        TaskPageUI.Recurring(driver).click();
        TaskPageUI.Save(driver).click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(100));
        wait.until(ExpectedConditions.elementToBeClickable(LuyenTap2.pageObject.TaskPage.Save(driver)));
    }
}
