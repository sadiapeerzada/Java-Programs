public class week_9_7 {
    public static void main(String[] args) {
        Manager m = new Manager("Alice", 50000, "IT");
        m.showDetails();
    }
}

class Employee {
    String name;
    double salary;

    Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    void showDetails() {
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
    }
}

class Manager extends Employee {
    String department;

    Manager(String name, double salary, String department) {
        super(name, salary);
        this.department = department;
    }

    void showDetails() {
        super.showDetails();
        System.out.println("Department: " + department);
    }
}
