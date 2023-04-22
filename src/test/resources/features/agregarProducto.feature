Feature: Adición de productos al carrito - Búsqueda y selección de productos
  Como un cliente
  Quiero poder buscar y seleccionar productos
  Para poder agregarlos a mi carrito de compras
@TestCaseOne
  Scenario: Buscar y agregar un producto al carrito
    Given el usuario esta en la página myStore
    When cuando busca el producto "Blouse"
    And hago clic en el botón "Add to cart"
    Then debería ver un mensaje de confirmación que indica que el producto se agregó correctamente al carrito

  Scenario: Buscar y agregar múltiples productos al carrito
    Given que estoy en la página "http://automationpractice.pl/index.php"
    When busco el producto "Dress"
    And hago clic en el botón "Add to cart"
    And agrego 2 de cada uno al carrito
    Then debería ver un mensaje de confirmación que indica que los productos se agregaron correctamente al carrito

  Scenario: Agregar un producto al carrito sin seleccionar una talla
    Given que estoy en la página "http://automationpractice.pl/index.php"
    When busco el producto "Printed Dress"
    And agrego el producto al carrito sin seleccionar la "talla"
    Then debería ver un mensaje de error que indica que se debe seleccionar una talla

  Scenario: Agregar un producto al carrito sin seleccionar una cantidad
    Given que estoy en la página "http://automationpractice.pl/index.php"
    When busco el producto "Printed Dress"
    And agrego el producto al carrito sin seleccionar la "cantidad"
    Then debería ver un mensaje de error que indica que se debe seleccionar una cantidad

  Scenario: Agregar un producto al carrito que está fuera de stock
    Given que estoy en la página "http://automationpractice.pl/index.php"
    When busco el producto "Blouse"
    And agrego el producto al carrito
    And reduzco el stock del producto a 0
    And intento agregar el producto al carrito nuevamente
    Then debería ver un mensaje de error que indica que el producto está fuera de stock