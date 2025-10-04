# 9. Exception Handling

- [9.1. Try-Catch Blocks](./1.md)
- [9.2. Multiple Catch Blocks](./2.md)
- [9.3. Finally Block](./3.md)
- [9.4. Throwing Exceptions](./4.md)
- [9.5. Custom Exceptions](./5.md)

## Practice 1: Basic Try-Catch

**Description:** Handle division by zero exception using try-catch blocks.

**Code Skeleton:**

```java
public class BasicExceptionHandling {
    public static void main(String[] args) {
        int numerator = 10;
        int denominator = 0;

        /* TODO: Use try-catch to handle division by zero */
        try {
            int result = /* TODO */;
            System.out.println("Result: " + result);
        } catch (/* TODO */) {
            System.out.println("Error: " + /* TODO */);
        }
    }
}
```

**Expected Output:**

```
Error: / by zero
```

## Practice 2: Multiple Catch Blocks

**Description:** Handle different types of exceptions (ArithmeticException, ArrayIndexOutOfBoundsException, NumberFormatException).

**Code Skeleton:**

```java
public class MultipleCatchBlocks {
    public static void main(String[] args) {
        /* TODO: Handle multiple exceptions */
        try {
            int[] numbers = {1, 2, 3};
            System.out.println(numbers[5]); // Array index out of bounds

            String invalidNumber = "abc";
            int num = Integer.parseInt(invalidNumber); // Number format exception

            int result = 10 / 0; // Arithmetic exception
        } catch (/* TODO */) {
            System.out.println("Array index out of bounds!");
        } catch (/* TODO */) {
            System.out.println("Invalid number format!");
        } catch (/* TODO */) {
            System.out.println("Arithmetic error!");
        }
    }
}
```

**Expected Output:**

```
Array index out of bounds!
```

## Practice 3: Finally Block Usage

**Description:** Demonstrate the use of finally block for resource cleanup.

**Code Skeleton:**

```java
public class FinallyBlockDemo {
    public static void main(String[] args) {
        /* TODO: Implement try-catch-finally */
        try {
            int result = 10 / 2;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            /* TODO: Code that always executes */
            System.out.println("This always executes");
        }
    }
}
```

**Expected Output:**

```
Result: 5
This always executes
```

## Practice 4: Throwing Exceptions

**Description:** Create a method that validates age and throws an exception for invalid age.

**Code Skeleton:**

```java
public class ThrowingExceptions {

    /* TODO: Create method that throws IllegalArgumentException */
    public static void validateAge(/* TODO */) {
        if (/* TODO */) {
            throw new /* TODO */("Age must be between 0 and 150");
        }
        System.out.println("Valid age: " + age);
    }

    public static void main(String[] args) {
        /* TODO: Test with valid and invalid ages */
        try {
            validateAge(25);
            validateAge(-5);
        } catch (/* TODO */) {
            System.out.println("Caught exception: " + e.getMessage());
        }
    }
}
```

**Expected Output:**

```
Valid age: 25
Caught exception: Age must be between 0 and 150
```

## Practice 5: Custom Exception

**Description:** Create a custom exception for insufficient funds in a bank account.

**Code Skeleton:**

```java
/* TODO: Create custom exception class */
class InsufficientFundsException extends /* TODO */ {
    public InsufficientFundsException(String message) {
        super(message);
    }
}

public class CustomExceptionDemo {
    private double balance = 100.0;

    /* TODO: Create withdraw method that throws custom exception */
    public void withdraw(double amount) throws /* TODO */ {
        if (/* TODO */) {
            throw new InsufficientFundsException("Insufficient funds. Current balance: " + balance);
        }
        balance -= amount;
        System.out.println("Withdrawal successful. Remaining balance: " + balance);
    }

    public static void main(String[] args) {
        CustomExceptionDemo account = new CustomExceptionDemo();

        /* TODO: Test withdrawal with sufficient and insufficient funds */
        try {
            account.withdraw(50.0);
            account.withdraw(100.0);
        } catch (/* TODO */) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
```

**Expected Output:**

```
Withdrawal successful. Remaining balance: 50.0
Error: Insufficient funds. Current balance: 50.0
```
