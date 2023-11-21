package LuyenTap2.pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ListPage {
    private static WebElement element;

    public static WebElement Category(WebDriver driver) {
        return driver.findElement(By.xpath("//button[text()='Bug']"));
    }
    public static WebElement search(WebDriver driver) {
        return driver.findElement(By.xpath("//input[@type='search']"));
    }

    public static WebElement detail(WebDriver driver) {
        return driver.findElement(By.xpath("(//td//a[contains(@title, 'Task info')])[1]"));
    }

    public static WebElement cmt1(WebDriver driver) {
        return driver.findElement(By.xpath("//textarea[@id='comment_description']"));
    }

    public static WebElement submit_cmt1(WebDriver driver) {
        return driver.findElement(By.xpath("//button[text()=' Post Comment']"));
    }

    public static WebElement cmt2(WebDriver driver) {
        return driver.findElement(By.xpath("//textarea[@id='comment_description']"));
    }

    public static WebElement submit_cmt2(WebDriver driver) {
        return driver.findElement(By.xpath("//button[text()=' Post Comment']"));
    }

    public static WebElement edit_status(WebDriver driver) {
        return driver.findElement(By.xpath("//a[text()=' Edit task']"));
    }

    public static WebElement click_Status(WebDriver driver) {
        return driver.findElement(By.xpath("//label[text()='Status']/following::div[@id='s2id_task_status_id']"));
    }

    public static WebElement select_Status(WebDriver driver) {
        return driver.findElement(By.xpath("//div[text()='In progress']"));
    }

    public static WebElement Save1(WebDriver driver) {
        return driver.findElement(By.xpath("//button[text()=' Save']"));
    }
}
