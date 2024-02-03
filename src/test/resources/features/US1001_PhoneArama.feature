

Feature:US1001 Kullanici istedigi urun icin arama yapabilmeli
  #Feature: user story ile aynı seviyede kullanılır .
  # Birden fazla test case icerebilri
  # TestNG ye göre düşünürsek Feature class , Scenario: test methoduna karsilik gelir


  Scenario:TC01 Kullanici phone icin arama yapabilmeli
    # Test case ile ayni seviyede kullanilir

    Given kullanici TestOtomasyon sayfasina gider
    And phone icin arama yapar
    Then aradigi urunun bulundugunu test eder
    And sayfayi kapatir

    Scenario:TC02 Kullanici dress icin arama yapabilmeli

      Given kullanici TestOtomasyon sayfasina gider
      And   dress icin arama yapar
      Then  aradigi urunun bulundugunu test eder
      And   sayfayi kapatir

  Scenario:TC03 Kullanici java icin sonuc bulamamali

    Given kullanici TestOtomasyon sayfasina gider
    And   java icin arama yapar
    Then  aradigi urunun bulunmadigini test eder
    And   sayfayi kapatir

