import java.time.Year;

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
}