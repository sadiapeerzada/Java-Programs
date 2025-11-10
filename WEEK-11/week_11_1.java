public class week_11_1 {
    public static void main(String[] args) {
        SavingAcc1 saving = new SavingAcc1();
        CurrentAcc1 current = new CurrentAcc1();

        saving.deposit();
        saving.withdraw();
        Account1.aboutBank();  // Call static method via interface

        current.deposit();
        current.withdraw();
        Account1.aboutBank();  // Call static method via interface
    }
}

// Interface
interface Account1 {
    void deposit();
    void withdraw();

    static void aboutBank() {
        System.out.println("Bank: ABC Bank - Trusted since 1990");
    }
}

// Saving class implementing Account1
class SavingAcc1 implements Account1 {
    public void deposit() {
        System.out.println("Deposit in Saving Account");
    }
    public void withdraw() {
        System.out.println("Withdraw from Saving Account");
    }
}

// Current class implementing Account1
class CurrentAcc1 implements Account1 {
    public void deposit() {
        System.out.println("Deposit in Current Account");
    }
    public void withdraw() {
        System.out.println("Withdraw from Current Account");
    }
}
