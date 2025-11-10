public class week_10_8 {
    public static void main(String[] args) {
        ShapeOverload shape = new ShapeOverload();
        System.out.println("Square area: " + shape.area(5));
        System.out.println("Rectangle area: " + shape.area(5, 10));
        System.out.println("Circle area: " + shape.area(7.0));
    }
}

class ShapeOverload {
    int area(int side) { // square
        return side * side;
    }

    int area(int length, int breadth) { // rectangle
        return length * breadth;
    }

    double area(double radius) { // circle
        return 3.14 * radius * radius;
    }
}
