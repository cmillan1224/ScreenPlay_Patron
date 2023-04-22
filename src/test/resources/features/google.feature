Feature: Busqueda en google,
  Como un usuario, yo quiero realizar un busqueda en la pagina de Google

  Scenario: Busqueda de Colombia
    Given el "Certificador" esta en la pagina de google
    When el usuario busca la palabra Colombia
    Then el usuario deberia ver la palabra Colombia

