package Tester.Interfaces;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

//Chua tất cả actions dưới dạng method đó: click/select/verify/getText
public class LoginPageUI {
    private static WebElement element = null;
    WebDriver driver;
    public LoginPageUI(WebDriver driver){
        this.driver=driver;
    }
    //Web locator
    static By txtbx_UserName=By.xpath("//input[@placeholder='Username']");
    static By txtbx_Password=By.xpath("//input[@placeholder='Password']");
    static By btn_Login=By.xpath("//button[@type='submit']");

    //Text fields
    public static WebElement txtbx_UserName(WebDriver driver) throws NoSuchElementException{
        try{
            element = driver.findElement(txtbx_UserName);
        }catch (Exception e){
            System.out.println("Exceptions Caught"+e.getMessage());
        }
        return element;
    }
    public static WebElement txtbx_Password(WebDriver driver) throws NoSuchElementException{
        try {
            element = driver.findElement(txtbx_Password);
        }catch (Exception e){
            System.out.println("Exceptions Caught"+e.getMessage());
        }
        return element;
    }

    // Buttons
    public static WebElement btn_Login(WebDriver driver) throws NoSuchElementException{
        try {
            element = driver.findElement(btn_Login);
        }catch (Exception e){
            System.out.println("Exceptions Caught"+e.getMessage());
        }
        return element;
    }
}
