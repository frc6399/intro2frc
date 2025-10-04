# 10. Supplier & Lambdas

- [10.1. Supplier Interface](./1.md)
- [10.2. Method References](./2.md)
- [10.3. Lambda Expressions](./3.md)
- [10.4. Supplier with Streams](./4.md)

## Practice 1: Basic Supplier

**Description:** Use Supplier interface to provide current date and time.

**Code Skeleton:**

```java
import java.util.function.Supplier;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class BasicSupplier {
    public static void main(String[] args) {
        /* TODO: Create Supplier for current date time */
        Supplier<String> currentDateTime = /* TODO */;

        /* TODO: Get and print current date time */
        System.out.println("Current DateTime: " + /* TODO */);
    }
}
```

**Expected Output:**

```
Current DateTime: 2023-10-15 14:30:25
```

## Practice 2: Random Number Supplier

**Description:** Create a Supplier that generates random numbers within a range.

**Code Skeleton:**

```java
import java.util.function.Supplier;
import java.util.Random;

public class RandomSupplier {
    public static void main(String[] args) {
        /* TODO: Create Supplier for random numbers between 1-100 */
        Supplier<Integer> randomSupplier = /* TODO */;

        /* TODO: Generate and print 5 random numbers */
        for (int i = 0; i < 5; i++) {
            System.out.println("Random number " + (i + 1) + ": " + /* TODO */);
        }
    }
}
```

**Expected Output:**

```
Random number 1: 42
Random number 2: 17
Random number 3: 89
Random number 4: 5
Random number 5: 63
```

## Practice 3: Supplier with Method Reference

**Description:** Use method references with Supplier interface.

**Code Skeleton:**

```java
import java.util.function.Supplier;
import java.util.List;
import java.util.Arrays;

public class MethodReferenceSupplier {

    /* TODO: Create static method that returns a default message */
    public static String getDefaultMessage() {
        return "Hello from method reference!";
    }

    public static void main(String[] args) {
        /* TODO: Use method reference with Supplier */
        Supplier<String> messageSupplier = /* TODO */;

        /* TODO: Use constructor reference */
        Supplier<List<String>> listSupplier = /* TODO */;

        System.out.println(messageSupplier.get());
        System.out.println("Empty list: " + listSupplier.get());
    }
}
```

**Expected Output:**

```
Hello from method reference!
Empty list: []
```

## Practice 4: Supplier with Lambda Expressions

**Description:** Create various Suppliers using lambda expressions.

**Code Skeleton:**

```java
import java.util.function.Supplier;
import java.util.UUID;

public class LambdaSupplier {
    public static void main(String[] args) {
        /* TODO: Create Supplier for UUID using lambda */
        Supplier<String> uuidSupplier = /* TODO */;

        /* TODO: Create Supplier for system properties */
        Supplier<String> osSupplier = /* TODO */;

        /* TODO: Create Supplier for formatted string */
        Supplier<String> formattedSupplier = /* TODO */;

        System.out.println("Generated UUID: " + uuidSupplier.get());
        System.out.println("Operating System: " + osSupplier.get());
        System.out.println("Formatted Output: " + formattedSupplier.get());
    }
}
```

**Expected Output:**

```
Generated UUID: 550e8400-e29b-41d4-a716-446655440000
Operating System: Windows 10
Formatted Output: Current timestamp: 1697387425000
```

## Practice 5: Lazy Evaluation with Supplier

**Description:** Demonstrate lazy evaluation using Supplier for expensive operations.

**Code Skeleton:**

```java
import java.util.function.Supplier;

public class LazyEvaluation {

    /* TODO: Create method that simulates expensive operation */
    public static String expensiveOperation() {
        System.out.println("Performing expensive operation...");
        try {
            Thread.sleep(1000); // Simulate delay
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "Expensive result";
    }

    public static void main(String[] args) {
        /* TODO: Use Supplier for lazy evaluation */
        Supplier<String> lazySupplier = /* TODO */;

        System.out.println("Supplier created, but operation not performed yet");

        /* TODO: Only execute when needed */
        if (/* TODO */) {
            System.out.println("Result: " + lazySupplier.get());
        }
    }
}
```

**Expected Output:**

```
Supplier created, but operation not performed yet
Performing expensive operation...
Result: Expensive result
```

## Practice 6: Supplier in Collections

**Description:** Use Supplier to initialize collections with default values.

**Code Skeleton:**

```java
import java.util.function.Supplier;
import java.util.*;

public class CollectionSupplier {
    public static void main(String[] args) {
        /* TODO: Create Supplier for different collection types */
        Supplier<List<String>> listSupplier = /* TODO */;
        Supplier<Set<Integer>> setSupplier = /* TODO */;
        Supplier<Map<String, Integer>> mapSupplier = /* TODO */;

        /* TODO: Use Suppliers to create collections */
        List<String> names = listSupplier.get();
        Set<Integer> numbers = setSupplier.get();
        Map<String, Integer> scores = mapSupplier.get();

        /* TODO: Add some data */
        names.add("Alice");
        names.add("Bob");

        numbers.add(1);
        numbers.add(2);

        scores.put("Alice", 95);
        scores.put("Bob", 87);

        System.out.println("List: " + names);
        System.out.println("Set: " + numbers);
        System.out.println("Map: " + scores);
    }
}
```

**Expected Output:**

```
List: [Alice, Bob]
Set: [1, 2]
Map: {Alice=95, Bob=87}
```

## Practice 7: Exception Handling with Supplier

**Description:** Create a wrapper that handles exceptions in Supplier.

**Code Skeleton:**

```java
import java.util.function.Supplier;

public class SafeSupplier {

    /* TODO: Create safe supplier that handles exceptions */
    public static <T> Supplier<T> safeSupplier(Supplier<T> supplier, T defaultValue) {
        return () -> {
            try {
                return supplier.get();
            } catch (Exception e) {
                System.out.println("Exception caught: " + e.getMessage());
                return defaultValue;
            }
        };
    }

    public static void main(String[] args) {
        /* TODO: Create supplier that might throw exception */
        Supplier<Integer> unsafeSupplier = () -> {
            if (Math.random() > 0.5) {
                throw new RuntimeException("Random failure");
            }
            return 42;
        };

        /* TODO: Wrap with safe supplier */
        Supplier<Integer> safe = safeSupplier(unsafeSupplier, -1);

        /* TODO: Test multiple times */
        for (int i = 0; i < 5; i++) {
            System.out.println("Result " + (i + 1) + ": " + safe.get());
        }
    }
}
```

**Expected Output:**

```
Result 1: 42
Exception caught: Random failure
Result 2: -1
Result 3: 42
Exception caught: Random failure
Result 4: -1
Result 5: 42
```

## Practice 8: Supplier Composition

**Description:** Combine multiple Suppliers to create complex objects.

**Code Skeleton:**

```java
import java.util.function.Supplier;

class Person {
    private String name;
    private int age;
    private String email;

    public Person(String name, int age, String email) {
        this.name = name;
        this.age = age;
        this.email = email;
    }

    @Override
    public String toString() {
        return String.format("Person{name='%s', age=%d, email='%s'}", name, age, email);
    }
}

public class SupplierComposition {
    public static void main(String[] args) {
        /* TODO: Create individual suppliers */
        Supplier<String> nameSupplier = () -> "John Doe";
        Supplier<Integer> ageSupplier = () -> 25 + (int)(Math.random() * 20);
        Supplier<String> emailSupplier = () -> "john.doe" + (int)(Math.random() * 100) + "@example.com";

        /* TODO: Compose suppliers to create Person objects */
        Supplier<Person> personSupplier = () ->
            new Person(/* TODO */);

        /* TODO: Generate multiple persons */
        for (int i = 0; i < 3; i++) {
            System.out.println("Person " + (i + 1) + ": " + personSupplier.get());
        }
    }
}
```

**Expected Output:**

```
Person 1: Person{name='John Doe', age=32, email='john.doe47@example.com'}
Person 2: Person{name='John Doe', age=28, email='john.doe83@example.com'}
Person 3: Person{name='John Doe', age=41, email='john.doe12@example.com'}
```
