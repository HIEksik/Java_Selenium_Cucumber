Feature: US1002 Kullanici Background ozelligini kullanir

  Background: anasayfaya gitme
    Given kullanici TestOtomasyon sayfasina gider

    @smoke
  Scenario:TC04 Kullanici phone icin arama yapabilmeli
    And phone icin arama yapar
    Then aradigi urunun bulundugunu test eder
    And sayfayi kapatir

  Scenario:TC05 Kullanici dress icin arama yapabilmeli
    And   dress icin arama yapar
    Then  aradigi urunun bulundugunu test eder
    And   sayfayi kapatir

  Scenario:TC06 Kullanici java icin sonuc bulamamali
    And   java icin arama yapar
    Then  aradigi urunun bulunmadigini test eder
    And   sayfayi kapatir