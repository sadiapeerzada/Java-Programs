public class week_9_8 {
    public static void main(String[] args) {
        WashingMachine wm = new WashingMachine("LG", 2000);
        Refrigerator rf = new Refrigerator("Samsung", 1500);

        wm.turnOn();
        wm.turnOff();

        rf.turnOn();
        rf.turnOff();
    }
}

abstract class Appliance {
    String brand;
    int power;

    Appliance(String brand, int power) {
        this.brand = brand;
        this.power = power;
    }

    abstract void turnOn();
    abstract void turnOff();
}

class WashingMachine extends Appliance {
    WashingMachine(String brand, int power) {
        super(brand, power);
    }

    void turnOn() {
        System.out.println(brand + " Washing Machine is ON.");
    }

    void turnOff() {
        System.out.println(brand + " Washing Machine is OFF.");
    }
}

class Refrigerator extends Appliance {
    Refrigerator(String brand, int power) {
        super(brand, power);
    }

    void turnOn() {
        System.out.println(brand + " Refrigerator is ON.");
    }

    void turnOff() {
        System.out.println(brand + " Refrigerator is OFF.");
    }
}
