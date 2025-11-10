public class week_10_6 {
    public static void main(String[] args) {
        // Rectangle object
        W10P6_Rectangle rect = new W10P6_Rectangle(5, 10);
        System.out.println("Rectangle area: " + rect.area());

        // Circle object
        W10P6_Circle circle = new W10P6_Circle(7);
        System.out.println("Circle area: " + circle.area());
    }
}

// Base class Shape
class W10P6_Shape {
    double area() {
        return 0; // default
    }
}

// Rectangle class extends Shape
class W10P6_Rectangle extends W10P6_Shape {
    double length, breadth;

    W10P6_Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    @Override
    double area() {
        return length * breadth;
    }
}

// Circle class extends Shape
class W10P6_Circle extends W10P6_Shape {
    double radius;

    W10P6_Circle(double radius) {
        this.radius = radius;
    }

    @Override
    double area() {
        return 3.1416 * radius * radius;
    }
}
