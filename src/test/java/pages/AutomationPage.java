package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class AutomationPage {

    public AutomationPage(){

        PageFactory.initElements(Driver.getDriver(),this);

    }

    @FindBy(xpath = "//*[@*='fa fa-lock']")public WebElement singUplLinki;
    @FindBy(xpath = "(//input[@name='email'])[2]")public WebElement singUpEmailKutusu;
}