Feature: US1015 Webuniversity sayfasında yanlis bilgilerle giris yapilamamali



  Scenario: TC23 Yanlis bilgilerle giris yapilamadıgini test eder

    Given kullanici "webUniUrl" anasayfaya gider
    Then Login Portal a kadar asagi iner
    And  Login Portal a tiklar
    And acilan ikinci window'a gecer
    And username ve password kutularina fake degerler yazdirir
    And login butonuna basin
    Then Popup'ta cikan yazinin "validation faile" oldugunu test edin
    And  Ok diyerek Popup'i kapatin
    When Ilk sayfaya geri doner
    Then Ilk sayfaya donuldugunu test eder
    And sayfayi kapatir







