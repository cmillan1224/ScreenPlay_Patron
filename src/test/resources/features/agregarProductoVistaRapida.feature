Feature: Adición de productos al carrito - Búsqueda y selección de productos
  Como un cliente Quiero poder buscar y seleccionar productos
  Para poder agregarlos a mi carrito de compras desde el Quick View

  @TestCaseOne
  Scenario: Buscar y agregar un producto al carrito desde la vista rapida
    Given el usuario esta en la pagina myStore
    When cuando busca el producto "Dresses"
    And agrega el producto que desea al carrito
    Then deberia ver un mensaje de confirmacion que indica que el producto se agrego correctamente al carrito

  @TestCaseTwo
  Scenario: Buscar y agregar múltiples productos al carrito desde la vista rapida
    Given el usuario se encuentra en la pagina myStore
    When busca el tipo de producto que quiere "Dresses"
    And agrega los productos que desea al carrito de compras
    Then deberia ver un mensaje de confirmacion y la cantidad de productos en el carrito

  @TestCaseThree
  Scenario Outline: Agregar un producto al carrito seleccionando la cantidad desde la vista del producto
    Given que el usuario esta en la pagina myStore
    When agrega el producto al carrito seleccionando la <cantidad>
    Then deberia ver un mensaje de confirmacion y la <cantidad> del producto en el carrito
    Examples:
      | cantidad |
      | 2        |
  @TestCaseFour
  Scenario: Agregar un producto al carrito seleccionando la talla desde la vista del producto
    Given el usuario esta en la pagina my Store
    When agrega el producto al carrito seleccionando la talla deseada
    Then deberia ver un mensaje de confirmacion que indica que el producto se agrego correctamente
  @TestCaseFive
  Scenario: Agregar un producto al carrito seleccionando el color desde la vista del producto
    Given usuario esta en la pagina my Store
    When agrega el producto al carrito seleccionando el color deseado
    Then deberia ver un mensaje de confirmacion indicando que el producto se agrego correctamente
  @TestCaseSix
  Scenario: Agregar un producto al carrito eliminarlo del carrito y volverlo anadir
    Given que usuario esta comprando un producto en myStore
    When agrega el producto seleccionado al carrito
    And voy al carrito de compras y elimino el producto
    And lo vuelvo agregar al carrito de compras
    Then deberia ver que el carrito contenga el producto