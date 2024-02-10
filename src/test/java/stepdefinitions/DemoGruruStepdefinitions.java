package stepdefinitions;

import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pages.DemoGuruPage;
import utilities.Driver;
import utilities.ReusableMethods;

import java.util.List;

public class DemoGruruStepdefinitions {

    DemoGuruPage demoGuruPage=new DemoGuruPage();
    @Then("Company listesini consola yazdirir")
    public void company_listesini_consola_yazdirir() {
        // içermeyle ilgili şunu veya bunu içeriyormu diye sorarsa String list oluşturmamız gerekiyor daha sağlıklı
        List<String> companyIsimleriList= ReusableMethods.stringListeCevir(demoGuruPage.companyElementleriList);

        System.out.println(companyIsimleriList);

    }
    @Then("listede {int}'den fazla sirket oldugunu test eder")
    public void listede_den_fazla_sirket_oldugunu_test_eder(Integer minSirketSayisi) {

        Assert.assertTrue(demoGuruPage.companyElementleriList.size()>minSirketSayisi);
    }


    @And("{string} %Change oraninin pozitif oldugunu test eder")
    public void changeOranininPozitifOldugunuTestEder(String istenenSirket) {

        //(//tbody)[2]/tr[SatirNumarasi (i) ]/td[1]  ==> td[1] Sirket ismi , td[5]degisim miktari

        String companyNameDinamikXpath;
        String degisimMiktariDinamikXpath;
        boolean arananSirketBulunduMu=false;

        for (int i = 1; i <=demoGuruPage.companyElementleriList.size() ; i++) {
            companyNameDinamikXpath="(//tbody)[2]/tr["+i+"]/td[1]";
            degisimMiktariDinamikXpath="(//tbody)[2]/tr["+i+"]/td[5]";

            WebElement companyNameElementi= Driver.getDriver().findElement(By.xpath(companyNameDinamikXpath));
            WebElement degisimMiktariElementi= Driver.getDriver().findElement(By.xpath(degisimMiktariDinamikXpath));


            if (companyNameElementi.getText().equalsIgnoreCase(istenenSirket)){
                arananSirketBulunduMu=true;
                String istenenSirketDegisimMiktari=degisimMiktariElementi.getText();
                Assert.assertTrue("İstenen sitketin artiş yüzdesi pozitif degil",istenenSirketDegisimMiktari.contains("+"));
            }
        }

        // exception fırlatalım çünkü şirket bulunamamış ve test faild olmuş olması lazım ... mesaj yazdırırsak test passed olur

        Assert.assertTrue("Aranan sirket tabloda bulunamadı...",arananSirketBulunduMu); // aranan şirket bulunduysa zaten true olarak verecek ama bulunamazsa
        // false verip exception fırlatacak



    }
}
