Feature: US1014 Kullanici tablo olarak verilen degerlerle kayit olusturur


  Scenario Outline: TC22 Tablo olarak verilen bilgilerle kayit olusturula bilmeli

    When kullanici "editorUrl" anasayfaya gider
    Then new butonuna basar
    And "<firstname>" "<lastname>" "<position>" "<office>" "<extention>" "<startdate>" "<salary>" girer
    And Create tusuna basar
    When kullanici "<firstname>" ile arama yapar
    Then listede ilk ismin "<firstname>" icerdigini test eder
    And sayfayi kapatir

    Examples:
    |firstname|lastname|position|office|extention|startdate|salary|
    |Halil|Eksik|QA|Ankara|Senior|2024-06-23|55000|
    |Orkong|Bulut|QA|Florida|Senior|2024-06-23|95000|

