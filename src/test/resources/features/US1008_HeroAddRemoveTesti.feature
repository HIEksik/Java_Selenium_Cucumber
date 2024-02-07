Feature: US1008 Kullanici Add ve Remove Butonlarini test eder


  Scenario:TC16 Kullanici Add ve Remove butonlarini kullanabilmeli

    Given kullanici "heroUrl" anasayfaya gider
    When kullanici Add Element butonuna basar
    And 2 saniye bekler
    And Delete butonu’nun gorunur oldugunu test eder
    Then Delete tusuna basar
    And Delete gorunmedinigi test eder
    And Add Remove Elements yazisinin gorunur oldugunu test eder
    And 2 saniye bekler
    And sayfayi kapatir