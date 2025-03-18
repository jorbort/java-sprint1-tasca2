# java-sprint1-tasca2
task 2 of the first sprint of the java-spring bootcamp at it academy

## Level 1 - Sales Management

### Exercise 1: Sales System with Exceptions
Implementation of a basic sales system with custom exception handling.

#### Main Classes:
- **Product**: Class representing a product with name and price.
- **Sale**: Class managing a collection of products and calculating the total.
- **EmptySaleException**: Custom exception thrown when attempting to calculate the total of a sale without products.

#### Features:
- Management of products in a sale
- Calculation of the total sale
- Custom exception handling
- Example of catching IndexOutOfBoundsException

## Level 2 - Data Entry System

### Exercise 1: Data Entry Class
Implementation of a class to manage keyboard data entry with exception handling.

#### Main Class:
- **Entry**: Class with static methods to read different types of data.

#### Implemented Methods:
Catching InputMismatchException:
- `readByte(String message)`
- `readInt(String message)`
- `readFloat(String message)`
- `readDouble(String message)`

Catching custom exceptions:
- `readChar(String message)`
- `readString(String message)`
- `readYesNo(String message)`

#### Features:
- Data entry validation
- Format error handling
- Specific management for decimal numbers (comma vs dot)
- Repeated data request until valid input

## Technologies
- Java
- Scanner for data entry
- Custom exception handling

## Installation
1. Clone the repository
2. Import the project into your IDE
3. Run the main class
