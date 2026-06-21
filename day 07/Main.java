import java.time.Year;

public class Main {


    static {
        System.out.println("    Console alooooooooo");
    }

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

class Test {


    BOOK Book = new Book();

}