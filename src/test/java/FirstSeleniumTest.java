import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

import org.junit.*;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.support.ui.*;


public class FirstSeleniumTest {

    private WebDriver driver;
    private WebDriverWait wait;

    @Before
    public void setup() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        //10s
        wait = new WebDriverWait(driver, 10);
    }

    private final By bodyLocator = By.tagName("body");
    private WebElement waitVisibiiltyAndFindElement(By locator) {
        this.wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
        return this.driver.findElement(locator);
    }
    @Test
    public void multiplicationTest() {

        MainPage mainpage = new MainPage(this.driver);
        //because the website english one and hungarian one used the same website.
        WebElement searchEnglishBtn = waitVisibiiltyAndFindElement(By.xpath("/html/body/form/div[3]/div[2]/div/a"));
        searchEnglishBtn.click();
        
        
        Assert.assertTrue(mainpage.getBodyText().contains("Welcome to the website of Quaestura!"));
        
        

        LoginPage login = new LoginPage(this.driver,"L7EW4K", "xuxiaoou71410");
        Assert.assertTrue(login.getBodyText().contains("Logged in as"));
        
        ReadRadio readdrop = new ReadRadio(this.driver);

        UploadFile upload = new UploadFile(this.driver);


        LogoutPage logout = new LogoutPage(this.driver);
        Assert.assertTrue(logout.getBodyText().contains("using Neptun account"));


    }
    
    @After
    public void close() {
        if (driver != null) {
            driver.quit();
        }
    }
}
        // //2
        // WebElement searchRequestPassword = waitVisibiiltyAndFindElement(requestPassword);
        // searchRequestPassword.click();
        
        // //3
        // WebElement inputBarElement = waitVisibiiltyAndFindElement(inputLocator);
        // inputBarElement.sendKeys("Xu");

        // WebElement clickSubmit = waitVisibiiltyAndFindElement(submitPassword);
        // clickSubmit.click();
        
        // WebElement bodyElement = waitVisibiiltyAndFindElement(bodyLocator);
        // System.out.println(bodyElement.getText());
        // Assert.assertTrue(bodyElement.getText().contains("Xu"));
        