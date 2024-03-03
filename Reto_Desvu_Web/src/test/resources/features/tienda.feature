#language: es

Característica: login de usuario
  Yo como usuario deseo hacer login en la tienda
  para validar el correcto funcionamiento del aplciativo sauce

  Antecedentes:
    Dado que el usuario ingresa a la pagina
    Y ingresa con las credenciales: "standard_user" y "secret_sauce"

  @finalizar_proceso_de_compra
  Escenario: Finalizar proceso de compra de manera exitosa
    Cuando el agrega los productos: "Sauce Labs Fleece Jacket" y "Sauce Labs Backpack" al carrito
    Y finaliza el proceso de compra
    Entonces el puede vel el mensaje "Thank you for your order!"