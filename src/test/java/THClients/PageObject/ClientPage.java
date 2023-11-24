package THClients.PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
public class ClientPage {
    private static WebElement element = null;
    //menu
    WebDriver driver;
    public ClientPage(WebDriver driver){
        this.driver=driver;
    }

    static By Clients=By.xpath("//a[text()='Clients']");

    public static WebElement Clients(WebDriver driver) throws NoSuchElementException{
        try{
            element = driver.findElement(Clients);
        }catch (Exception e){
            System.out.println("Exceptions Caught"+e.getMessage());
        }
        return element;
    }
    public static void Client(WebDriver driver){
        ClientPage.Clients(driver).click();
    }

}