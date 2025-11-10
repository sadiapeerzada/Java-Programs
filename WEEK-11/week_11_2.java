public class week_11_2 {
    public static void main(String[] args) {
        SavingAcc2 saving = new SavingAcc2();
        CurrentAcc2 current = new CurrentAcc2();

        saving.deposit();
        saving.withdraw();
        saving.takeLoan();           // Default method overridden in SavingAcc2
        Account2.aboutBank();        // Static method via interface

        current.deposit();
        current.withdraw();
        Account2.aboutBank();        // Static method via interface
    }
}

// Interface with default method
interface Account2 {
    void deposit();
    void withdraw();

    static void aboutBank() {
        System.out.println("Bank: XYZ Bank - Safe & Secure");
    }

    default void takeLoan() {
        System.out.println("Default takeLoan() method");
    }
}

// Saving class implements Account2 and overrides takeLoan
class SavingAcc2 implements Account2 {
    public void deposit() {
        System.out.println("Deposit in Saving Account");
    }
    public void withdraw() {
        System.out.println("Withdraw from Saving Account");
    }

    public void takeLoan() {
        System.out.println("Taking loan from Saving Account");
    }
}

// Current class implements Account2
class CurrentAcc2 implements Account2 {
    public void deposit() {
        System.out.println("Deposit in Current Account");
    }
    public void withdraw() {
        System.out.println("Withdraw from Current Account");
    }
}
