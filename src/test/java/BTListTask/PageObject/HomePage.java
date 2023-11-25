package BTListTask.PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
public class HomePage {
    private static WebElement element = null;
    //menu
    WebDriver driver;
    public HomePage(WebDriver driver){
        this.driver=driver;
    }

    //Web locator
    static By text_Dashboard=By.xpath("//h4[text()='Dashboard']");
    static By menu_Tasks=By.xpath("//span[text()='Tasks']");

    public static WebElement text_Dashboard(WebDriver driver) throws NoSuchElementException{
        try{
            element = driver.findElement(text_Dashboard);
        }catch (Exception e){
            System.out.println("Exceptions Caught"+e.getMessage());
        }
        return element;
    }
    public static WebElement menu_Tasks(WebDriver driver) throws NoSuchElementException{
        try{
            element = driver.findElement(menu_Tasks);
        }catch (Exception e){
            System.out.println("Exceptions Caught"+e.getMessage());
        }
        return element;
    }

    //Page Actions
    public static void Home(WebDriver driver){
        HomePage.text_Dashboard(driver).isDisplayed();
        HomePage.menu_Tasks(driver).click();
    }
}
