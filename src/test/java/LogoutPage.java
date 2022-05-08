import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

import org.junit.*;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.support.ui.*;


public class LogoutPage extends PageBase {
    public LogoutPage(WebDriver driver){
        super(driver);
        WebElement searchExit = waitVisibiiltyAndFindElement(By.xpath("//a[@id='ctl00_LoginView_LoginStatus']"));        
        searchExit.click();
    }

    public String getBodyText(){
        WebElement resultElement = waitVisibiiltyAndFindElement(bodyLocator);
        return resultElement.getText();
    }
}
