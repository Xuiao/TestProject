import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

import org.junit.*;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.support.ui.*;


public class MainPage extends PageBase {

    public MainPage(WebDriver driver){
        super(driver);
        this.driver.get("https://qter.elte.hu");
        
        System.out.println("The Page Title is: " + driver.getTitle());
    }



    public String getBodyText(){
        WebElement resultElement = waitVisibiiltyAndFindElement(bodyLocator);
        return resultElement.getText();
    }

}
