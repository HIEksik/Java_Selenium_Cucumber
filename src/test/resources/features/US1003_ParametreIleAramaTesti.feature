

  Feature: US1003 kullanici parametre olarak verilen urunu aratabilmeli


    Scenario: TC07 parametre ile arama yapilabilmeli
      Given kullanici TestOtomasyon sayfasina gider
      And   "baby" icin arama yapar
      Then  aradigi urunun bulundugunu test eder
      And   1 saniye bekler
      And  sayfayi kapatir


    Scenario:TC08 Kullanici nutella icin sonuc bulamamali
      Given kullanici TestOtomasyon sayfasina gider
      And  "nutella" icin arama yapar
      And   3 saniye bekler
      Then  aradigi urunun bulunmadigini test eder
      And   sayfayi kapatir


    Scenario: TC09 parametre ile arama yapilabilmeli
      Given kullanici TestOtomasyon sayfasina gider
      And   "İphone" icin arama yapar
      Then  aradigi urunun bulundugunu test eder
      And   sayfayi kapatir