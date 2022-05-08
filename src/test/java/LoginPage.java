import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

import org.junit.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.support.ui.*;

public class LoginPage extends PageBase {
    // public LoginPage(WebDriver driver){
    //     super(driver);
    //     wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='ctl00_LoginView_ctrlLogin_UserName']")));
    //     WebElement searchIdentifier = waitVisibiiltyAndFindElement(By.xpath("//input[@id='ctl00_LoginView_ctrlLogin_UserName']"));
    //     searchIdentifier.sendKeys("L7EW4K");
    //     WebElement searchPassword = waitVisibiiltyAndFindElement(By.xpath("//input[@id='ctl00_LoginView_ctrlLogin_Password']"));
    //     searchPassword.sendKeys("xuxiaoou71410");
        
    //     WebElement clickSubmit = waitVisibiiltyAndFindElement(By.xpath("//a[@id='ctl00_LoginView_ctrlLogin_LoginLinkButton']"));
    //     clickSubmit.click();
    // }

    private By usernameBy = By.xpath("//input[@id='ctl00_LoginView_ctrlLogin_UserName']");
    private By searchPassword = By.xpath("//input[@id='ctl00_LoginView_ctrlLogin_Password']");
    private By clickSubmit = By.xpath("//a[@id='ctl00_LoginView_ctrlLogin_LoginLinkButton']");

    public LoginPage(WebDriver driver,String username, String password){
        super(driver);        
        driver.findElement(usernameBy).sendKeys(username);
        driver.findElement(searchPassword).sendKeys(password);
        driver.findElement(clickSubmit).click();
    }


    public String getBodyText(){
        WebElement resultElement = waitVisibiiltyAndFindElement(bodyLocator);
        return resultElement.getText();
    }
}
