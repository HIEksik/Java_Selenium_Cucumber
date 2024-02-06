package pages;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class SauceDemoPage {

  public SauceDemoPage(){
      PageFactory.initElements(Driver.getDriver(),this); // bu classta bu driver ı kullanacağız dedik
   }


   @FindBy(xpath = "//*[@id='user-name']")public WebElement userNameKutusu;
   @FindBy(xpath = "//*[@id='password']")public WebElement passwordKutusu;
   @FindBy(xpath = "//*[@class='submit-button btn_action']")public WebElement loginButonu;
   @FindBy(id = "item_4_title_link")public WebElement ilkUrunIsimElementi;
   @FindBy(id = "add-to-cart-sauce-labs-backpack")public WebElement addToCartButonu;

   @FindBy(xpath = "//*[@class='shopping_cart_link']")public WebElement shoppingCartLinki;

    @FindBy(id = "item_4_title_link")public WebElement sepettekiUrunIsimElementi;








}
