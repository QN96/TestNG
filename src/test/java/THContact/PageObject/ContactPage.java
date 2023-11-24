package THContact.PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
public class ContactPage {
    private static WebElement element = null;

    //menu
    WebDriver driver;
    public ContactPage(WebDriver driver){
        this.driver=driver;
    }

    static By Contacts=By.xpath("//a[text()='Contacts']");

    public static WebElement Contacts(WebDriver driver) throws NoSuchElementException{
        try{
            element = driver.findElement(Contacts);
        }catch (Exception e){
            System.out.println("Exceptions Caught"+e.getMessage());
        }
        return element;
    }
    public static void Contact(WebDriver driver){
        ContactPage.Contacts(driver).click();
    }
}