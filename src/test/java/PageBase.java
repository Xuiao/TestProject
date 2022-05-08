import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import org.junit.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.support.ui.*;


public class PageBase {

    protected WebDriver driver;
    protected WebDriverWait wait;
    protected final By bodyLocator = By.tagName("body");

    //Explicit Wait
    public PageBase(WebDriver driver){
        this.driver = driver;
        this.wait = new WebDriverWait(driver, 15);
    }

    protected WebElement waitVisibiiltyAndFindElement(By locator){
        this.wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
        return this.driver.findElement(locator);
    }

    public String getBodyText(){
        WebElement resultElement = this.waitVisibiiltyAndFindElement(bodyLocator);
        return resultElement.getText();
    }
    
    public void stop(){
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
