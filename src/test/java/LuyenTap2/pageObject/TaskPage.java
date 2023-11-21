package LuyenTap2.pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TaskPage {
    private static WebElement element = null;

    //Click task ở thanh menu
    public static WebElement click_Tasks(WebDriver driver) throws NoSuchElementException{
        element = driver.findElement(By.xpath("//span[text()='Tasks']"));
        return element;
    }

    // Click button add task
    public static WebElement click_add(WebDriver driver) throws NoSuchElementException{
        element = driver.findElement(By.xpath("//a[text()=' Add task']"));
        return element;
    }

    // Nhập title
    public static WebElement add_title(WebDriver driver) throws NoSuchElementException{
        element = driver.findElement(By.xpath("//input[@id='title']"));
        return element;
    }

    // Nhập description
    public static WebElement add_Description(WebDriver driver) throws NoSuchElementException{
        element = driver.findElement(By.xpath("//textarea[@id='description']"));
        return element;
    }

    // Click dropdown Related to
    public static WebElement click_Related(WebDriver driver) throws NoSuchElementException{
        element = driver.findElement(By.xpath("//label[text()='Related to']/following::div[@id='s2id_task-context']"));
        return element;
    }

    // Chọn option Related to
    public static WebElement select_Related(WebDriver driver) throws NoSuchElementException{
        element = driver.findElement(By.xpath("//div[text()='Client']"));
        return element;
    }

    // Click dropdown Client
    public static WebElement click_Contract(WebDriver driver) throws NoSuchElementException{
        element = driver.findElement(By.xpath("//label[text()='Related to']/following::div[@id='s2id_client_id']"));
        return element;
    }

    // Chọn option Client
    public static WebElement select_Contract(WebDriver driver) throws NoSuchElementException{
        element = driver.findElement(By.xpath("//div[text()='Demo Client']"));
        return element;
    }

    // Click dropdown Point
    public static WebElement click_Point(WebDriver driver) throws NoSuchElementException{
        element = driver.findElement(By.xpath("//label[text()='Points                        ']/following::div[@id='s2id_autogen18']"));
        return element;
    }

    // Chọn option Point
    public static WebElement select_Point(WebDriver driver) throws NoSuchElementException{
        element = driver.findElement(By.xpath("//div[text()='2 Points']"));
        return element;
    }

    // Click dropdown Assign to
    public static WebElement click_Assign(WebDriver driver) throws NoSuchElementException{
        element = driver.findElement(By.xpath("//label[text()='Assign to']/following::div[@id='s2id_assigned_to']"));
        return element;
    }

    // Chọn option Assign to
    public static WebElement select_Assign(WebDriver driver) throws NoSuchElementException{
        element = driver.findElement(By.xpath("//div[text()='Michael Wood']"));
        return element;
    }

    // Click dropdown Collaborators
    public static WebElement click_Collaborators(WebDriver driver) throws NoSuchElementException{
        element = driver.findElement(By.xpath("//label[text()='Collaborators']/following::div[@id='s2id_collaborators']"));
        return element;
    }

    // Chọn option Collaborators
    public static WebElement select_Collaborators(WebDriver driver) throws NoSuchElementException{
        element = driver.findElement(By.xpath("//div[text()='Sara Ann']"));
        return element;
    }

    // Click dropdown Status
    public static WebElement click_Status(WebDriver driver) throws NoSuchElementException{
        element = driver.findElement(By.xpath("//label[text()='Status']/following::div[@id='s2id_task_status_id']"));
        return element;
    }

    // Chọn option Status
    public static WebElement select_Status(WebDriver driver) throws NoSuchElementException{
        element = driver.findElement(By.xpath("//div[text()='To do']"));
        return element;
    }

    // Click dropdown Priority
    public static WebElement click_Priority(WebDriver driver) throws NoSuchElementException{
        element = driver.findElement(By.xpath("//label[text()='Priority']/following::div[@id='s2id_priority_id']"));
        return element;
    }

    // Chọn option Priority
    public static WebElement select_Priority(WebDriver driver) throws NoSuchElementException{
        element = driver.findElement(By.xpath("//div[text()='Major']"));
        return element;
    }

    // Click dropdown Labels
    public static WebElement click_Labels(WebDriver driver) throws NoSuchElementException{
        element = driver.findElement(By.xpath("//label[text()='Labels']/following::div[@id='s2id_project_labels']"));
        return element;
    }

    // Chọn option Labels
    public static WebElement select_Labels(WebDriver driver) throws NoSuchElementException{
        element = driver.findElement(By.xpath("//div[text()='Bug']"));
        return element;
    }

    // Nhập start date
    public static WebElement start_date(WebDriver driver) throws NoSuchElementException{
        element = driver.findElement(By.xpath("//input[@name='start_date']"));
        return element;
    }

    // Nhập deadline
    public static WebElement deadline(WebDriver driver) throws NoSuchElementException{
        element = driver.findElement(By.xpath("//input[@name='deadline']"));
        return element;
    }

    // Recurring
    public static WebElement Recurring(WebDriver driver) throws NoSuchElementException{
        element = driver.findElement(By.xpath("(//input[@type='checkbox'])[3]"));
        return element;
    }

    // Save
    public static WebElement Save(WebDriver driver) throws NoSuchElementException{
        element = driver.findElement(By.xpath("//button[text()=' Save']"));
        return element;
    }
}
