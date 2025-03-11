# java-sprint1-tasca2
tasca 2 del primer sprint del bootcamp de java-spring it academy

## Nivel 1 - Gestión de Ventas

### Ejercicio 1: Sistema de Ventas con Excepciones
Implementación de un sistema básico de ventas con manejo de excepciones personalizadas.

#### Clases principales:
- **Producto**: Clase que representa un producto con nombre y precio.
- **Venta**: Clase que gestiona una colección de productos y calcula el total.
- **VendaBuidaException**: Excepción personalizada que se lanza cuando se intenta calcular el total de una venta sin productos.

#### Funcionalidades:
- Gestión de productos en una venta
- Cálculo del total de la venta
- Manejo de excepciones personalizadas
- Ejemplo de captura de IndexOutOfBoundsException

## Nivel 2 - Sistema de Entrada de Datos

### Ejercicio 1: Clase de Entrada de Datos
Implementación de una clase para gestionar la entrada de datos por teclado con manejo de excepciones.

#### Clase principal:
- **Entrada**: Clase con métodos estáticos para leer diferentes tipos de datos.

#### Métodos implementados:
Capturando InputMismatchException:
- `readByte(String mensaje)`
- `readInt(String mensaje)`
- `readFloat(String mensaje)`
- `readDouble(String mensaje)`

Capturando excepciones personalizadas:
- `readChar(String mensaje)`
- `readString(String mensaje)`
- `readYesNo(String mensaje)`

#### Características:
- Validación de entrada de datos
- Manejo de errores de formato
- Gestión específica para números decimales (coma vs punto)
- Solicitud repetida de datos hasta entrada válida

## Tecnologías
- Java
- Scanner para entrada de datos
- Manejo de excepciones personalizadas

## Requisitos
- JDK 8 o superior
- IDE Java (recomendado)

## Instalación
1. Clonar el repositorio
2. Importar el proyecto en tu IDE
3. Ejecutar la clase principal

## Uso
Cada ejercicio puede ser ejecutado independientemente desde su clase principal correspondiente.
