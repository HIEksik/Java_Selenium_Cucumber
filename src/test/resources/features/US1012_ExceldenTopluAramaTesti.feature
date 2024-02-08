Feature: US1012 kullanici excell deki tum urunlerin stoklarini test eder


  Scenario: TC20 excell deki tum urunlerin min miktarda bulundugunu test eder

    Given kullanici "toUrl" anasayfaya gider
    Then urun excelindeki tum urunler icin arama yapip min miktarda urun oldugunu test eder
    And 1 saniye bekler
    And sayfayi kapatir