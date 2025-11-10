public class week_10_4 {
    public static void main(String[] args) {
        JavaLanguage java = new JavaLanguage();
        java.abstraction();
        java.polymorphism();
        java.inheritance();
        java.persistence();
        java.interfaces();
    }
}

class ObjectOriented {
    void abstraction() {
        System.out.println("Abstraction method called");
    }
    void polymorphism() {
        System.out.println("Polymorphism method called");
    }
    void inheritance() {
        System.out.println("Inheritance method called");
    }
}

class JavaLanguage extends ObjectOriented {
    void persistence() {
        System.out.println("Persistence method called");
    }
    void interfaces() {
        System.out.println("Interfaces method called");
    }
}
