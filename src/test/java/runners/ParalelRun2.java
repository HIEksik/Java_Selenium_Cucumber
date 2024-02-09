package runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)// 1. notasyondur Cucumber ile çalışacağını tanıttık.

@CucumberOptions( //2. notasyon Çalıştıracağı dosyaların yolunu ve ya dosyayı veya Class ı yazıyoruz .. Biz dosya yolunu yazdık...


        plugin = {"html:target/html-reports/ParalelRapor2.html", // Gelişmiş raporlama
                "json:target/json-reports/cucumber2.json", //ÖZEL olarak Raporun JSON APİ format hali istenirse verilecek
                "junit:target/xml-report/cucumber2.xml"}, //ÖZEL olarak  XML raporlama istenirse verilecek



        features = "src/test/resources/features", // ÇAlıştıracağımız tüm feature dosyalarının dosya yolunu yazıyoruz
        glue = "stepdefinitions", // feature dosyalarını Java ile birleştiren , java ile çalışmasını sağlayan method.
        tags = "@e2e", // wip tagı ile çalışmasını istedigimiz testi çalıştırıyoruz.. @wip tagı hangi testte çalıştığımızın işaretidir.
        dryRun = false // true oldugunda sadece Eksik adım varmı diye kontrol eder // eksik adımı tamamlarız// false yapıp çalıştırırız
)


public class ParalelRun2 {
}
