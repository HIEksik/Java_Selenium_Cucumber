package stepdefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.EditorPage;
import utilities.Driver;
import utilities.ReusableMethods;

public class EditorStepdefinitions {

    EditorPage editorPage=new EditorPage();
    String firstName;
    @Then("new butonuna basar")
    public void new_butonuna_basar() {
        editorPage.newButtonu.click();

    }
    @Then("tum bilgileri girer")
    public void tum_bilgileri_girer() {
        Actions actions=new Actions(Driver.getDriver()); // Tab kullanmak için oluşturduk
        Faker faker=new Faker(); // diger bilgileri otomatik doldurmak için oluşturduk
        firstName=faker.name().firstName(); // Nameyi kullanacagımız için önce kaydediyoruz sonra kullanacağız

        ReusableMethods.bekle(1);
        actions.sendKeys(firstName)
                .sendKeys(Keys.TAB)
                .sendKeys(faker.name().lastName())
                .sendKeys(Keys.TAB)
                .sendKeys(faker.name().title())
                .sendKeys(Keys.TAB)
                .sendKeys(faker.address().city())
                .sendKeys(Keys.TAB)
                .sendKeys("-")
                .sendKeys(Keys.TAB)
                .sendKeys("2024-02-07")
                .sendKeys(Keys.TAB)
                .sendKeys("40000")
                .perform();

        ReusableMethods.bekle(1);




    }
    @Then("Create tusuna basar")
    public void create_tusuna_basar() {
        editorPage.cearteButonu.click();

    }
    @When("kullanici ilk isim ile arama yapar")
    public void kullanici_ilk_isim_ile_arama_yapar() {
        editorPage.searhAramaKutusu.sendKeys(firstName);

    }
    @Then("isim bolumunde isminin oldugunu dogrular")
    public void isim_bolumunde_isminin_oldugunu_dogrular() {

        String tablodakiIlkIsimSoyIsim=editorPage.ilkIsimElementi.getText();

        Assert.assertTrue(tablodakiIlkIsimSoyIsim.contains(firstName));

        // İsimi arattıgımız zaman kaydettigimiz isimle tablodaki isimin bir birini içermesi gerekiyor

    }


    @Then("{string} {string} {string} {string} {string} {string} {string} girer")
    public void girer(String firstname, String lastname, String position, String office, String extention, String startdate, String salary) {

        Actions actions=new Actions(Driver.getDriver()); // Tab kullanmak için oluşturduk

        ReusableMethods.bekle(1);
        actions.sendKeys(firstname)
                .sendKeys(Keys.TAB)
                .sendKeys(lastname)
                .sendKeys(Keys.TAB)
                .sendKeys(position)
                .sendKeys(Keys.TAB)
                .sendKeys(office)
                .sendKeys(Keys.TAB)
                .sendKeys(extention)
                .sendKeys(Keys.TAB)
                .sendKeys(startdate)
                .sendKeys(Keys.TAB)
                .sendKeys(salary)
                .perform();

        ReusableMethods.bekle(1);

    }
    @When("kullanici {string} ile arama yapar")
    public void kullanici_ile_arama_yapar(String firstname) {
      editorPage.searhAramaKutusu.sendKeys(firstname);
    }
    @Then("listede ilk ismin {string} icerdigini test eder")
    public void listede_ilk_ismin_icerdigini_test_eder(String firstname) {

        String actualIlkisim=editorPage.ilkIsimElementi.getText();

        Assert.assertTrue(actualIlkisim.contains(firstname));

    }



}
