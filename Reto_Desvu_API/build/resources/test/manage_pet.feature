Feature: Gestionar mascotas

  Background:
    * url 'https://petstore.swagger.io/v2'
    * call read('create.feature')

  @consultar
  Scenario: Obtener mascota por id
    Given path '/pet/' + petId
    When method get
    Then status 200

    * print 'body response GET: ', response

  @actualizar
  Scenario: Actualizar mascota
    * def upMascota = read('jsonFiles/updatePet.json')

    Given path '/pet/'
    And request upMascota
    When method put
    Then status 200
    And match response.name == 'Peanut Butter'

    * print 'body response PUT: ', response

  @eliminar
  Scenario: Eliminar mascota por id
    Given path '/pet/' + petId
    When method delete
    Then status 200

    * print 'body response DELETE: ', response