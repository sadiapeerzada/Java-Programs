public class week_10_2 {
    public static void main(String[] args) {
        // Static methods
        Edible.Fruit.fruitDetails();
        Edible.Vegetable.vegetableDetails();

        // Non-static methods
        Edible.Fruit f = new Edible.Fruit();
        f.fruitPackaging();

        Edible.Vegetable v = new Edible.Vegetable();
        v.vegetablePackaging();
    }
}

class Edible {
    static class Fruit {
        static void fruitDetails() {
            System.out.println("Fruit Details: Apples, Mangoes, Bananas");
        }

        void fruitPackaging() {
            System.out.println("Fruit Packaging: Packed in cartons");
        }
    }

    static class Vegetable {
        static void vegetableDetails() {
            System.out.println("Vegetable Details: Tomato, Potato, Carrot");
        }

        void vegetablePackaging() {
            System.out.println("Vegetable Packaging: Packed in bags");
        }
    }
}
