public class week_10_1 {
    public static void main(String[] args) {
        Person p = new Person("Alice", "1234567890");
        p.display();
    }
}

class Person {
    String name;
    String phone;

    Person(String name, String phone) {
        this.name = name;
        this.phone = phone;
    }

    // Member inner class Address
    class Address {
        int House_No;
        String Street, City, State;

        Address(int House_No, String Street, String City, String State) {
            this.House_No = House_No;
            this.Street = Street;
            this.City = City;
            this.State = State;
        }

        void displayAddr() {
            System.out.println("Address: " + House_No + ", " + Street + ", " + City + ", " + State);
        }
    }

    // Member inner class DateOfBirth
    class DateOfBirth {
        int Day, Month, Year;

        DateOfBirth(int Day, int Month, int Year) {
            this.Day = Day;
            this.Month = Month;
            this.Year = Year;
        }

        void displayDOB() {
            System.out.println("Date of Birth: " + Day + "/" + Month + "/" + Year);
        }
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Phone: " + phone);

        Address addr = new Address(101, "MG Road", "Mumbai", "Maharashtra");
        addr.displayAddr();

        DateOfBirth dob = new DateOfBirth(12, 10, 2000);
        dob.displayDOB();
    }
}
