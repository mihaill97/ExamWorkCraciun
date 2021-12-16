package Settings;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class ChromeSettings {
 protected WebDriver driver;
 @Before
    public void startDriver(){
     WebDriverManager.chromedriver().setup();
     driver = new ChromeDriver();
     driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
     driver.get("https://shop.md/en/apparel");
     driver.manage().window().maximize();
 }
 @After
    public void tearDown(){
     if(driver != null)
         driver.quit();
 }
}
