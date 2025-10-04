public class GreetingProgram {

    /* TODO: Create a method that takes a name and prints a greeting */
    public static void greetUser(String name) {
        /* TODO: Implement the greeting message */
        System.out.println("Hello, " + name + "! Welcome to Java programming.");
    }

    public static void main(String[] args) {
        /* TODO: Call the greetUser method */
        greetUser("John");

        // Additional demonstration of OOP concepts
        System.out.println("\n=== Advanced OOP Demonstration ===");

        // Create multiple user objects
        User user1 = new User("Sarah", 28, "Software Engineer");
        User user2 = new User("Mike", 32, "Data Scientist");
        User user3 = new User("Emily"); // Using simplified constructor

        // Display all users
        System.out.println("\n--- User Information ---");
        user1.displayUserInfo();
        user2.displayUserInfo();
        user3.displayUserInfo();

        // Personalized greetings
        System.out.println("--- Personalized Greetings ---");
        user1.personalizedGreeting();
        user2.personalizedGreeting();
        user3.personalizedGreeting();

        // Demonstrate static method and field
        System.out.println("\n--- System Information ---");
        System.out.println("Total users in system: " + User.getUserCount());

        // Demonstrate time-based greeting
        System.out.println("\n--- Time-based Greetings ---");
        Greeter.greetUser("David", 9); // Morning
        Greeter.greetUser("Lisa", 14); // Afternoon
        Greeter.greetUser("Tom", 20); // Evening
    }
}

class User {
    private String name;
    private int age;
    private String occupation;
    private static int userCount = 0;

    // Main constructor
    public User(String name, int age, String occupation) {
        this.name = name;
        this.age = age;
        this.occupation = occupation;
        userCount++;
        System.out.println("New user created: " + name);
    }

    // Overloaded constructor with default values
    public User(String name) {
        this(name, 0, "Not specified");
    }

    public void displayUserInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Occupation: " + occupation);
        System.out.println("----------------------");
    }

    public void personalizedGreeting() {
        System.out.println("Welcome, " + name + "!");
        if (!occupation.equals("Not specified")) {
            System.out.println("Great to have a " + occupation + " in our Java community!");
        }
        System.out.println(); // Empty line for readability
    }

    // Static method to get total user count
    public static int getUserCount() {
        return userCount;
    }

    // Getter methods
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getOccupation() {
        return occupation;
    }
}

class Greeter {
    public static void greetUser(String name) {
        System.out.println("Hello, " + name + "! Welcome to Java programming.");
    }

    public static void greetUser(String name, int hour) {
        String timeGreeting;
        if (hour < 12) {
            timeGreeting = "Good morning";
        } else if (hour < 18) {
            timeGreeting = "Good afternoon";
        } else {
            timeGreeting = "Good evening";
        }
        System.out.println(timeGreeting + ", " + name + "! Welcome to Java programming.");
    }
}