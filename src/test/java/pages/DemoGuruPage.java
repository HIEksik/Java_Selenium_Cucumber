package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class DemoGuruPage {

    public DemoGuruPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    // tablodaki bütün şirketlerin adını getirecegi için list yapacağız
    @FindBy(xpath = "(//tbody)[2]/tr/td[1]")public List<WebElement> companyElementleriList;
}
