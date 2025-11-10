public class week_9_1 {
    public static void main(String[] args) {
        // Creating objects of Bus and Train
        Bus bus = new Bus();
        bus.cost();
        bus.display();

        Train train = new Train();
        train.cost();
        train.display();
    }
}

// Base class
class Vehicle {
    public void cost() {
        System.out.println("Vehicle cost is calculated.");
    }
}

// Derived class Bus
class Bus extends Vehicle {
    public void display() {
        System.out.println("This is a Bus.");
    }
}

// Derived class Train
class Train extends Vehicle {
    public void display() {
        System.out.println("This is a Train.");
    }
}
