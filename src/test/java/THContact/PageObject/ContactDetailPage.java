package THContact.PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
public class ContactDetailPage {
    private static WebElement element = null;
    //menu
    WebDriver driver;

    public ContactDetailPage(WebDriver driver) {
        this.driver = driver;
    }

    static By ContactDetail = By.xpath("(//span[@class='avatar avatar-xs']/following::a)[1]");

    public static WebElement ContactDetail(WebDriver driver) throws NoSuchElementException {
        try {
            element = driver.findElement(ContactDetail);
        } catch (Exception e) {
            System.out.println("Exceptions Caught" + e.getMessage());
        }
        return element;
    }

    public static void ContactDetails(WebDriver driver) {
        ContactDetailPage.ContactDetail(driver).click();
    }
}