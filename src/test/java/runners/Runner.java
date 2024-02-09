package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)// 1. notasyondur Cucumber ile çalışacağını tanıttık.

@CucumberOptions( // Çalıştıracağı dosyaların yolunu ve ya dosyayı veya Class ı yazıyoruz .. Biz dosya yolunu yazdık...

       plugin = {"html:target/html-reports/rapor.html", // Gelişmiş raporlama
               "json:target/json-reports/cucumber.json", //ÖZEL olarak Raporun JSON APİ format hali istenirse verilecek
                "junit:target/xml-report/cucumber.xml"}, //ÖZEL olarak  XML raporlama istenirse verilecek


        //plugin = "html:target/cucumber-reports.html", // Rapor yazar // ( cucumber-reports )> burası Raporun ismi - Basit rapor
        features = "src/test/resources/features", // ÇAlıştıracağımız tüm feature dosyalarının dosya yolunu yazıyoruz
        glue = "stepdefinitions", // feature dosyalarını Java ile birleştiren , java ile çalışmasını sağlayan method.
        tags = "@wip", // wip tagı ile çalışmasını istedigimiz testi çalıştırıyoruz.. @wip tagı hangi testte çalıştığımızın işaretidir.
        dryRun = false // true oldugunda sadece Eksik adım varmı diye kontrol eder // eksik adımı tamamlarız// false yapıp çalıştırırız
)
public class Runner {
    // Renner Class ı boş bir Class tır
    // Ama kullandıgı notasyonlar sayesinde
    // projenin build (Neyin nerede oldugunu hangi dosyalarla çalışacağını) edilmesini ve
    // İstenen feature dosyalarının toplu olarak çalıstırılmasını saglar

    // Olusturdugumuz Class 2 notasyon kullanır 1. @RunWith () 2. @CucumberOptions

}
