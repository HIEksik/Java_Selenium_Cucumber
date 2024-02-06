Feature: US1006 Kullanici facebook'a kayit icin form doldurabilmeli
  @wip
  Scenario: TC14 faker Class ile kullanici formu doldurulabilmeli

    Given kullanici "faceUrl" anasayfaya gider
    Then facebook cookies kabul eder
    And facebook'da yeni hesap olustur butonuna basar
    And 1 saniye bekler
    When Faker class'indan bilgilerle facebook kayit formunu doldurur
    Then 2 saniye bekler
    And facebook kayit ol tusuna basar
    Then 2 saniye bekler
    And sayfayi kapatir