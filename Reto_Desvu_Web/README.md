## Prerrequisitos

1. Para ejecutar por linea de comandos y por IDE, Java 11 y variable de entorno configurada
2. Para ejecutar por linea de comandos, Gradle 8.6 y variable de entorno configurada 

## Ejecutando los casos de prueba

Para ejecutar el proyecto, puede ejecutar la clase CucumberTestSuite test runner, o ejecutar desde la línea de comandos.

De forma predeterminada, las pruebas se ejecutarán con Edge.

En el proyecto raíz:

```json
gradle clean test
```
Para ejecutar un solo archivo `.feature` o un solo tag, ejecute en la raíz del proyecto:

```json
gradle clean test -Dcucumber.filter.tags="@ejemplo"