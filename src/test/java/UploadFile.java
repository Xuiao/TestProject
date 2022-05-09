import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

import java.sql.Time;

import javax.lang.model.element.Element;

import org.junit.*;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.support.ui.*;


public class UploadFile extends PageBase {
    public UploadFile(WebDriver driver){
 
        super(driver);
        driver.get("https://qter.elte.hu/Ugy.aspx?ugy_id=191437");
        try{ 
             wait.until(ExpectedConditions.elementToBeClickable(By.id("ctl00_cphMain_BtnToUgyfile")));
        } catch (NoSuchElementException e) { 
             e.printStackTrace();
        }
        WebElement addPic = waitVisibiiltyAndFindElement(By.id("ctl00_cphMain_BtnToUgyfile"));
        addPic.click();
        //in this case i have already uploaded the pic once, so the system asked should change the name and the title of the file.
        driver.findElement(By.id("ctl00_cphMain_FileUploadUgyfile")).sendKeys("C:/Users/dell/.ssh/2022-wednesday-late/src/test1.png");
        driver.findElement(By.name("ctl00$cphMain$TxtUgyfileNev")).sendKeys("This is a test1 for selenium");
        stop();

        WebElement uploadPic = waitVisibiiltyAndFindElement(By.id("ctl00_cphMain_BtnUgyfileUpload"));
        uploadPic.click();
        stop();

        


    }

}
