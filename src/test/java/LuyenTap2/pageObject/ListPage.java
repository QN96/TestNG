package LuyenTap2.pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class ListPage {
    private static WebElement element = null;

    //Search
    public static WebElement search(WebDriver driver) throws NoSuchElementException {
        element = driver.findElement(By.xpath("//label//input[@type='search']"));
        return element;
    }

    //Click detail task
    public static WebElement detail(WebDriver driver) throws NoSuchElementException {
        element = driver.findElement(By.xpath("(//td//a[contains(@title, 'Task info')])[1]"));
        return element;
    }


    //Nhập cmt 1
    public static WebElement cmt1(WebDriver driver) throws NoSuchElementException {
        element = driver.findElement(By.xpath("//textarea[@id='comment_description']"));
        return element;
    }

    public static WebElement submit_cmt1(WebDriver driver) throws NoSuchElementException {
        element = driver.findElement(By.xpath("//button[text()=' Post Comment']"));
        return element;
    }

    //Nhập cmt 2
    public static WebElement cmt2(WebDriver driver) throws NoSuchElementException {
        element = driver.findElement(By.xpath("//textarea[@id='comment_description']"));
        return element;
    }

    public static WebElement submit_cmt2(WebDriver driver) throws NoSuchElementException {
        element = driver.findElement(By.xpath("//button[text()=' Post Comment']"));
        return element;
    }

    //Edit status
    public static WebElement edit_status(WebDriver driver) throws NoSuchElementException {
        element = driver.findElement(By.xpath("//a[text()=' Edit task']"));
        return element;
    }

    // Click dropdown Status
    public static WebElement click_Status(WebDriver driver) throws NoSuchElementException{
        element = driver.findElement(By.xpath("//label[text()='Status']/following::div[@id='s2id_task_status_id']"));
        return element;
    }

    // Chọn option Status
    public static WebElement select_Status(WebDriver driver) throws NoSuchElementException{
        element = driver.findElement(By.xpath("//div[text()='In progress']"));
        return element;
    }
    // Save
    public static WebElement Save1(WebDriver driver) throws NoSuchElementException{
        element = driver.findElement(By.xpath("//button[text()=' Save']"));
        return element;
    }
}
