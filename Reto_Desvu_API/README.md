## Prerrequisitos

1. Para ejecutar por linea de comandos y por IDE, Java 11 y variable de entorno configurada
2. Para ejecutar por linea de comandos, Gradle 8.6 y variable de entorno configurada

## Ejecutando los casos de prueba

Para ejecutar el proyecto, puede ejecutar la clase PetRunner que se encuentra en al ruta  `src\test\java\PetRunner.java`  , o ejecutar desde la línea de comandos de la siguiente manera:

En el proyecto raíz:

```json
gradle test "-Dkarate.options= classpath:manage_pet.feature"
```

Para ejecutar un solo archivo `.feature` o un solo tag, ejecute en la raíz del proyecto:

```json
gradle test "-Dkarate.options=--tags @ejemplo classpath:manage_pet.feature" ```