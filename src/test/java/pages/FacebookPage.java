package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class FacebookPage {

    public FacebookPage(){
        PageFactory.initElements(Driver.getDriver(),this); // bu classta bu driver ı kullanacağız dedik
    }

    @FindBy(xpath = "//*[@id='email']") public WebElement emailKutusu;

    @FindBy(xpath = "//*[@id='pass']")public WebElement passwordKutusu;

    @FindBy(xpath = "//*[@name='login']") public WebElement loginbutonu;

    @FindBy(xpath = "//*[text()='Find your account and log in.']") public WebElement girisYapilamadiYaziElementi;

    @FindBy(xpath = "//*[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']")public WebElement cerateNewAccountButon;
    @FindBy(xpath = "//*[@name='websubmit']")public WebElement signUpButonu;


}
