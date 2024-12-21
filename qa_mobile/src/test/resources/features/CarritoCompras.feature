Feature: Tienda en linea

  @carritoCompras
  Scenario Outline: Agregar productos al carrito de compras
    Given que estoy en la aplicacion de SauceLabs
    And valido que carguen correctamente los productos en la galeria
    When agrego <unidades> del siguiente "<producto>"
    Then valido que el carrito de compras se actualice correctamente
    Examples:
      | producto | unidades |
      | Sauce Labs Backpack     | 1        |
      | Sauce Labs Bolt T-Shirt | 1        |
      | Sauce Labs Bike Light   | 2        |

