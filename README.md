# Palindromo Microservicio

Este proyecto es un microservicio desarrollado en Java 17 utilizando Spring Boot. Permite analizar una cadena enviada en formato JSON para determinar si es un palíndromo y calcular otras propiedades de la cadena.

## Características

- **Validación de Palíndromos: Determina si la cadena de entrada es un palíndromo.**

## Propiedades Adicionales: Calcula:

- **Longitud total de la cadena.**

- **Número de caracteres especiales.**

## Documentación API: Integración con Swagger para la descripción y prueba de los endpoints.

## Requisitos

- **Java 17**

- **Maven 3.6+**

- **Spring Boot 3.4.0**

- **Configuración del Entorno**

## Clona el repositorio:

- git clone https://github.com/Maickol96/Palindrome.git
cd palindromo

## Construye el proyecto con Maven:
- mvn clean install

## Ejecuta la aplicación:
- mvn spring-boot:run

## Uso

- Endpoint: /api/v1/palindromo

- Método: POST

- Descripción: Analiza si una cadena es un palíndromo y devuelve sus propiedades.

## Cuerpo de Ejemplo:
```json
{
  "palindromo": "anita lava la tina"
}
```
## Respuesta de Ejemplo:
```json
{
  "lengthCadena": 18,
  "isPalindromo": 1,
  "lengthCaracteresEspeciales": 0
}
```
