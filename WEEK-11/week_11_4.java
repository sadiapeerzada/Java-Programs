public class week_11_4 {
    public static void main(String[] args) {
        MultiFunctionMachine4 mfm = new MultiFunctionMachine4();
        mfm.connect();
        mfm.details();
    }
}

interface Printer4 {
    void connect();
    default void details() {
        System.out.println("Printer details: Laser, Inkjet");
    }
}

interface Scanner4 {
    void connect();
    default void details() {
        System.out.println("Scanner details: Resolution 600dpi");
    }
}

class MultiFunctionMachine4 implements Printer4, Scanner4 {
    public void connect() {
        System.out.println("Connected to MultiFunctionMachine4");
    }

    // Resolve ambiguity
    public void details() {
        Printer4.super.details();
        Scanner4.super.details();
        System.out.println("MFM combines Printer & Scanner features");
    }
}
