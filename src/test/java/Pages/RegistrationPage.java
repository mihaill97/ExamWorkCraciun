package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegistrationPage {
    private WebDriver driver;
    public RegistrationPage(WebDriver driver){this.driver = driver;}

    By FirstName = By.xpath("//input[@name='firstname']");
    By LastName = By.xpath("//input[@name='lastname']");
    By Email = By.xpath("//form[@id='customer-form']//input[@name='email']");
    By Password = By.xpath("//input[contains(@class,'form-control js-child-focus js-visible-password')]");
    By Phone = By.xpath("//input[@name='phone']");
    By CheckBox = By.xpath("//input[contains(@name,'phone')]");
    By Btn = By.xpath("//button[@class='btn btn-dark form-control-submit']");

    public void TypeData(){
        driver.findElement(FirstName).sendKeys("Mihail");
        driver.findElement(LastName).sendKeys("Craciun");
        driver.findElement(Email).sendKeys("wowcirkle7991@gmail.com");
        driver.findElement(Password).sendKeys("7991cmvw");
        driver.findElement(Phone).sendKeys("+37369967783");
        driver.findElement(CheckBox).click();
        driver.findElement(Btn).click();
    }


}
