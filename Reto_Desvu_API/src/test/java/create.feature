Feature: Crear mascotas

  @crear
  Scenario: Crear una mascota
    * def mascota = read('jsonFiles/addNewPet.json')

    Given url 'https://petstore.swagger.io/v2/pet'
    And request mascota
    When method post
    Then status 200

    * def petId = response.id
    * print 'created id is: ', petId


