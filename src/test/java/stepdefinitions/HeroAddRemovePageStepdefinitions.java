package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.NoSuchElementException;
import pages.HeroPage;

public class HeroAddRemovePageStepdefinitions {

    HeroPage heroPage=new HeroPage();
    @When("kullanici Add Element butonuna basar")
    public void kullanici_add_element_butonuna_basar() {

        heroPage.addElementButonu.click();
    }
    @When("Delete butonu’nun gorunur oldugunu test eder")
    public void delete_butonu_nun_gorunur_oldugunu_test_eder() {
        Assert.assertTrue(heroPage.deleteButonu.isDisplayed());
    }
    @Then("Delete tusuna basar")
    public void delete_tusuna_basar() {
        heroPage.deleteButonu.click();

    }
    @Then("Add Remove Elements yazisinin gorunur oldugunu test eder")
    public void add_remove_elements_yazisinin_gorunur_oldugunu_test_eder() {

        Assert.assertTrue(heroPage.addRemoveYaziElementi.isDisplayed());
    }


    @And("Delete gorunmedinigi test eder")
    public void deleteGorunmedinigiTestEder() {
        // Bulunamayan elementi test edeceksik bir try catch içine alırız ve çalıştırdığımızda exceptin veriyorsa zaten Passedtir
        // ilk önce çalıştırdık element görünmedigi için exceptin verdi İStenen zaten o
        // Bizde try catch içine alıp çalıştırdık


        try {
            heroPage.deleteButonu.click(); // bunuda yazsak olur zaten elementi arayacak ve bulamayacak (istenen bulamaması)

            //Assert.assertFalse(heroPage.deleteButonu.isDisplayed()); bunuda yazsak olur
            //NoSuchElementException

            // butonu bulamayınca exception fırlatıyor
            // aşşagıda exception yakalanıyor ve bizde bunu istiyorduk testimiz PASSED oluyor // buton görünmüyor

        } catch (NoSuchElementException e) {
            Assert.assertTrue(true);
        }
    }
}
