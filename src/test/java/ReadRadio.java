import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

import java.sql.Time;

import org.junit.*;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.support.ui.*;


public class ReadRadio extends PageBase {



    public ReadRadio(WebDriver driver){
 
        super(driver);
        driver.get("https://qter.elte.hu/Ugy.aspx/StudentCard/StudentCardTemporary");
        WebElement dropList = waitVisibiiltyAndFindElement(By.xpath("/html/body/form/table/tbody/tr/td[2]/div/div[3]/div/a"));
        dropList.click();
        stop();
        Select sel = new Select(driver.findElement(By.xpath("//select[@id='ctl00_cphMain_DdlUiiPostaCim']"))); 
        int i=0;  
        for(; i<3;i++){
            sel.selectByValue(i+"");  
            stop();
        }

        


    }

}
