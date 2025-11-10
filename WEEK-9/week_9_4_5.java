public class week_9_4_5 {
    public static void main(String[] args) {
        Saving s = new Saving(101, "Alice", "Mumbai", 5000);
        s.deposit();
        s.withdraw();
        s.display();

        Current c = new Current(102, "Bob", "Delhi", 100000);
        c.deposit();
        c.withdraw();
        c.display();
    }
}

// Abstract Account Class
abstract class Account {
    int Id;
    String Account_holder_name;
    String Address;

    Account(int Id, String name, String address) {
        this.Id = Id;
        this.Account_holder_name = name;
        this.Address = address;
    }

    abstract void deposit();
    abstract void withdraw();
}

// Saving Account
class Saving extends Account {
    double Min_balance;

    Saving(int Id, String name, String address, double Min_balance) {
        super(Id, name, address);
        this.Min_balance = Min_balance;
    }

    void deposit() {
        System.out.println("Deposit in Saving Account.");
    }

    void withdraw() {
        System.out.println("Withdraw from Saving Account with min balance: " + Min_balance);
    }

    void display() {
        System.out.println("Saving Account of " + Account_holder_name);
    }
}

// Current Account
class Current extends Account {
    double Max_withdrawal_limit;

    Current(int Id, String name, String address, double Max_withdrawal_limit) {
        super(Id, name, address);
        this.Max_withdrawal_limit = Max_withdrawal_limit;
    }

    void deposit() {
        System.out.println("Deposit in Current Account.");
    }

    void withdraw() {
        System.out.println("Withdraw from Current Account with max limit: " + Max_withdrawal_limit);
    }

    void display() {
        System.out.println("Current Account of " + Account_holder_name);
    }
}
