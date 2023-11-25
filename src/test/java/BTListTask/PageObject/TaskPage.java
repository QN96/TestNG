package BTListTask.PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
public class TaskPage {
    private static WebElement element = null;

    //menu
    WebDriver driver;
    public TaskPage(WebDriver driver){
        this.driver=driver;
    }

    static By importTask=By.xpath("//a[@title='Import tasks']");
    static By addmTask=By.xpath("(//a[@title='Add multiple tasks'])[2]");
    static By addTask=By.xpath("(//a[@title='Add task'])[2]");


    public static WebElement importTask(WebDriver driver) throws NoSuchElementException{
        try{
            element = driver.findElement(importTask);
        }catch (Exception e){
            System.out.println("Exceptions Caught"+e.getMessage());
        }
        return element;
    }
    public static WebElement addmTask(WebDriver driver) throws NoSuchElementException{
        try{
            element = driver.findElement(addmTask);
        }catch (Exception e){
            System.out.println("Exceptions Caught"+e.getMessage());
        }
        return element;
    }
    public static WebElement addTask(WebDriver driver) throws NoSuchElementException{
        try{
            element = driver.findElement(addTask);
        }catch (Exception e){
            System.out.println("Exceptions Caught"+e.getMessage());
        }
        return element;
    }
    public static void Task(WebDriver driver){

        TaskPage.importTask(driver).isDisplayed();
        TaskPage.addmTask(driver).isDisplayed();
        TaskPage.addTask(driver).isDisplayed();

    }
}