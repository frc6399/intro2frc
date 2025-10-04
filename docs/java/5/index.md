# 5. Methods & Functions

- [5.1. Method Declaration & Invocation](./5.1.md)
- [5.2. Parameters & Return Values](./5.2.md)
- [5.3. Method Overloading](./5.3.md)
- [5.4. Recursion](./5.4.md)
- [5.5. Variable Scope](./5.5.md)

## Practice 1: Basic Method Creation

**Description:** Create a method that greets the user by name and call it from the main method.

**Code Skeleton:**

```java
public class GreetingProgram {

    /* TODO: Create a method that takes a name and prints a greeting */
    public static void greetUser(/* TODO */) {
        /* TODO: Implement the greeting message */
    }

    public static void main(String[] args) {
        /* TODO: Call the greetUser method */
    }
}
```

**Expected Output:**

```
Hello, John! Welcome to Java programming.
```

## Practice 2: Calculator Methods

**Description:** Create separate methods for addition, subtraction, multiplication, and division operations.

**Code Skeleton:**

```java
public class Calculator {

    /* TODO: Create add method */
    public static int add(/* TODO */) {
        /* TODO: Implement addition */
    }

    /* TODO: Create subtract method */
    public static int subtract(/* TODO */) {
        /* TODO: Implement subtraction */
    }

    /* TODO: Create multiply method */
    public static int multiply(/* TODO */) {
        /* TODO: Implement multiplication */
    }

    /* TODO: Create divide method */
    public static double divide(/* TODO */) {
        /* TODO: Implement division */
    }

    public static void main(String[] args) {
        int a = 10, b = 3;

        /* TODO: Call all methods and print results */
    }
}
```

**Expected Output:**

```
Addition: 13
Subtraction: 7
Multiplication: 30
Division: 3.3333333333333335
```

## Practice 3: Method Overloading

**Description:** Create overloaded methods to calculate area for different shapes (square, rectangle, circle).

**Code Skeleton:**

```java
public class AreaCalculator {

    /* TODO: Overloaded method for square area */
    public static double calculateArea(/* TODO */) {
        /* TODO: Implement square area calculation */
    }

    /* TODO: Overloaded method for rectangle area */
    public static double calculateArea(/* TODO */) {
        /* TODO: Implement rectangle area calculation */
    }

    /* TODO: Overloaded method for circle area */
    public static double calculateArea(/* TODO */) {
        /* TODO: Implement circle area calculation */
    }

    public static void main(String[] args) {
        /* TODO: Call all overloaded methods and print results */
    }
}
```

**Expected Output:**

```
Square area: 25.0
Rectangle area: 20.0
Circle area: 78.53981633974483
```

## Practice 4: Recursive Factorial

**Description:** Implement a recursive method to calculate the factorial of a number.

**Code Skeleton:**

```java
public class FactorialCalculator {

    /* TODO: Create recursive factorial method */
    public static int factorial(/* TODO */) {
        /* TODO: Implement base case and recursive case */
    }

    public static void main(String[] args) {
        int number = 5;

        /* TODO: Call factorial method and print result */
    }
}
```

**Expected Output:**

```
Factorial of 5 is: 120
```

## Practice 5: Prime Number Checker

**Description:** Create a method that checks if a number is prime and returns a boolean value.

**Code Skeleton:**

```java
public class PrimeChecker {

    /* TODO: Create isPrime method that returns boolean */
    public static boolean isPrime(/* TODO */) {
        /* TODO: Implement prime number checking logic */
    }

    public static void main(String[] args) {
        int number = 17;

        /* TODO: Call isPrime method and print result */
    }
}
```

**Expected Output:**

```
17 is a prime number: true
```

## Practice 6: Variable Scope Demonstration

**Description:** Demonstrate the concept of local variables, parameters, and instance variables.

**Code Skeleton:**

```java
public class ScopeDemo {
    /* TODO: Declare an instance variable */

    /* TODO: Create a method that demonstrates variable scope */
    public static void demonstrateScope(/* TODO */) {
        /* TODO: Declare local variables */

        /* TODO: Show usage of different variables */
    }

    public static void main(String[] args) {
        /* TODO: Call demonstrateScope method */
    }
}
```

**Expected Output:**

```
Instance variable: 10
Parameter value: 5
Local variable: 15
```

## Practice 7: String Manipulation Methods

**Description:** Create methods to reverse a string, count vowels, and check if a string is palindrome.

**Code Skeleton:**

```java
public class StringManipulator {

    /* TODO: Create method to reverse a string */
    public static String reverseString(/* TODO */) {
        /* TODO: Implement string reversal */
    }

    /* TODO: Create method to count vowels */
    public static int countVowels(/* TODO */) {
        /* TODO: Implement vowel counting */
    }

    /* TODO: Create method to check palindrome */
    public static boolean isPalindrome(/* TODO */) {
        /* TODO: Implement palindrome checking */
    }

    public static void main(String[] args) {
        String text = "racecar";

        /* TODO: Call all methods and print results */
    }
}
```

**Expected Output:**

```
Original: racecar
Reversed: racecar
Vowel count: 3
Is palindrome: true
```

## Practice 8: Array Processing Methods

**Description:** Create methods to find maximum, minimum, and average values in an array.

**Code Skeleton:**

```java
public class ArrayProcessor {

    /* TODO: Create method to find maximum value */
    public static int findMax(/* TODO */) {
        /* TODO: Implement maximum finding */
    }

    /* TODO: Create method to find minimum value */
    public static int findMin(/* TODO */) {
        /* TODO: Implement minimum finding */
    }

    /* TODO: Create method to calculate average */
    public static double calculateAverage(/* TODO */) {
        /* TODO: Implement average calculation */
    }

    public static void main(String[] args) {
        int[] numbers = {5, 2, 8, 1, 9, 3};

        /* TODO: Call all methods and print results */
    }
}
```

**Expected Output:**

```
Array: [5, 2, 8, 1, 9, 3]
Maximum: 9
Minimum: 1
Average: 4.666666666666667
```
