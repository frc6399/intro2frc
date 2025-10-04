public class GreetingProgramSkeleton {
    /* TODO: Create a method that takes a name and prints a greeting */
    public static void greetUser(String name) {
        // TODO: Implement the greeting message
    }

    public static void main(String[] args) {
        /* TODO: Call the greetUser method */

        // Additional demonstration of OOP concepts
        System.out.println("\n=== Advanced OOP Demonstration ===");

        // Create multiple user objects
        // TODO: Create User objects and demonstrate their usage

        // Display all users
        System.out.println("\n--- User Information ---");
        // TODO: Call displayUserInfo for each user

        // Personalized greetings
        System.out.println("--- Personalized Greetings ---");
        // TODO: Call personalizedGreeting for each user

        // Demonstrate static method and field
        System.out.println("\n--- System Information ---");
        // TODO: Display total users in the system

        // Demonstrate time-based greeting
        System.out.println("\n--- Time-based Greetings ---");
        // TODO: Call Greeter.greetUser with time-based greetings
    }
}

class User {
    private String name;
    private int age;
    private String occupation;
    private static int userCount = 0;

    // Main constructor
    public User(String name, int age, String occupation) {
        // TODO: Initialize fields and increment userCount
    }

    // Overloaded constructor with default values
    public User(String name) {
        // TODO: Call the main constructor with default values
    }

    public void displayUserInfo() {
        // TODO: Display user information
    }

    public void personalizedGreeting() {
        // TODO: Print a personalized greeting
    }

    // Static method to get total user count
    public static int getUserCount() {
        // TODO: Return the total user count
        return 0;
    }

    // Getter methods
    public String getName() {
        // TODO: Return the name
        return null;
    }

    public int getAge() {
        // TODO: Return the age
        return 0;
    }

    public String getOccupation() {
        // TODO: Return the occupation
        return null;
    }
}

class Greeter {
    public static void greetUser(String name) {
        // TODO: Print a simple greeting
    }

    public static void greetUser(String name, int hour) {
        // TODO: Print a time-based greeting
    }
}
