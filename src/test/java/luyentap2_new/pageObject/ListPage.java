package luyentap2_new.pageObject;

import org.openqa.selenium.*;

public class ListPage {
    private static WebElement element = null;
    WebDriver driver;
    public ListPage(WebDriver driver){
        this.driver=driver;
    }

    //Web locator
    static By Category = By.xpath("//button[text()='Bug']");
    static By Search = By.xpath("//input[@type='search']");
    static By detail = By.xpath("(//td//a[contains(@title, 'Task info')])[1]");
    static By cmt1 = By.xpath("//textarea[@id='comment_description']");
    static By submit_cmt1 = By.xpath("//button[text()=' Post Comment']");
    static By cmt2 = By.xpath("//textarea[@id='comment_description']");
    static By submit_cmt2 = By.xpath("//button[text()=' Post Comment']");
    static By edit_status = By.xpath("//a[text()=' Edit task']");
    static By click_Status = By.xpath("//label[text()='Status']/following::div[@id='s2id_task_status_id']");
    static By select_Status = By.xpath("//div[text()='In progress']");
    static By Save1 = By.xpath("//button[text()=' Save']");

    //Text fields
    public static WebElement Category(WebDriver driver) throws NoSuchElementException{
        try{
            element = driver.findElement(Category);
        }catch (Exception e){
            System.out.println("Exceptions Caught"+e.getMessage());
        }
        return element;
    }

    public static WebElement Search(WebDriver driver) throws NoSuchElementException{
        try{
            element = driver.findElement(Search);
        }catch (Exception e){
            System.out.println("Exceptions Caught"+e.getMessage());
        }
        return element;
    }

    public static WebElement detail(WebDriver driver) throws NoSuchElementException{
        try{
            element = driver.findElement(detail);
        }catch (Exception e){
            System.out.println("Exceptions Caught"+e.getMessage());
        }
        return element;
    }

    public static WebElement cmt1(WebDriver driver) throws NoSuchElementException{
        try{
            element = driver.findElement(cmt1);
        }catch (Exception e){
            System.out.println("Exceptions Caught"+e.getMessage());
        }
        return element;
    }

    public static WebElement submit_cmt1(WebDriver driver) throws NoSuchElementException{
        try{
            element = driver.findElement(submit_cmt1);
        }catch (Exception e){
            System.out.println("Exceptions Caught"+e.getMessage());
        }
        return element;
    }

    public static WebElement cmt2(WebDriver driver) throws NoSuchElementException{
        try{
            element = driver.findElement(cmt2);
        }catch (Exception e){
            System.out.println("Exceptions Caught"+e.getMessage());
        }
        return element;
    }
    public static WebElement submit_cmt2(WebDriver driver) throws NoSuchElementException{
        try{
            element = driver.findElement(submit_cmt2);
        }catch (Exception e){
            System.out.println("Exceptions Caught"+e.getMessage());
        }
        return element;
    }
    public static WebElement edit_status(WebDriver driver) throws NoSuchElementException{
        try{
            element = driver.findElement(edit_status);
        }catch (Exception e){
            System.out.println("Exceptions Caught"+e.getMessage());
        }
        return element;
    }
    public static WebElement click_Status(WebDriver driver) throws NoSuchElementException{
        try{
            element = driver.findElement(click_Status);
        }catch (Exception e){
            System.out.println("Exceptions Caught"+e.getMessage());
        }
        return element;
    }
    public static WebElement select_Status(WebDriver driver) throws NoSuchElementException{
        try{
            element = driver.findElement(select_Status);
        }catch (Exception e){
            System.out.println("Exceptions Caught"+e.getMessage());
        }
        return element;
    }
    public static WebElement Save1(WebDriver driver) throws NoSuchElementException{
        try{
            element = driver.findElement(Save1);
        }catch (Exception e){
            System.out.println("Exceptions Caught"+e.getMessage());
        }
        return element;
    }
    public static void List(WebDriver driver, String bug) throws InterruptedException {
        ListPage.Category(driver).click();
        Thread.sleep(500);
        ListPage.Search(driver).sendKeys(bug);
        ListPage.Search(driver).sendKeys(Keys.ENTER);
        Thread.sleep(500);
        ListPage.detail(driver).click();
        ListPage.cmt1(driver).click();
        ListPage.submit_cmt1(driver).click();
        Thread.sleep(500);
        ListPage.cmt2(driver).click();
        ListPage.submit_cmt2(driver).click();
        Thread.sleep(500);
        ListPage.edit_status(driver).click();
        ListPage.click_Status(driver).click();
        ListPage.select_Status(driver).click();
        ListPage.Save1(driver).click();
    }
}
