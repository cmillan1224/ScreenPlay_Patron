Feature: login en myStore,
  Como un usuario, yo quiero realizar el login en la pagina de myStore

  Scenario: login en myStore
    Given el "Certificador" esta en la pagina de my store
    When Cuando ingresa al sistema con sus credenciales
    Then Entonces debería ver la pantalla de inicio de sesión exitoso

