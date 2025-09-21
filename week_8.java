public class week_8 {
    // Part 1: Simple display
    static class fruit1 {
        String color;
        String taste;
        int price;

        void display() {
            System.out.println("Color: " + color + ", Taste: " + taste + ", Price: " + price);
        }
    }
    // Part 2: Using setDetails() method
    static class fruit2 {
        String color;
        String taste;
        int price;

        void setDetails(String c, String t, int p) {
            color = c;
            taste = t;
            price = p;
        }

        void display() {
            System.out.println("Color: " + color + ", Taste: " + taste + ", Price: " + price);
        }
    }
    // Part 3, 4, 5: Using constructors, overloading, and chaining
    static class fruit3 {
        String color;
        String taste;
        int price;

        // Default constructor
        fruit3() {
            this("Unknown", "Unknown", 0); // constructor chaining
        }

        // One-argument constructor
        fruit3(String c) {
            this(c, "Unknown", 0); // constructor chaining
        }

        // Two-argument constructor
        fruit3(String c, String t) {
            this(c, t, 0); // constructor chaining
        }

        // Three-argument constructor
        fruit3(String c, String t, int p) {
            color = c;
            taste = t;
            price = p;
        }

        void display() {
            System.out.println("Color: " + color + ", Taste: " + taste + ", Price: " + price);
        }
    }

    public static void main(String[] args) {

        System.out.println("=== Part 1: Simple display ===");
        fruit1 f1 = new fruit1();
        f1.color = "Red";
        f1.taste = "Sweet";
        f1.price = 100;
        f1.display();

        fruit1 f2 = new fruit1();
        f2.color = "Yellow";
        f2.taste = "Sour";
        f2.price = 50;
        f2.display();

        fruit1 f3 = new fruit1();
        f3.color = "Green";
        f3.taste = "Tangy";
        f3.price = 70;
        f3.display();

        System.out.println("\n=== Part 2: Using setDetails() ===");
        fruit2 fr2_1 = new fruit2();
        fruit2 fr2_2 = new fruit2();

        fr2_1.setDetails("Red", "Sweet", 100);
        fr2_2.setDetails("Yellow", "Sour", 50);

        fr2_1.display();
        fr2_2.display();

        System.out.println("\n=== Part 3, 4, 5: Constructors + Overloading + Chaining ===");
        fruit3 fr3_1 = new fruit3(); // default constructor
        fruit3 fr3_2 = new fruit3("Red"); // one-arg constructor
        fruit3 fr3_3 = new fruit3("Yellow", "Sweet"); // two-arg constructor
        fruit3 fr3_4 = new fruit3("Green", "Tangy", 70); // three-arg constructor

        fr3_1.display();
        fr3_2.display();
        fr3_3.display();
        fr3_4.display();
    }
}
