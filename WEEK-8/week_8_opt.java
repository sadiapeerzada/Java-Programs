    class Car {
    // Data members
    private String model;
    private String color;
    private int price;

    // Default constructor
    Car() {
        this("Unknown", "Unknown", 0); // constructor chaining
    }

    // One-argument constructor (model only)
    Car(String model) {
        this(model, "Unknown", 0); // constructor chaining
    }

    // Two-argument constructor (model + color)
    Car(String model, String color) {
        this(model, color, 0); // constructor chaining
    }

    // Three-argument constructor
    Car(String model, String color, int price) {
        this.model = model;
        this.color = color;
        this.price = price;
    }

    // Set details using setters
    void setDetails(int price) {
        this.price = price;
    }

    // Get details using getters
    String getModel() {
        return model;
    }

    String getColor() {
        return color;
    }

    int getPrice() {
        return price;
    }

    // Display all details
    void display() {
        System.out.println("Model: " + model + ", Color: " + color + ", Price: " + price);
    }
}

    public class week_8_opt {
        public static void main(String[] args) {
            // Create objects using different constructors
            Car car1 = new Car(); // default constructor
            Car car2 = new Car("Honda"); // one-arg constructor
            Car car3 = new Car("Toyota", "Red"); // two-arg constructor

            // Set price using setDetails()
            car1.setDetails(500000);
            car2.setDetails(700000);
            car3.setDetails(900000);

            // Display details of all cars
            System.out.println("=== Car 1 ===");
            car1.display();
            System.out.println("=== Car 2 ===");
            car2.display();
            System.out.println("=== Car 3 ===");
            car3.display();
        }
    }

