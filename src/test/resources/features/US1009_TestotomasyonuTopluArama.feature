Feature: US1009 Kullanici verilen listedeki tum urunlari aratir


Scenario Outline: : TC17 Kullanici listedeki tum urunlerin varoldugunu test eder

  # aracanak urunler phone, java, dress, baby, iphone, samsung
  # çoklu arama yapmak için TestNg deki provider gibi orda iki katlı string bir array gönderiyordu
  # Scenario: yerine Scenario Outline: secenegini sececegiz Out dışarıdan bazı bilgiler getirecek




    Given kullanici "toUrl" anasayfaya gider
    Then "<aranacakKelime>" icin arama yapar
    And aradigi urunun bulundugunu test eder
    And 1 saniye bekler
    Then sayfayi kapatir

    Examples:
  |aranacakKelime|
  |phone         |
  |java          |
  |dress         |
  |baby          |
  |iphone        |
  |samsung       |

