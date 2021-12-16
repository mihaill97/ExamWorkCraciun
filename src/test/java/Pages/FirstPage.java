package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FirstPage {
    private WebDriver driver;
    public FirstPage(WebDriver driver){this.driver=driver;}
    By MyAcc = By.xpath("//a[@class='btn btn-dark account-link js-my-account-btn']");
    By CreateAcc = By.xpath("//a[@href='https://shop.md/en/login?create_account=1']");
    By BtnLog = By.xpath("//a[@class='btn btn-dark js-init-auth-recovery-modal']");
    By IntputEmail = By.xpath("//div[contains(@class,'form-group')]//input[@name='email']");
    By Pass = By.xpath("//input[@title='At least 5 characters long']");
    By ButtonLog = By.xpath("//a[@class='btn btn-dark js-auth-direct']");
    By LogOut = By.xpath("//span[normalize-space()='Sign out']");
    By CustomerAcc = By.xpath("//a[@title='Log into your customer account']");
    By Black = By.xpath("//a[normalize-space()='Black']");
    By Clutch = By.xpath("//img[@alt='Fish Leather Clutch']");

    public void CreateAcc(){
        driver.findElement(MyAcc).click();
        driver.findElement(CreateAcc).click();
    }
    public void Login(){
        driver.findElement(MyAcc).click();
        driver.findElement(BtnLog).click();
        driver.findElement(IntputEmail).sendKeys("wowcirkle7991@gmail.com");
        driver.findElement(Pass).sendKeys("7991cmvw");
        driver.findElement( ButtonLog).click();
    }
    public void ChooseBlack(){
        driver.findElement(Black).click();
        driver.findElement(Clutch).click();
    }


}
