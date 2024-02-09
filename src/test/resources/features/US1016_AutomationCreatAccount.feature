Feature:  US Kullanici yeni kayit olusturabilmeli

  @wip
  Scenario: TC24 Kullanici kayit olusturabilmeli

    Given kullanici "automationUrl" anasayfaya gider
    And user sign up linkine tiklar
    And user Create an account bolumune email adresi girer
    And signUp butonuna basar
    And user kisisel bilgilerini ve iletisim bilgilerini girer
    And user Create Account butonuna basar
    Then hesap olustugunu test edin
    And sayfayi kapatir


