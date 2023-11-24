package THClients.PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
public class ClientDetailPage {
    private static WebElement element = null;
    //menu
    WebDriver driver;

    public ClientDetailPage(WebDriver driver) {
        this.driver = driver;
    }

    static By ClientDetail = By.xpath("(//span[@class='avatar avatar-xs mr10'])[1]");

    public static WebElement ClientDetail(WebDriver driver) throws NoSuchElementException {
        try {
            element = driver.findElement(ClientDetail);
        } catch (Exception e) {
            System.out.println("Exceptions Caught" + e.getMessage());
        }
        return element;
    }

    public static void ClientDetails(WebDriver driver) {
        ClientDetailPage.ClientDetail(driver).click();
    }
}