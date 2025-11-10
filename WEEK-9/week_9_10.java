public class week_9_10 {
    public static void main(String[] args) {
        Student s1 = new Student(1, "Alice", 90);
        Student s2 = new Student(2, "Bob", 85);

        s1.showDetails();
        s2.showDetails();

        // Change school name
        Student.changeSchoolName("XYZ School");
        s1.showDetails();
        s2.showDetails();
    }
}

class Student {
    int rollNo;
    String name;
    int marks;
    static String schoolName = "ABC School";

    Student(int rollNo, String name, int marks) {
        this.rollNo = rollNo;
        this.name = name;
        this.marks = marks;
    }

    static void changeSchoolName(String newName) {
        schoolName = newName;
    }

    void showDetails() {
        System.out.println("Roll No: " + rollNo + ", Name: " + name + ", Marks: " + marks + ", School: " + schoolName);
    }
}
