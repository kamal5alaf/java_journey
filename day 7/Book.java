public class Main {

    public static void main(String[] args) {

        // ===== Car Task =====

        // Create two Car objects
        Car car1 = new Car("Lexus", "S155", 2015);
        Car car2 = new Car("Toyota", "S288", 2023);

        // Change one field on one object and verify the other is unaffected
        car1.make = "Mercedes";

        // Create third car
        Car car3 = new Car();

        // Print totalCars and verify it's 3
        System.out.println("Total Cars = " + Car.totalCars);

        // Call display() on both objects
        car1.display();
        car2.display();

        // ===== Book Task =====

        // Create 4 books using different constructors
        Book b1 = new Book("Clean Code", "Robert Martin", 2008);
        Book b2 = new Book("Effective Java", "Joshua Bloch");
        Book b3 = new Book("Java Basics", "John Smith", 2022);
        Book b4 = new Book("Algorithms", "Mark Allen");

        // Call checkout() on 2 books
        b1.checkout();
        b2.checkout();

        // Return 1 of those books
        b1.returnBook();

        // Print Book.getBookCount()
        System.out.println("Total Books = " + Book.getBookCount());

        // Call describe() on all 4 books
        b1.describe();
        b2.describe();
        b3.describe();
        b4.describe();
    }
}

// ======================================================
// Task: Create a Car class with fields make, model, year
// ======================================================

class Car {

    String make;
    String model;
    int year;

    // Task: Add a static int totalCars
    static int totalCars = 0;

    // Task: Full constructor
    public Car(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
        totalCars++;
    }

    // Task: No-arg constructor using this(...)
    public Car() {
        this("Unknown", "Unknown", 2024);
    }

    // Task: display() method
    public void display() {
        System.out.println(
                "Make: " + make +
                        ", Model: " + model +
                        ", Year: " + year);
    }
}

// ======================================================
// Task: Build a Book class
// ======================================================

class Book {

    // Task: Fields
    private String title;
    private String author;
    private int year;
    private boolean isAvailable;
    private static int bookCount;

    // Task: Full constructor
    public Book(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
        this.isAvailable = true;
        bookCount++;
    }

    // Task: Two-argument constructor using this(...)
    public Book(String title, String author) {
        this(title, author, 2024);
    }

    // Task: checkout()
    public void checkout() {
        isAvailable = false;
        System.out.println(title + " has been checked out.");
    }

    // Task: returnBook()
    public void returnBook() {
        isAvailable = true;
        System.out.println(title + " has been returned.");
    }

    // Task: describe()
    public void describe() {
        System.out.println(
                "Title: " + title +
                        ", Author: " + author +
                        ", Year: " + year +
                        ", Available: " + isAvailable);
    }

    // Task: static int getBookCount()
    public static int getBookCount() {
        return bookCount;
    }
}