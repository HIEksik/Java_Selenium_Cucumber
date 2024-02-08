package stepdefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import pages.WebUniversityPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class WebUniversityStepdefinitions {
   WebUniversityPage webUniversityPage=new WebUniversityPage();


    @Then("Login Portal a kadar asagi iner")
    public void login_portal_a_kadar_asagi_iner() {

        // Login butonunu gördüğü için kaydırmıyoruz Adım Pas

        //JavascriptExecutor jse= (JavascriptExecutor) Driver.getDriver(); // JS objesi oluştur
       // jse.executeScript("arguments[0].scrollIntoView();",webUniversityPage.loginButonu); // kaydıracağın elemeni yaz
    }
    @Then("Login Portal a tiklar")
    public void login_portal_a_tiklar() {
        webUniversityPage.loginPortalElementi.click();



    }
    @Then("acilan ikinci window'a gecer")
    public void acilan_ikinci_window_a_gecer() {
        // böyle yapmasaydık ilk sayfanın window handle degerini alıp ikinci sayfanın window hanle degeriile karşılaştıracaktık
        // hangisinde oldugumuzu bulacaktık

        String ikinciTabTitle="WebDriver | Login Portal"; // ikinci sayfanın title ını kaydettik methodla geçtik
        ReusableMethods.titleIleWindowDegistir(ikinciTabTitle,Driver.getDriver());

    }
    @Then("username ve password kutularina fake degerler yazdirir")
    public void username_ve_password_kutularina_fake_degerler_yazdirir() {
        Faker faker=new Faker();
        webUniversityPage.userNameKutusu.sendKeys(faker.name().username());
        webUniversityPage.passwordKutusu.sendKeys(faker.internet().password());

        ReusableMethods.bekle(3);

    }
    @Then("login butonuna basin")
    public void login_butonuna_basin() {

        webUniversityPage.loginButonu.click();
    }
    @Then("Popup'ta cikan yazinin {string} oldugunu test edin")
    public void popup_ta_cikan_yazinin_oldugunu_test_edin(String expectedPopUpYazi) {
   // çıkan allert yazısına sağtık yapılıp yapılmadığını test ettik yapılmıyor// Java Script allert oldugunu anladı
        //Driver ımızı Allertte geçiş yapmamız lazım JS oldugu için


        String actualPopUpYazisi=Driver.getDriver().switchTo().alert().getText(); // Actual popup yazisi bu / Expected yukarıda yollandı

        Assert.assertEquals(expectedPopUpYazi,actualPopUpYazisi);


    }
    @Then("Ok diyerek Popup'i kapatin")
    public void ok_diyerek_popup_i_kapatin() {
        // driver ile Allerte geçmemiz lazım ve accep (ok ) diyerek kapatacagız
        Driver.getDriver().switchTo().alert().accept();

    }
    @When("Ilk sayfaya geri doner")
    public void ilk_sayfaya_geri_doner() {
        // 2 yol var yukarıda 1. sayfadayken window hanle degerini String olarak kaydedip burda geçiş yaparız yada
        // Title ile method kullanarak ilk sayfa title ına geçiş yapacagız

        String ilkSayfaTitle="WebDriverUniversity.com";

        ReusableMethods.titleIleWindowDegistir(ilkSayfaTitle,Driver.getDriver());

    }
    @Then("Ilk sayfaya donuldugunu test eder")
    public void ilk_sayfaya_donuldugunu_test_eder() {
        // ilk sayfanın Ana sayfanın Url i ile test edebiliriz ... Çünkü ana sayfaya geçtik .. ilk sayfa
        String expectedUrl= ConfigReader.getProperty("webUniUrl");
        String actualUrl=Driver.getDriver().getCurrentUrl();

        Assert.assertEquals(expectedUrl,actualUrl);


    }


}
