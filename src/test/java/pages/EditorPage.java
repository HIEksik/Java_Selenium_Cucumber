package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class EditorPage {

  public EditorPage(){
      PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//*[@*='dt-button buttons-create']")public WebElement newButtonu;
  @FindBy(xpath = "//*[@class='DTE_Form_Buttons']")public WebElement cearteButonu;
  @FindBy(xpath = "//input[@type='search']")public WebElement searhButonu;
  @FindBy(xpath = "//*[@class='sorting_1']")public WebElement ilkIsimElementi;


}
